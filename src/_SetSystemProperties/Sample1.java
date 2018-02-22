package _SetSystemProperties;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1  //OpenBrowser & Close Browser Chrome Browser
{
	public static void main(String[] args) 
	{
		//Setting the Current Project Path for Drivers
		String key = "webdriver.chrome.driver";
		String value = "D:\\Oxygen\\WorkSpace-JavaSelenium\\Selenium-Practice\\Drivers\\chromedriver.exe";
		System.setProperty(key, value);
		//Creating Object for Browser
		ChromeDriver c = new ChromeDriver();
		//Closing the Browser
		c.close();		
	}

}
