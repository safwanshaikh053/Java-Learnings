package teluskolearnings;

public class StringDemo {

	public static void main(String[] args) {

		//  String Demo
		
		// As we know  String are Immutable(Cannot be changed)  So this is the way we can 
		// change String and manipulate with it. String BUffer is Mutable.
		// String BUffer is Thread Safe
		// String Buffer :

		StringBuffer sb = new StringBuffer("Safwan ");
		
		sb.append("Riyazuddin");
		sb.capacity();
		
		System.out.println(sb);
		System.out.println(sb);
	}

}
