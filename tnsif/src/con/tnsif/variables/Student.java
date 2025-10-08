package con.tnsif.variables;






 class Student{
	String name;
	int age;
	
	Student(String n,int a)
	{
		name=n;
		age=a;
	}
	
	void display() {
		System.out.println("Name: "+name +","+"Age: "+age);
	}
}

public class Local_Instance_Variables {
	
	static void products(String name, int id)
	{
		 String productName =name;
		 int productId = id;
		
		 System.out.println("Product: "+productName+","+"Product Id :"+productId);
	}

	public static void main(String[] args) {
		String name="Wheel Chair";
		int number=211;
		
		products(name,number);
		
		Student stud=new Student("Sanjay",21);
		Student stud1=new Student("Saikiran",20);
		
		stud.display();
		stud1.display();
		
		
	}

}



