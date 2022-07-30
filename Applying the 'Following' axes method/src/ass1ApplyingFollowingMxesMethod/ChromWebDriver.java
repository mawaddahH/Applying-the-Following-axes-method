package ass1ApplyingFollowingMxesMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromWebDriver {
	public WebDriver driver;

	/**
	 * Set up browser settings and open the application
	 */

	@BeforeTest
	public void setUp() {
		// the path for open WebSite
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lo0ol\\" + "Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		// Navigate to a WebSite
		driver.navigate().to("https://itmeo.com/");

		// Maximize current window
		driver.manage().window().maximize();
		
	}

	/**
	 * Test using text() function, Type of XPath
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void LearnEnglishWebSite() throws InterruptedException {
		// Delay execution for 3 seconds to see the result carefully.
				Thread.sleep(5000);
		
		// ex1 ------- 'Following' axes method using same tagname "a"
		WebElement textMethod1 = driver
				.findElement(By.xpath("//a[text()='new releases']/following::a[text()='all templates']"));
		textMethod1.click();
		System.out.println("ex1 DONE Successfully");

		// Delay execution for 3 seconds to see the result carefully.
		Thread.sleep(5000);

		// ex2 ------- 'Following' axes method using different tagneme "button" and "input"
		WebElement textMethod2 = driver.findElement(By.xpath("//button[@class='search-form__btn']/following::input[@class='search-form__input']"));
		textMethod2.sendKeys("code",Keys.ENTER);
		System.out.println("ex2 DONE Successfully");
		Thread.sleep(5000);

		// ex3 ------- 'Following' axes method with AND operation
		WebElement textMethod3 = driver.
				findElement(By.
						xpath("//a[@href='/pricing']/following::a[@href='/login' and contains(text(),'Log In')]"));
		textMethod3.click();
		Thread.sleep(5000);
		System.out.println("ex3 DONE Successfully");


		// ex4 ------- 'Following' axes method with OR operation
		WebElement textMethod4 = driver
				.findElement(By.xpath("//label[starts-with(text(),'Email address')]/following::input[contains(@name,'email') or @class='from-filed__input-area'][1]"));
		textMethod4.sendKeys("Well Done Mawaddah");
		System.out.println("ex4 DONE Successfully");
		Thread.sleep(5000);
		


	}

	/**
	 * Tear down the setup after test completes
	 */
	@AfterTest
	public void terminateBrowser() {
		// Close the browser
		driver.quit();
	}
}
