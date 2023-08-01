package Section09;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.apache.commons.io.FileUtils;

public class L04_Screenshots {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\psekowsk\\Desktop\\JAVA projects\\Resources\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationtesting.co.uk/");
		driver.manage().window().maximize();
		takeSnapShot(driver);
	}
	
	public static void takeSnapShot(WebDriver webdriver) throws IOException {
		File srcFile = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\psekowsk\\Desktop\\JAVA projects\\Resources\\screenshots\\" + timestamp() + ".png");
		FileUtils.copyFile(srcFile, destFile);
	}
	
	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
}
