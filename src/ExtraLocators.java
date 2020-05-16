import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.pagefactory.ByChained;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtraLocators {
	static WebDriver driver;

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Manjula&Hitesh\\Maven-Eclipse Workspace\\Learning\\Drivers\\geckodriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(new ByAll(By.id("u_0_m123"), By.name("firstname123"), By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']"))).sendKeys("Hitesh");
		
		//driver.findElement(new ByIdOrName("firstname")).sendKeys("Hitesh");
		driver.findElement(new ByChained(By.id("u_0_l"),
				By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']"),
				By.name("firstname"))).sendKeys("Hitesh");

	}

}
