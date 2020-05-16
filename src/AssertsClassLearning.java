import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class AssertsClassLearning {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula&Hitesh\\Maven-Eclipse Workspace\\Learning\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String autualTitle = driver.getTitle();
		SoftAssert softAssert = new  SoftAssert();
	File screen =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screen, new File("C:\\Users\\Manjula&Hitesh\\Maven-Eclipse Workspace\\Learning\\ScreenShots\\screenshot.png"));
	
		softAssert.assertEquals(autualTitle, "CRM");
		//Assert.assertEquals(autualTitle, "CRM");
		driver.quit();

	}

}
