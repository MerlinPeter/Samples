
import java.util.*;
public class ZeroMatrixCheck
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the order of matrix.");
        int row=ob.nextInt();

        int col=ob.nextInt();
        int mat[][]=new int[row][col];
        System.out.println("Enter elements of matrix in row by column order.");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                mat[i][j]=ob.nextInt();
            }
        }
        System.out.println("The matrix entered is");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
        int flag=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(mat[i][j]!=0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
                break;
        }
        if(flag==1)
            System.out.println("The matrix entered is not a Null or Zero Matrix.");
        else
            System.out.println("The matrix entered is a Null or Zero Matrix.");
    }
}

