

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(1000);
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//button[contains(text(), 'No thanks')]")).click();
		driver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);
		driver.close();
	}

}
