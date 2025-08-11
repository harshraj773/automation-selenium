package day16;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class ScreenshotDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //1. Taking full page screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        /*File sourceFile = ts.getScreenshotAs(OutputType.FILE);
        File targetFile = new File(System.getProperty("user.dir")+"/screenshots/fullpage.png");
        System.out.println(System.getProperty("user.dir"));
        sourceFile.renameTo(targetFile);
        */

        //2. Capturing screenshot for a specific area
        /*WebElement featuredProduct = driver.findElement(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]"));
        File sourceFile1 = featuredProduct.getScreenshotAs(OutputType.FILE);
        File targetFile1 = new File(System.getProperty("user.dir")+"/screenshots/featured.png");
        System.out.println(System.getProperty("user.dir")+"/screenshots/featured.png");
        ///Users/harshraj/practice/selenium/src/test/java/day16
        sourceFile1.renameTo(targetFile1);
        */

        //3. Capture screenshot of a specific element
        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        File sourceFile2 = logo.getScreenshotAs(OutputType.FILE);
        File targetFile2 = new File(System.getProperty("user.dir")+"/screenshots/logo.png");
        sourceFile2.renameTo(targetFile2);

        driver.quit();

    }
}
