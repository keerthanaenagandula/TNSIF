package com.tnsif.Collections;


	
	import java.util.ArrayList;
	public class Arrayone {
		public static void main(String[] args) {
			ArrayList ai = new ArrayList();
			ai.add(101);
			ai.add("Heyy guyys");
			ai.add(23.4);
			System.out.println(ai);
			ai.remove(1);
			System.out.println(ai);
			ai.add(null);
			ai.add(null);
			System.out.println(ai);
			System.out.println(ai.get(1));
			ai.add(ai);
			

		}

	

}
