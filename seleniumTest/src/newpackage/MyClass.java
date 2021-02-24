package newpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {
	
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		
		//launch browser @ baseUrl
		driver.get(baseUrl);
		
		//retrieve title of the baseUrl
		actualTitle = driver.getTitle();
		
		//compare expected and actual titles:
		if(actualTitle.contentEquals(expectedTitle)){
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed!");
		}
		//close browser
		driver.close();
	}
}
