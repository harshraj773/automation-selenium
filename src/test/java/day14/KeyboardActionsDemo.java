package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardActionsDemo  {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//textarea[@id=\"inputText1\"]")).sendKeys("Hi harsh, have a good day");
        Actions act = new Actions(driver);
        //CTRL + A
        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
        //CTRL + C
        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
        // TAB
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
        // CTRL + V
        act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
    }
}
