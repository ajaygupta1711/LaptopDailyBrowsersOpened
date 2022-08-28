import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UdemyDownloadCert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium with Java\\\\Software Installs_IMP\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.udemy.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Log in')]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email--1"))).sendKeys("ajay.gupta@pyramidconsultinginc.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_password"))).sendKeys("Billgates1*");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submit-id-submit"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("user-profile-dropdown--dropdown-button-avatar--Cbd6V udlite-avatar udlite-heading-sm")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'My learning')]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Selenium WebDriver with Java"))).click();

	}

}
