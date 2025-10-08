package con.tnsif.Staticdemo;

public class Static {


	static String companyName="Infosys";
	
	String compName;
	
	Static(String Name){
		compName=Name;
	}
	
	public static void display() {
		System.out.println("Before Company Name :"+companyName);

	}
	public void display1() {
		System.out.println("After Company Name :"+compName);

	}
	
	static {
		System.out.println("Hello This is a Static Block....");
	}
	
}




