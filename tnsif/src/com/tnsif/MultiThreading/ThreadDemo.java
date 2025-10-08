package com.tnsif.MultiThreading;

public class ThreadDemo {
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				System.out.println("This is Thread");
				System.out.println(Thread.currentThread());
				Thread.sleep(2000);
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

	public void setPriority(int i) {
		// TODO Auto-generated method stub
		
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}

}
