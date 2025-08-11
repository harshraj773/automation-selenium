package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();

        Actions act = new Actions(driver);
        WebElement minSlider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
        System.out.println("Default slider location is "+minSlider.getLocation());
        Thread.sleep(3000);
        act.dragAndDropBy(minSlider, 100, 257).perform();
        System.out.println("After moving slider location is "+minSlider.getLocation());

        // maximum element
        WebElement maxSlider = driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
        System.out.println("default location of max slider "+maxSlider.getLocation());
        Thread.sleep(3000);
        act.dragAndDropBy(maxSlider, -69, 257).perform();
        System.out.println("After moving slider location is "+maxSlider.getLocation());

    }
}
