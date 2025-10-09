package con.tnsif.variables;

public class Main {
	
		
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
			
			Student stud=new Student("keerthana",20);
			Student stud1=new Student("nikki",21);
			
			stud.display();
			stud1.display();
			
			
		}

	}




