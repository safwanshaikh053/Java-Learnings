import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> cities;
		cities = new TreeSet<String>();       // --> This will get the elements in an order ( Ascending ).
		
		cities.add("Mumbai");    
		cities.add("Pune");
		cities.add("Delhi");
		
		// iterate using advanced for loop
		// using advanced for loop you can iterate over collection from
		// beginning to end Sequentially. We cannot modify collection .
		
		// If we want to iterate over collection object and 
		// while iterating if we want to remove a specific element from a collection
		// we should use Iterator object
		for(String city : cities) {
			System.out.println(city);
		}
		
		//step-1
		Iterator<String> i;
		i = cities.iterator();
		
		//step-2
		while(i.hasNext()) {
			//step-3
			String city = i.next();
			System.out.println(city);
			
			//step-4
			if(city.equals("Pune")) {
				i.remove();
			}
		}
		
		
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