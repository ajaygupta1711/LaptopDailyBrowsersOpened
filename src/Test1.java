
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// Get the title of window
		
		String text = driver.getTitle();
		System.out.println(text);
		
		// Maximize the browser
		
		driver.manage().window().maximize();
		
		// Select the Radio button
		driver.findElement(By.cssSelector("input[name='radioButton'][value='radio1']")).click();
		
		// Enter the country name in searchable field
		driver.findElement(By.id("autocomplete")).sendKeys("India");
		
		// Select the dropdown field value
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("Option2");
		
		// Select the checkbox
		driver.findElement(By.id("checkBoxOption3")).click();
		
		// Click on Open Window button
		
		Thread.sleep(2000);
		driver.findElement(By.id("openwindow")).click();
		
		// Change the focus to new window, Get the title, Close the Current window and Reset the focus back to original window
		
		Thread.sleep(2000);
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
		Thread.sleep(2000);
		String text1 = driver.getTitle();
		System.out.println(text1);
		
		driver.close();
		driver.switchTo().window(winHandleBefore);
		
		// Click on Open Tab button
		
		Thread.sleep(2000);
		driver.findElement(By.id("opentab")).click();
		
		Thread.sleep(4000);
		
		// Change the focus on new opened tab, Get the title, Close the new tab and Reset the focus back to first tab 
		
		String originalHandle = driver.getWindowHandle();

	    for(String handle : driver.getWindowHandles()) {
	        if (!handle.equals(originalHandle)) {
	            driver.switchTo().window(handle);
	            String text2 = driver.getTitle();
	            System.out.println(text2);
	            driver.close();
	        }
	    }

	    driver.switchTo().window(originalHandle);
		
		// Enter the text in text confirmation field and click on Alert button
		
		Thread.sleep(2000);
		driver.findElement(By.name("enter-name")).sendKeys("Ajay Gupta");
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();
		
		// Enter the text in text confirmation field and click on Alert button
		
		Thread.sleep(2000);
		driver.findElement(By.name("enter-name")).sendKeys("Ajay Gupta");
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();
		
		
		// Identify and Print the table column names
	
		WebElement table = driver.findElement(By.id("product"));
		System.out.println(driver.findElements(By.xpath("//th")).size());
		
		// Close all browser sessions
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}