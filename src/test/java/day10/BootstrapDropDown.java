package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BootstrapDropDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[contains(@class, 'multiselect']")).click();

        // select single option
        driver.findElement(By.xpath("//input[@value='Java']")).click();
        // capture all options and find the size
        List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class, 'multiselect')]//label"));


    }
}
