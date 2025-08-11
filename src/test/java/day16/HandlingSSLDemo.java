package day16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingSSLDemo {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true); // accept SSL certificates
        options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"}); // remove automated message in chrome
        options.addArguments("--incognito"); // launch browser in incognito mode
        WebDriver driver = new ChromeDriver(options);
        Thread.sleep(2000);
        driver.get("https://expired.badssl.com/");
        System.out.println("Title is: "+driver.getTitle());
//        driver.quit();
    }
}
