package webdriver.basics;
	// TODO Auto-generated method stub

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
		
		public class HmsRegistrations {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "D:\\seleniumjava file\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://selenium4testing.com/hms");
				
				driver.findElement(By.name("username")).sendKeys("admin");
				driver.findElement(By.name("password")).sendKeys("admin");
				driver.findElement(By.name("submit")).click();
				

			}

		}
		
		
		
		
		
		
		
		



