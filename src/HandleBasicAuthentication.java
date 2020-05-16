import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleBasicAuthentication {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Manjula&Hitesh\\Maven-Eclipse Workspace\\Learning\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		String str = driver.findElement(By.xpath("//p[contains(text(), 'Congratulations')]")).getText();
				System.out.println(str);
		
	}

}
