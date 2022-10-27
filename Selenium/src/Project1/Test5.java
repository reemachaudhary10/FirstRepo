package Project1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com.au/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//typcasting
		
		JavascriptExecutor js=()

	}

}
