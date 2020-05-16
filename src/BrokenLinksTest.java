import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksTest {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula&Hitesh\\Maven-Eclipse Workspace\\Learning\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://makemysushi.com/404");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.name("email")).sendKeys("hiteshmangal@gmail.com");
		//driver.findElement(By.name("password")).sendKeys("Sheoganj18!");
		//driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		//Thread.sleep(10000);
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		list.addAll(driver.findElements(By.tagName("img")));
		List<WebElement> linksList = new ArrayList<WebElement>();
		System.out.println("Total links availalable on the page --->" + list.size());
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAttribute("href") != null && list.get(i).getText().length() !=0) {
				linksList.add(list.get(i));
				System.out.println(list.get(i).getText());
			}
		}
		
		System.out.println("Links with href availalable on the page --->" + linksList.size());
		
		for(int j=0;j<linksList.size();j++) {
			HttpURLConnection connection = (HttpURLConnection) new URL(linksList.get(j).getAttribute("href")).openConnection();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(linksList.get(j).getText()+"---->"+response);
		}
		
		
		driver.quit();

	}

}
