import java.util.Vector;
import java.util.Collections;
import java.util.List;

public class DemoVector {

	public static void main(String[] args) {
		
			
			List<String> cities;
			cities = new Vector<String>();
			System.out.println(cities.size());   // gets size 
			cities.add("Mumbai");    //adding Element at last
			cities.add("Pune");      //adding Element at last
			
			//cities.add(12);       //BOXING ( PRIMITIVE TO WRAPPER )    -->  when Generics is added then we cannot add different typesjj
			System.out.println("Before " + cities);
			Collections.sort(cities);     //Collections is a class and Collection is an interface --> here sort is a static method of Collections class    --> sort will not happen if there are other type of data --> to solve this problem we can use Generics. 
			System.out.println("Before " + cities);
			
			System.out.println(cities.size());  //number of elements
			System.out.println(cities);
			cities.add(1,"Delhi");  //adding at given index
			System.out.println(cities);
			System.out.println(cities.size());
			System.out.println(cities.get(0));  //get the element at 0 index  ( Mumbai in this case )
			
			cities.remove(1);  //removes element at index 1 
			System.out.println(cities.size());
			System.out.println(cities);
			
			// cities.clear();   // clears all the elements from array list
			System.out.println(cities.size());
			System.out.println(cities);

	}

}
