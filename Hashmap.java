package projects;
import java.util.HashMap;
public class Hashmap {
	public static void main(String[] args) {
	    // Create a HashMap object called capitalCities
	    HashMap<String, String> Candidate = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    Candidate.put("name", "Ramya");
	    Candidate.put("Qualification", "B.E");
	    Candidate.put("subject", "Mathematics");
	    Candidate.put("mobile no", "98788767980");
	    System.out.println(Candidate);
	    System.out.println(Candidate.get("Qualification"));
	    Candidate.remove("mobile no");
	    System.out.println(Candidate); 
	    System.out.println(Candidate.size());
	    Candidate.clear();
	    System.out.println(Candidate); 
	    System.out.println(Candidate.size());
	  }
}