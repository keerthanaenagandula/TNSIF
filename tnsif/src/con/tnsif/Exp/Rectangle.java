package con.tnsif.Exp;



public class Rectangle extends Shape{

	private int height = 5,width=2;
	
	public Rectangle(int height,int width)
	{
		this.width = width;
		this.height = height;
	}
	void calArea()
	{
		super.area=height*width;
	}
}



