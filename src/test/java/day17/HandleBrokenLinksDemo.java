package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

//1. take link and check whether it has a value in href attribute or not
//2. capture the value, establish a connection then connect  & check status code
public class HandleBrokenLinksDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links: "+links.size());
        for(WebElement linkElement: links){
            String link = linkElement.getAttribute("href");
            if(link == null || link.isEmpty()){
                System.out.println("href attribute value is null of empty, so not possible to check");
                continue;
            }
            try{
                URL linkUrl = new URL(link); // converting url to URL from string
                HttpURLConnection conn = (HttpURLConnection) linkUrl.openConnection();
                conn.connect();

                if(conn.getResponseCode() >= 400){
                    System.out.println("Broken link: "+link);
                }
            } catch (Exception e) {

            }
        }

    }
}
