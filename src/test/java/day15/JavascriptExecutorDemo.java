package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement inputBox = driver.findElement(By.xpath("//input[@id='name']"));

        JavascriptExecutor js = (JavascriptExecutor) driver; // upcasting since driver is an object of ChromeDriver
        // and javascriptExecutor is grand grand parent of chromeDriver
        // JavascriptExecutor js = driver;
        // send text to input box  - alternate of sendKeys()
        js.executeScript("arguments[0].setAttribute('value', 'Harsh')", inputBox);
        // click on a button - alternate of click()
        WebElement radioButton = driver.findElement(By.xpath("//input[@id='male']"));
        js.executeScript("arguments[0].click()", radioButton);
    }
}
