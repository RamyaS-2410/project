package projects;
import java.util.LinkedList;
public class Linkedlist {
	public static void main(String[] args) {
	    LinkedList<String> courses = new LinkedList<String>();
	    courses.add("software testing");
	    courses.add("Java");
	    courses.add("C");
	    courses.add("C++");
	    System.out.println(courses);
	    courses.addFirst("python");
	    System.out.println(courses);
	    courses.addLast("Ruby");
	    System.out.println(courses);
	    courses.removeFirst();
	    System.out.println(courses);
	    courses.removeLast();
	    System.out.println(courses);
	    System.out.println(courses.getFirst());
	    System.out.println(courses.getLast());
	  }
	}

