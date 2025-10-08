package demotest;

import org.junit.Ignore;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class demo {
	@DisplayName("Keerthana")
	@RepeatedTest(2)
	@Test
	
	public void Show()
	{
	
	System.out.println("this is show method");

}
	
@Ignore
	void sayhi()
	{
		System.out.println("this is hii method");
	}
@DisplayName("junittesting")
@Test
void hello()
{
	System.out.println("this is hello method");
	}
}