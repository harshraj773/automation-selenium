package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
    public static void main(String[] args) {
        // Launch browser
        ChromeDriver cd = new ChromeDriver();
        cd.get("https://www.mindstix.com");
    }
}
