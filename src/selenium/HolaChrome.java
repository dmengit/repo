package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Firefox va por su driver, hay que importarlo. 


public class HolaChrome {
	
	public static void main(String[] args) {
		
		//debe ser url formal
		String baseURL = "http://www.google.com";
		
		//Se inicializa pasando por su driver
		System.setProperty("webdriver.chrome.driver", "C://Users//dortiz//workspace//selenium_3.4.0//chromedriver.exe");
		WebDriver driver;
		driver =new ChromeDriver();
		
			
		driver.get(baseURL);
	}
	


}
