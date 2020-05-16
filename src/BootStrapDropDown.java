import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootStrapDropDown {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Manjula&Hitesh\\Maven-Eclipse Workspace\\Learning\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		screenShot("Login_Page");
		driver.findElement(By.id("headerSearch")).sendKeys("plug");;
		driver.findElement(By.id("headerSearchButton")).click();
		//	driver.findElement(By.xpath("(//nav[@class='drop-down__header js-revert-to-default clearfix'])[1]")).click();
		//driver.findElement(By.xpath("//span[contains(text(), 'Contacts')]")).click();
		//	Thread.sleep(15000);
		//		//driver.findElement(By.xpath("//button[@class='ui linkedin button']/i[@class='edit icon']")).click();
		//		try {
		//			Thread.sleep(20000);
		//		} catch (InterruptedException e) {
		//			// TODO Auto-generated catch block	
		//			e.printStackTrace();
		//		}
		List<WebElement> list =  driver.findElements(By.xpath("(//div[@class='drop-down__content-wrapper'])[1]//ul//li"));
		System.out.println(list.size());
		for(WebElement element:list) {
			System.out.println(element.getAttribute("innerText").trim());
		}
		//		for(int i=0;i<list.size();i++) {
		//			System.out.println(list.get(i).getText());
		//			if(list.get(i).getText().equals("Price Low to High")){
		//				list.get(i).click();
		//				break;
		//			}
		//		}



	}


	public static void screenShot(String filename) throws IOException {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\Manjula&Hitesh\\Maven-Eclipse Workspace\\Learning\\ScreenShots\\"+filename+".png"));

	}

}