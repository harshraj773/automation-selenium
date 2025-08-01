package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo  {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ajio.com/shop/men");
        driver.manage().window().maximize();

        // name
        // driver.findElement(By.name("searchVal")).sendKeys("jeans");

        // id
//        boolean isIDPresent = driver.findElement(By.id("logo")).isDisplayed();
//        System.out.println("Id Present status" + isIDPresent);
        // linkText
//        driver.findElement(By.linkText("WOMEN")).click();

        // class
//      List<WebElement> headerLinks =  driver.findElements(By.className(""));
//      headerLinks.size(); // getting allElements by class

//        // tagName
//        List<WebElement> links = driver.findElements(By.tagName(("a")));
//        System.out.println(links.size( ));

//        List<WebElement> links = driver.findElements(By.tagName(("img")));
//        System.out.println(links.size());

    }
}
