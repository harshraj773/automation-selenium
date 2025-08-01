package day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertsDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        // normal alert with OK button
        /*driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Thread.sleep(3000);
        Alert myAlert = driver.switchTo().alert();
        System.out.println(myAlert.getText());
        myAlert.accept();
        */

        // confirmational alert - alert with OK and Cancel button
        /*driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Thread.sleep(3000);
        Alert myAlert = driver.switchTo().alert();
        System.out.println( myAlert.getText());
        myAlert.accept();
        */

        // prompt alert - alert with input box
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Thread.sleep(3000);
        Alert myAlert = driver.switchTo().alert();
        myAlert.sendKeys("Hi! Harsh");
        myAlert.accept();

    }
}
