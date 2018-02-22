package _Popup_Handle;

import java.time.LocalDate;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division_Popup {

	public static void main(String[] args) throws InterruptedException {
		Date d = new Date();
		String str = d.toString();
		System.out.println(str);
		String[] a = str.split(" ");
		String today = a[2];
		System.out.println(today);
		
		//FutureDate & PastDate Concept.
		
		LocalDate today1 = LocalDate.now();
		System.out.println(today1);
		System.out.println(today1.plusDays(1)); //Tomorrow Date
		System.out.println(today1.plusMonths(1)); //Next Month
		System.out.println(today1.plusYears(1)); //Next Year
		
		System.out.println(today1.plusDays(-1)); //Yesterday
		System.out.println(today1.plusMonths(-1)); //LastMonth
		System.out.println(today1.plusYears(-1)); //LastYear
		
		System.out.println(today1.plusWeeks(1));
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText(today)).click();
			
	}

}
