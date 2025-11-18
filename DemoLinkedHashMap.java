
import java.util.LinkedHashMap;
import java.util.Map;

public class DemoLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> cities;
		cities = new LinkedHashMap<Integer, String>();
		cities.put(22, "Mumbai");
		cities.put(11, "Delhi");
		System.out.println(cities);
		System.out.println(cities.size());
		System.out.println(cities.get(22));
		System.out.println(cities.containsKey(11));
		System.out.println(cities.containsValue("Mumbai"));
		
		//Duplicate keys not allowed
		cities.put(11, "Bangalore");  //but we already have key as 11 for Delhi --> so it will over-Write
		System.out.println(cities);
		
		//Duplicate values allowed
		cities.put(20, "Mumbai"); 
		System.out.println(cities);
		
		cities.remove(22);            // removes the key and value at that key(22=Mumbai) 
		System.out.println(cities);
		
		cities.clear();    // clears all the elements of the HashMap
	}

}
