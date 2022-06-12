import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Laptop {

	WebDriver driver;
	
	@Test(priority=1)
	public void TC001_GitITInfo() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		
		driver.get("https://github.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login_field")).sendKeys("ajay.gupta1711@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Billgates1*");
		driver.findElement(By.name("commit")).click();
		
		driver.switchTo().newWindow(WindowType.TAB);
		Set <String> handles = driver.getWindowHandles();
		Iterator <String> it = handles.iterator();
		@SuppressWarnings("unused")
		String parentWindowId = it.next();
		String childWindowId = it.next();
		driver.switchTo().window(childWindowId);
		driver.get("https://www.infoworld.com/category/cloud-computing/");
		System.out.println("GitITInfo - Done");
	} 
	

	@Test(priority=2)
	public void TC002_SharePoint() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		
		driver.get("https://docs.google.com/spreadsheets/d/1T_XuAg8IzPOhOcGafbve-iAYG2OpHDUzBHSXhC8TzLU/edit#gid=0");
		
		driver.switchTo().newWindow(WindowType.TAB);
		Set <String> handles = driver.getWindowHandles();
		Iterator <String> it = handles.iterator();
		@SuppressWarnings("unused")
		String parentWindowId = it.next();
		String childWindowId = it.next();
		driver.switchTo().window(childWindowId);
		
		driver.get("https://pyramidww.sharepoint.com/sites/Solutions-Master/Weekly%20and%20Monthly%20Status%20Reporting%20Templates/Shared%20Documents/Forms/AllItems.aspx?csf=1&web=1&e=8LDjdD&cid=c55d932f%2D8ab3%2D4dfa%2D9300%2D52d56243b91a&FolderCTID=0x01200006C9BD8B57F3594CB9F4FA1C65F50CAC&sortField=LinkFilename&isAscending=true&viewid=1660ec80%2D02ee%2D4b6c%2D90ef%2D87caccf9c7a3&id=%2Fsites%2FSolutions%2DMaster%2FWeekly%20and%20Monthly%20Status%20Reporting%20Templates%2FShared%20Documents%2FProjects%2FEMC%20QA%2FQA%2FCMMI");

		WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i0116"))).sendKeys("ajay.gupta@celsiortech.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("idSIButton9"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i0118"))).sendKeys("!Alpha!7788");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("idSIButton9"))).click();
		driver.findElement(By.id("idBtn_Back")).click();
		System.out.println("SharePoint - Done");
	}  	
	
	
	@Test(priority=3)
	public void TC003_PCore() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://pyramidcore.pyramidci.com/Security/PCILoginNew.aspx");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		// PCore Applications which is used on daily basis
		
		driver.findElement(By.id("pydLogin_txtUserid")).sendKeys("ajay.gupta");
		driver.findElement(By.id("pydLogin_txtUserPwd")).sendKeys("!Alpha!9988");
		driver.findElement(By.id("pydLogin_btnLogin")).click();
		
		driver.findElement(By.linkText("HOME")).click();
		
		driver.switchTo().frame("contents");
		
		driver.findElement(By.linkText("Dashboard")).sendKeys(Keys.CONTROL, Keys.ENTER);
		driver.findElement(By.linkText("Org Chart")).sendKeys(Keys.CONTROL, Keys.ENTER);
		driver.findElement(By.linkText("Tax Submission")).sendKeys(Keys.CONTROL, Keys.ENTER);
		
		driver.findElement(By.linkText("Timesheet")).sendKeys(Keys.CONTROL, Keys.ENTER);
		driver.findElement(By.linkText("My Timesheet")).sendKeys(Keys.CONTROL, Keys.ENTER);
		driver.findElement(By.linkText("Team's Timesheet")).sendKeys(Keys.CONTROL, Keys.ENTER);
		
		driver.findElement(By.linkText("Human Resources")).sendKeys(Keys.CONTROL, Keys.ENTER);
		driver.findElement(By.linkText("View")).sendKeys(Keys.CONTROL, Keys.ENTER);
		
		driver.findElement(By.linkText("Leave Application")).sendKeys(Keys.CONTROL, Keys.ENTER);
		driver.findElement(By.linkText("Attendance Report")).sendKeys(Keys.CONTROL, Keys.ENTER);
		driver.findElement(By.linkText("Attendance Approval")).sendKeys(Keys.CONTROL, Keys.ENTER); 
		System.out.println("PCore - Done");
	}  
		
	
	@Test(priority=4)
	public void TC004_Jira() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.get("https://emcins.atlassian.net/jira/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username"))).sendKeys("pyramid-6@emcins.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-submit"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("loginfmt"))).sendKeys("pyramid-6@emcins.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("idSIButton9"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("passwd"))).sendKeys("!Alpha!8877");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("idSIButton9"))).click();
		System.out.println("Jira - Done");
	}

/*	@Test(priority=5)
	public void Udemy() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.get("https://www.udemy.com/join/login-popup/?locale=en_US&response_type=html&next=https%3A%2F%2Fwww.udemy.com%2F%3FranMID%3D39197%26ranEAID%3DOzpaRYwFVr0%26ranSiteID%3DOzpaRYwFVr0-.N3U4QDcQUKMHLeI9OV7UQ%26LSNPUBID%3DOzpaRYwFVr0%26utm_source%3Daff-campaign%26utm_medium%3Dudemyads");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email"))).sendKeys("ajay.gupta1711@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("Billgates1*");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("submit"))).click();
	}  */
	
}