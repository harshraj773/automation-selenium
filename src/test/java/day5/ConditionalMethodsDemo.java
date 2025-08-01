package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethodsDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

        // WebElement element = driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
        // System.out.println("Display Status "+ element);

        // driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).isDisplayed();
        WebElement male_rd = driver.findElement(By.xpath("//input[@id=\"gender-male\"]"));
        WebElement female_rd = driver.findElement(By.xpath("//input[@id=\"gender-female\"]"));

        System.out.println("Before Selection.....");
        System.out.println(male_rd.isSelected());
        System.out.println(female_rd.isSelected());

        System.out.println("After Selection of male.....");
        male_rd.click();
        System.out.println(male_rd.isSelected());

        System.out.println("After Selection of female.....");
        female_rd.click();
        System.out.println(female_rd.isSelected());
    }
}
