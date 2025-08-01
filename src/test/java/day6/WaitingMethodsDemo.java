package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitingMethodsDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // implicit wait
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//        driver.findElement(By.id("username"));
//        driver.findElement(By.id("password"));
//        driver.findElement(By.id("loginBtn"));

        // Here, Implicit wait is applied to every findElement() or findElements() call
        // individually and each call get its own full timeout period.

        // Explicit wait
        // disadvantage
        // conditional wait, it will work more effectively
        // finding element is inclusive(for some elements)
        // it will wait for the condition to be true, then consider the time
        // we need to write multiple statements for multiple elements
        WebElement txtUsername = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username'")));
        txtUsername.sendKeys("F36 5G Samsung");

        WebElement txtPassword = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password'")));
        txtPassword.sendKeys("abcdefgh");

        WebElement loginBtn = myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login'")));
        loginBtn.click();

        driver.close();
    }
}
