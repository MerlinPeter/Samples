/*
 
 * object address is different than object's hashcode,so compares the content
 *  == compares the address that is the reference
 *   equals method compares to the content
 
 */

public class ImmutableString {
	
	public static void main(String[] args) {
		
    String s1= "tekarch";
    String s2= "tekarch";
    String s3= new String("tekarch");
    String s4= new String("tekarch");
    String s5= "abc";
    //  compareTo method return integer.
    //s1=s2  0  s1>s2 positive s1<s3 negative
    System.out.println(s1.compareTo(s2));
    System.out.println(s1.compareTo(s3));
    System.out.println(s4.compareTo(s5));
    System.out.println(s5.compareTo(s1));
  	
    System.out.println();
    
    System.out.println("s1 compares s2 using equals method ="+s1.equals(s2));
    System.out.println("s1 compares s3 using equals method ="+s1.equals(s3));
    System.out.println("s4 compares s5 using equals method ="+s4.equals(s5));
    System.out.println("s1 compares s4 using equals method ="+s1.equals(s4));
    
    
    System.out.println();
    
    System.out.println("s1 compares s2 using hashcode method =" +(s1.hashCode() == s2.hashCode()));
    System.out.println("s1 compares s3 using hashcode method =" +(s1.hashCode() == s3.hashCode()));
    System.out.println("s4 compares s5 using hashcode method =" +(s4.hashCode() == s5.hashCode()));
    System.out.println("s1 compares s4 using hashcode method =" +(s1.hashCode() == s4.hashCode()));

    System.out.println();
	

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);	
      	
        System.out.println(s4 == s5);
        System.out.println(s1 == s4);

	
	
	}
}
