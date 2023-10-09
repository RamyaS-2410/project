package projects;
import java.util.HashSet;

public class Hashset {
	public static void main(String[] args) {
	    HashSet<String> animals = new HashSet<String>();
	    animals.add("Dog");
	    animals.add("cat");
	    animals.add("Lion");
	    animals.add("Tiger");
	    animals.add("Beer");
	    System.out.println(animals);
	    System.out.println(animals.contains("Panda"));
	    animals.remove("Volvo");
	    System.out.println(animals);
	    System.out.println(animals.size());
	    animals.clear();
	    System.out.println(animals);
	    System.out.println(animals.size());
	  }
}
