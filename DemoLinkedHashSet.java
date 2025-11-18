import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DemoLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> cities;
		cities = new LinkedHashSet<String>();       // --> This will get the elements in which they were inserted.
		
		cities.add("Mumbai");    
		cities.add("Pune");
		
		System.out.println(cities);
		System.out.println(cities.size());
		
		cities.add("Mumbai");
		System.out.println(cities);
		System.out.println(cities.contains("Mumbai"));
		
		
		//Set Methods  does not support index methods
		// eg: System.out.println(cities.get(0));
		//cities.add(1,"Delhi");
		
		// cities.clear();
	}

}
