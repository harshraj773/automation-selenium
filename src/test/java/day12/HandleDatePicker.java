package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleDatePicker {
    //select month and year
    static void selectMonthAndYear(WebDriver driver, String month, String year){
        while(true){
            // capturing current month and year
            String currMonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
            String currYear = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();

            if(currMonth.equals(month) && currYear.equals(year)){
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }
    }
    // selecting date

    static void selectDate(WebDriver driver, String day){
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//a"));
        for(WebElement date: dates){
            if(date.getText().equals(day)){
                date.click();
                break;
            }
        }
    }
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        // switch to frame
        driver.switchTo().frame(0);
        //1. using sendKeys
        driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).sendKeys("05/01/2025");
        //2. using datepicker
        String day = "12";
        String month = "July";
        String year = "2026";
        driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();

        // in real application datepicker will be either accepting future dates or previous dates both not allowed simultaneously
        selectMonthAndYear(driver, month, year);
        selectDate(driver, day);
    }

}
