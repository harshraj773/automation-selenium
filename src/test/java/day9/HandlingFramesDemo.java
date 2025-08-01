package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

        // Frame 1
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1); // passed frame as webelement
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hi Harsh");
        driver.switchTo().defaultContent(); // moving driver from frame 1 to page

        // Frame 2
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Hi Harsh Raj");
        driver.switchTo().defaultContent();

        // Frame 3
        WebElement frame3 = driver.findElement((By.xpath("//frame[@src='frame_3.html']")));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name='mytext3'")).sendKeys("Java Coding");

        // switch to iFrame-part of frame 3
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
        driver.switchTo().defaultContent();
    }
}
