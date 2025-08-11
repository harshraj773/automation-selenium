package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HeadlessTestingDemo {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");//setting for headless mode of execution

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demo.nopcommerce.com/");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds());
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='nopCommerce demo store']")));

        String title = driver.getTitle();
        System.out.println("title is:"+title);

    }
}
