package _Popup_Handle;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload_Popup {

	public static void main(String[] args) throws InterruptedException {
		File f = new File("./CV/MyCV.docx");
		String path = f.getAbsolutePath();
		System.out.println(path);
		
		WebDriver driver = new ChromeDriver();
		driver.get("naukri.com");
		Thread.sleep(2000);
		WebElement uploadBTN = driver.findElement(By.id(("input_resumeParser")));
		uploadBTN.sendKeys(path);

	}

}
