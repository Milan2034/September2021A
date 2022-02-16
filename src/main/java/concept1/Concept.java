package concept1;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Concept {
	WebDriver driver;
	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	//set url
    driver.get("https://objectspy.space/");
   // maximize
    driver.manage().window().maximize();
    //delete cookies
    driver.manage().deleteAllCookies();
    //define wait
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
    @Test
    public void elementLocators() throws InterruptedException {
    driver.findElement(By.name("firstname")).sendKeys("milan");
    driver.findElement(By.name("lastname")).sendKeys("regmi");
    driver.findElement(By.name("Password")).sendKeys("abc123");
    //Upload file if you have input tag
    //other than input tag use Robot Class
	/*
	 * driver.findElement(By.className("input-file")).sendKeys(
	 * "C:\\Users\\18042\\Documents"); //hyperLink
	 * driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
	 * //nevigate back driver.navigate().back(); //partial Link text
	 * driver.findElement(By.partialLinkText("TF-API ")).click();
	 * Thread.sleep(10000);
	 */
    driver.findElement(By.cssSelector("input#sex-0")).click();
    driver.findElement(By.cssSelector("input#sex-1")).click();
    driver.findElement(By.cssSelector("input#exp-6")).click();
   // driver.findElement(By.cssSelector("input[id='datepicker']")).click();
   // relative x path
    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("yes it is fun");
}}
