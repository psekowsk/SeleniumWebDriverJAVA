package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L06_DropdownMenus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\psekowsk\\Desktop\\JAVA projects\\Resources\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationtesting.co.uk/dropdown.html");
		Select menuItem = new Select(driver.findElement(By.cssSelector("select#cars")));
		menuItem.selectByVisibleText("Honda");
		menuItem.selectByValue("Jeep");
		//driver.quit();
	}

}
