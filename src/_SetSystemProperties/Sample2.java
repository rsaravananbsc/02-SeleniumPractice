package _SetSystemProperties;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample2  //OpenBrowser & Close Browser FireFox Browser
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Setting the Current Project Path for Drivers
		String key = "webdriver.firefox.driver";
		String value = ".\\Drivers\\geckodriver.exe";
		System.setProperty(key, value);
		//Creating Object for Browser
		FirefoxDriver f = new FirefoxDriver();
		f.get("https://google.com");
		//Closing the Browser
//		f.close();
		
	}

}
