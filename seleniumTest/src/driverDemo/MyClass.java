package driverDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;
import org.openqa.selenium.By;
public class MyClass {
	
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "";
		String actualTitle = "";
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the url: ");
		baseUrl = read.nextLine();
		
		try{
			driver.get(baseUrl);
		} catch (Exception e){
			System.out.println("bad url");
			//close browser
			driver.close();
			//close scanner
			read.close();
			return;
		} 
		actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		System.out.println("Enter the name of a link on this page to test it: ");
		String linkQuery = read.nextLine();
		try{
			driver.findElement(By.linkText(linkQuery)).click();
		} catch (Exception e){
			System.out.println("no link named " + linkQuery);
		}
		System.out.println("Press enter to exit.");
		read.nextLine();
		//close browser
		driver.close();
		//close scanner
		read.close();
		
	}
}
