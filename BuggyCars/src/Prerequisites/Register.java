package Prerequisites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe"); //set path for chrome.exe open
		WebDriver driver = new ChromeDriver();  //calling webdriver to run exe and open chrome
		WebDriverWait wait = new WebDriverWait(driver, 5);
		driver.manage().window().maximize();  // maximise the window 

		driver.get("https://buggy.justtestit.org/"); //set url in chrome driver to open 

		driver.findElement(By.xpath("//a[text()='Register']")).click();    // test step click perform
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("PTeayuts"); // test steps perform below
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Anaitkas");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kaapparas");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		// driver.findElement(By.xpath("//button[text()='Register']/following-sibling::div[1]")).getText();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'result')]")));

		String message = driver.findElement(By.xpath("//div[contains(@class,'result')]")).getText();
		System.out.println(message);
		driver.close();

	}

}