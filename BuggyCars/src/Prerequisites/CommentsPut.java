package Prerequisites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommentsPut {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("https://buggy.justtestit.org/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='login']")).click();
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("234234311");
		driver.findElement(By.xpath("//input[@name='login']/following-sibling::input[1]")).sendKeys("Aaditya@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Logout']")));
		
		driver.findElement(By.xpath("//a[text()='Buggy Rating']")).click();
		//driver.findElement(By.xpath("//a[text()='Profile']")).click();
		driver.findElement(By.xpath("//a/img[@title='Lamborghini']")).click();
		driver.findElement(By.xpath("//table[@class='cars table table-hover']/tbody/tr[2]/td[2]/a")).click();
		driver.findElement(By.xpath("//textarea[@id='comment']")).click();
		driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys("Test Comment");
		//driver.findElement(By.xpath("//button[text()='Vote!']")).click();
		//driver.findElement(By.xpath("//td[text()='Test comment']")).sendKeys("Auckland");
		
		System.out.println("Commented Successfully");
		//driver.close();

// //table[@class="cars table table-hover"]/tbody/tr[2]/td[2]/a
	
		////a[text()='Veneno']
	}

}
