package con.tnsif.Exp;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompDemo {

	

	public static void main(String[] args) {
		ArrayList<Comp> li = new ArrayList<Comp>();
		li.add(new Comp("dell",40400,15));
		li.add(new Comp("hp",40700,16));
		li.add(new Comp("asus",40600,17));
		
		Collections.sort(li);
		for(Comp l : li)
		{
			System.out.println(l);
		}
	}

}



