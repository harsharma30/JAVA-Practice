import java.util.*;
public class LinkedHashMapDemo{

	public static void main(String[] args) {
		Map<String,Long> population=new LinkedHashMap<>();
		population.put("India", 140L);
		population.put("Pakistan", 50L);
		population.put("Srilanka", 30L);
		population.put("China", 100L);
		population.put("Bhutan", 20L);
		System.out.println(population);
		System.out.println("Number of countries added:"+population.size());
		
		List<String> countryNames=new ArrayList<String>(population.keySet());
		System.out.println("Country names:"+countryNames);
		
		List<Long> countryPopulation=new ArrayList<Long>(population.values());
		System.out.println("Country wise population:"+countryPopulation);
	}
}