
public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("abcd");
		System.out.println(sb.length());
		sb.insert(2, "jkl");
		System.out.println(sb);     // this will print 'abjklcd'

	}

}
