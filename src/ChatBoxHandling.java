import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChatBoxHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula&Hitesh\\Maven-Eclipse Workspace\\Learning\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toyotaofcedarpark.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@title='Close this box']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='di-conversations-embed-root']"));
		System.out.println(list.size());
		String str = driver.findElement(By.xpath("//a//div[@class='sc-1xtbebo-1 dcMkQK']//div[contains(text(),'Chat with us')]")).getText();
		System.out.println(str);
		Thread.sleep(10000);
		Actions action = new Actions(driver);
		action.click(driver.findElement(By.xpath("//i[@class='fa fa-chevron-down fa-2x']"))).build().perform();
		//action.click();
	}
}
