package com.tnsif.inheritence;

public class AA {
		public void show()
		{
			System.out.println("This is A");
		}
	}

	class BB {
		public void show()
		{
			System.out.println("This is B");
		}
	}

	class CC extends AA{
		public void results()
		{
			System.out.println("Hello C");
		}
	}


