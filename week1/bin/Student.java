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



