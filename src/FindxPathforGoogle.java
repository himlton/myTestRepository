import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindxPathforGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Manjula&Hitesh\\Maven-Eclipse Workspace\\Learning\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.google.com");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Testing");
			List<WebElement> list =	driver.findElements(By.xpath("//ul[@role='listbox']/descendant::div/div/div/span"));
			System.out.println(list.size());
			
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i).getText());
			}
	}

}
