package Prerequisites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("https://buggy.justtestit.org/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='login']")).click();
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("PTeooats");
		driver.findElement(By.xpath("//input[@name='login']/following-sibling::input[1]")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		//steps for logout
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Logout']")));
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Buggy Rating']")).click();
		System.out.println("Login Successful - TC Pass");
		driver.close();

	}
	
}
