package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class OpenInNewTab {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        WebElement registerLink = driver.findElement(By.xpath("//a[@class='ico-register']"));
        Actions act = new Actions(driver);

        // COMMAND + regLink
        act.keyDown(Keys.COMMAND).click(registerLink).keyUp(Keys.COMMAND).perform();
        // switching to registration page
        List<String> ids = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(ids.get(1));
    }
}
