package getTitle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;

public class MyClass {
	
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "";
		String actualTitle = "";
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the url: ");
		baseUrl = read.nextLine();
		//launch browser @ baseUrl
		
		//retrieve title of the baseUrl
		try{
			driver.get(baseUrl);
		} catch (Exception e){
			System.out.println("bad url");
		}
		actualTitle = driver.getTitle();

		System.out.println(actualTitle);
		//close browser
		driver.close();
		//close scanner
		read.close();
		
	}
}
