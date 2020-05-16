import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class WindowHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula&Hitesh\\Maven-Eclipse Workspace\\Learning\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(), 'Click Here')]")).click();
		Set<String> handler = driver.getWindowHandles();
		System.out.println(handler.size());
		Iterator<String> it = handler.iterator();
		String parentWindowID = it.next();
		
		String childWindowID = it.next();
		System.out.println("Title of parent window :" + driver.getTitle());
		
		driver.switchTo().window(childWindowID);
		System.out.println("Title of child window :" + driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowID);
		System.out.println("Title of parent window :" + driver.getTitle());
		
		driver.close();
		System.out.println(driver.getTitle());
	}

}
