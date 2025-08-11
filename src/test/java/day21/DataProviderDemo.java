package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataProviderDemo {
    WebDriver driver;
    @BeforeClass
    void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
    }

    @Test
    void testLogin() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        Thread.sleep(2000);
        boolean status = driver.findElement(By.xpath("//a[@class='wp-block-button__link has-text-color has-background has-very-dark-gray-background-color']")).isDisplayed();
        if(status){
            driver.findElement(By.xpath("//a[@class='wp-block-button__link has-text-color has-background has-very-dark-gray-background-color']")).click();
            Assert.assertTrue(true);
        }else{
            Assert.fail();
        }
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }
}
