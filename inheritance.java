package projects;

public class inheritance {
	class Employee{  
		 float salary=40000;  
		}  
		class Programmer extends Employee{  
		 int bonus=10000;  
		 public static void main(String args[]){  
		   Programmer p = newProgrammer();  
		   System.out.println("Programmer salary is:"+p.salary);  
		   System.out.println("Bonus of Programmer is:"+p.bonus);  
		}  
        }  
}
