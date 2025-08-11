package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
// TestNG Notes
//1. testNG executes methods in alphabetical order
//2. giving priority to methods controls the order of execution @Test(priority = 1)
//3. if priority is same, then alphabetical order matters
//4. if you don't provide priority, default order is 0
//5. negative values allowed in priority
//6. TestNG executes methods only if there is @Test annotations

public class FirstTestCase {
    WebDriver driver;

    @Test(priority = 0)
    void openApp(){
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @Test(priority = 1)
    void testLogo(){
       boolean status = driver.findElement(By.xpath("//img[@alt='Practice Test Automation']")).isDisplayed();
        System.out.println("Logo display status "+status);
    }
    @Test(priority = 2)
    void testLogin(){
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
    }
    @Test(priority = 3)
    void testLogout(){
    driver.quit();
    }
}
