package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPageDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver; // upcasting

        //1. scroll down by pixel number
        /*js.executeScript("window.scrollBy(0, 1500)", "");
        System.out.println(js.executeScript("return window.pageYOffset;"));
         */

        //2. scroll the page till an element is visible
        /*WebElement country = driver.findElement(By.xpath("//td[normalize-space()='India']"));
        js.executeScript("arguments[0].scrollIntoView();", country);
        System.out.println(js.executeScript("return window.pageYOffset;"));
        */

        //3. scroll page till end of the document
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));
        Thread.sleep(3000);

        //4. scroll up to initial position
        js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));
    }
}
