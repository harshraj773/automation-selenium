package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        // tag id -----> tag#id
        // driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("iPhone 16");

        // tag class ------> tag.classname
//        driver.findElement((By.cssSelector("input.search-box-text"))).sendKeys("iPhone 15");

        // tag attribute ------> tag[attribute="value"]
//        driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("iPhone 14");

        // tag class attribute
        driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Samsung s24");
    }
}
