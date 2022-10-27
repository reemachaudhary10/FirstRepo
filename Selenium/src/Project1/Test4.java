package Project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com.au/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement dropdown=driver.findElement(By.id("gh-cat"));
		Select s=new Select(dropdown);
		s.selectByIndex(10);
		s.selectByValue(value);
		
		

	}

}
