package con.tnsif.Exp;



	public abstract class Shape {
		protected float area;
		
		abstract void calArea(); 
		
		public void show()
		{
			System.out.println("The area of shape is "+area);
		}
		
	}


