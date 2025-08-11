package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// selenium provides special class named "Actions" to handle mouse actions
// mouse hover -> moveToElement(webelement)
// right click -> contextClick(webelement)
// double click -> doubleClick(webelement)
// drag and drop -> dragAndDrop(source_element, target_element)

// NOTE: getText() method can only capture innerText.(it can't capture value in an input box)
// So, use getAttribute("value") -> it will give the value of the value attribute

//ACTIONS - class, used to perform mouse actions
//ACTION - interface, used to store created actions(.build())
public class MouseActionDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        WebElement desktops = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
        WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));

        // build() -> create an action
        // perform() -> complete an action(build + complete)
        Actions action = new Actions(driver);
        //action.moveToElement(desktops).moveToElement(mac).build().perform();
        action.moveToElement(desktops).moveToElement(mac).perform();


    }
}
