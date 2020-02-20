package gradledemo;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicdemo {

	public static void main(String[] args) {
		@Test
		 public  void login() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1224\\Desktop\\kar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.linkedin.com/");

	}
}
