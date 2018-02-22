package _WebElements_Methods;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _GetScreenShotAs_1 {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		
		String v = new Date().toString().replaceAll(":", "_");
		
		TakesScreenshot t = (TakesScreenshot)driver;	
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./ScreenShots/Image_"+v +".png");
		FileUtils.copyFile(srcFile, destFile);
		driver.close();	
		
//		(OR)
		
		takeScreenShot(driver, destFile);

	}

	private static void takeScreenShot(WebDriver driver, File destFile) 
	{
		TakesScreenshot t = (TakesScreenshot)driver;
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
