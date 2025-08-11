package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleDynamicPagination {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.ecomdeveloper.com/demo/admin/index.php");

        WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        username.clear();
        username.sendKeys("demoadmin");

        WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        password.clear();
        password.sendKeys("demopass");

        // logging in
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        /*if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()){
            driver.findElement(By.xpath("//button[@class='btn-close']")).click();
        }*/

        driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
        driver.findElement(By.xpath("//ul[@id='collapse8']//a[contains(text(),'Customers')]")).click();

        //Showing 1 to 3 of 3 (1 Pages)
        String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();
        int totalPages = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
//        System.out.println("Total number of pages are "+totalPages);

        // repeating pages
        for(int p = 1;p<=totalPages;p++){
            if(p>1){
                WebElement activePage = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
                activePage.click();
            }
            // reading data from the page(fetching name, email and status)
           int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr")).size();
            for(int r = 1; r<=rows; r++){
               String name = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]/td[2]")).getText();
               String email = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]/td[3]")).getText();
               String status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr["+r+"]/td[5]")).getText();
                System.out.println(name+" "+email+" "+status);
            }
        }
    }
}
