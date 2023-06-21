package booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enduser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\new driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://booking.com/");
		driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/div[1]/div/div/header/nav[1]/div[2]/div/a")).click();
	}

}
