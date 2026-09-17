import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DemoProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cities = new ArrayList<String>();
		cities.add("Mumbai");
		cities.add("Pune");
		cities.add("Delhi");
		cities.add("Mysore");
		cities.add("Manglore");
		
		cities.forEach(str->System.out.print(str + " "));
		
		List<String> citiesWithM = new ArrayList<String>();
		List<Integer> length = new ArrayList<Integer>();
		
		for(String city : cities) {
			if(city.startsWith("M")) {
				citiesWithM.add(city);
				
			}
		}
		System.out.println(citiesWithM);
		
		for( String city: cities) {
			int l= city.length();
			length.add(l);
			
		}
		System.out.println(length);
		
		Stream<String> streamCities = cities.stream();   //1
		Stream<String> filteredStream = streamCities.filter(c -> c.startsWith("M"));   //2
		List<String> li = filteredStream.toList();   //3
		System.out.println("Cities Starting with M :" + citiesWithM);
		
		li = cities.stream()
				   .filter(c -> c.startsWith("M"))
				   .toList();
		
		Stream<String> streamLength = cities.stream();  
		Stream<String> filteredStreamLength = streamLength.filter(c -> c.length()>=5);
		List<String> liLength = filteredStreamLength.toList(); 
		System.out.println("Length with greater than 5 String length :" + liLength);
		
		liLength = cities.stream()
				         .filter(c -> c.length()>=5)
				         .toList();
		
		
		streamCities = cities.stream();
		Stream<Integer> lengthStream = streamCities.map(s -> s.length());
		List<Integer> LengthStream = lengthStream.toList();
	
		
		LengthStream = cities.stream()
							 .map(s -> s.length())
							 .toList();
		
	
	}

}

