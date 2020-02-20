package gradledemo;

import org.testng.annotations.Test;

public class basicdemo {

	
	
		@Test
		 public  void login() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1224\\Desktop\\kar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.linkedin.com/");

	}
}
