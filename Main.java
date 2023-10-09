package projects;

public class Main {
	
	//passing parameter----
		public static void myMethod(String name, int age) 
		{
			System.out.println(name + " S" + " is " + age);	
		}
		//passing parameter using void----
		public static void add(int a, int b)
		{
			int c=a+b;
			System.out.println(c);
		}               gv 

		//passing parameter using int--.---
		public static int sub(int x, int y)
		{
			return x-y;
		}

		//Main method-----
			public static void main(String[] args)
			{
				myMethod("Ramya", 23); //passing parameter
				myMethod("Vishali", 24);
				myMethod("kajol", 51);
				
				add(3,8); //using void
				
				int z = sub(67,3); //using int
				System.out.println(z);
			}

}
