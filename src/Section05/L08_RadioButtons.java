package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L08_RadioButtons {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\psekowsk\\Desktop\\JAVA projects\\Resources\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationtesting.co.uk/dropdown.html");
		driver.findElement(By.cssSelector("[for='demo-priority-low']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[for='demo-priority-normal']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[for='demo-priority-high']")).click();
		//driver.quit();
	}

}
