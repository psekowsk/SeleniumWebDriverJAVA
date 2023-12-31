package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L05_CheckingButtons {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\psekowsk\\Desktop\\JAVA projects\\Resources\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationtesting.co.uk/buttons.html");
		System.out.println(
				driver.findElement(By.cssSelector("button#btn_four")).isEnabled()
				);
		
		System.out.println(
				driver.findElement(By.cssSelector("button#btn_three")).isEnabled()
				);
		//driver.quit();
	}

}
