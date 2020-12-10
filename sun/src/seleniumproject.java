import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumproject {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://github.com");
	System.out.println(driver.getTitle());
	
	System.out.println(driver.getCurrentUrl());
	
	
		
		

	}

}
