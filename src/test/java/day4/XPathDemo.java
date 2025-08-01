package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        // xpath with single attribute
        // driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Vivo T3 Pro");

        // xpath with multiple attributes
        // driver.findElement(By.xpath("//input[@name='q'][@class=\"Pke_EE\"]")).sendKeys("Vivo T3 Pro");

        // xpath with 'and' and 'or operator
        // driver.findElement(By.xpath("//input[@name='q' and @class=\"Pke_EE\"]")).sendKeys("Vivo T3 Pro");
        // driver.findElement(By.xpath("//input[@name='q' or @class=\"Pke_EE\"]")).sendKeys("Vivo T3 Pro");

        // xpath with inner text- text()
        // driver.findElement(By.xpath("//*[text()='Infinix SMART 10']")).click();

        // xpath with contains --> syntax: //tagname[contains(@attribute, 'value')]
        // xpath with starts-with(@attribute, 'value)

        // xpath - chained Xpath: combination of relative and absolute xpath
        // boolean imageStatus = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
        // System.out.println(imageStatus);

    }
}
