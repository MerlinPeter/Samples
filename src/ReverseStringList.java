

	// Java program to demonstrate working of java.utils.
	// Collections.reverse()
	import java.util.*;
	 
	public class ReverseStringList
	{
	    public static void main(String[] args)
	    {
	        // Let us create a list of strings
	        List<String>  mylist = new ArrayList<String>();
	        mylist.add("Fruit");
	        mylist.add("Vegees");
	        mylist.add("pizza");
	        mylist.add("burger");
	 
	        System.out.println("Original List : " + mylist);
	 
	        // Here we are using reverse() method
	        // to reverse the element order of mylist
	        Collections.reverse(mylist);
	 
	        System.out.println("Modified List: " + mylist);
	    }
	}
	