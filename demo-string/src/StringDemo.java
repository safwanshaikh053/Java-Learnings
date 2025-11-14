//import jdk.internal.misc.FileSystemOption;

public class StringDemo {

	public static void main(String[] args) {
		String city = new String("Mumbai");
		System.out.println(city); //invokes toString() of String class
		System.out.println(city.length());
		System.out.println(city.charAt(0));
		System.out.println(city.equals("Mumbai"));
		System.out.println(city.equals("mumbai"));
		System.out.println(city.equalsIgnoreCase("mumbai")); //ignores case sensitivity
		System.out.println(city.substring(2));   //removes starting 2 elements which are 0 and 1 (m and u)
		System.out.println(city.substring(2,4));// start index is inclusive and end index is exclusive
		
		String newcity = city.replace('M', 'P');
		System.out.println(newcity);
		
		String s1 = new String("a");
		String s2 = new String("b");
		
		System.out.println("========================");
		
		System.out.println(s1.equals(s2));  //it will show true if the strings are equal
		System.out.println(s1==s2);    //it will show false even if the strings are equal because
										// the address is different in the memory
		
		
		String s3 = "a";  //creating object without new key word
		String s4 = "a";
		
		System.out.println(s3.equals(s4));  // o/p-true
		System.out.println(s3==s4);    // o/p-true
		
		
		String s = new String();
	}

}
