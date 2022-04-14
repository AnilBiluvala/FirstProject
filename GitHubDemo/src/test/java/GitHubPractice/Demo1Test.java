package GitHubPractice;

import org.testng.annotations.Test;

public class Demo1Test {
	
	@Test
	public void demoTest()
	{
		String browser=System.getProperty("browser");
		String url=System.getProperty("url");
		System.out.println(browser);
		System.out.println(url);
	}

}
