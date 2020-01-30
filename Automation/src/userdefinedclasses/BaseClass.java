package userdefinedclasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;
	@BeforeTest
	public void OpenBrowser() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		String browser=ExcelOperation.readData("Sheet2",1,12);
		String url=ExcelOperation.readData("Sheet2", 1, 0);
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C://drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@AfterTest
	public void CloseBrowser()
	{
driver.close();
}
	@BeforeClass
	public void login() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		String un=ExcelOperation.readData("Sheet2", 1, 1);
		String psd=ExcelOperation.readData("Sheet2", 1, 2);
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(psd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@AfterClass
	public void logout() {
		driver.findElement(By.className("logoutImg")).click();
	}
}
