
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Select the Radio button
		
		driver.findElement(By.cssSelector("input[name='radioButton'][value='radio1']")).click();
		
		// Enter the text in text searchable field
		
		driver.findElement(By.id("autocomplete")).sendKeys("India");
		
		// Select the dropdown field value
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("Option2");
		
		// Select the checkbox
		
		driver.findElement(By.id("checkBoxOption3")).click();
		
		// Click on Open Window button
		
		driver.findElement(By.id("openwindow")).click();
		driver.close();

	}

}
