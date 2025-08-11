package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

public class DatePickerDemo2 {
    //user defined method to convert month to month object
    static Month convertMonth(String month){
        HashMap<String, Month>monthMap = new HashMap<String, Month>();
        monthMap.put("January", Month.JANUARY);
        monthMap.put("February", Month.FEBRUARY);
        monthMap.put("March", Month.MARCH);
        monthMap.put("April", Month.APRIL);
        monthMap.put("May", Month.MAY);
        monthMap.put("June", Month.JUNE);
        monthMap.put("July", Month.JULY);
        monthMap.put("August", Month.AUGUST);
        monthMap.put("September", Month.SEPTEMBER);
        monthMap.put("October", Month.OCTOBER);
        monthMap.put("November", Month.NOVEMBER);
        monthMap.put("December", Month.DECEMBER);

        Month objMonth = monthMap.get(month);
        if(objMonth == null){
            System.out.println("Invalid month...");
        }
        return objMonth;
    }
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // input DOB
        String day = "15";
        String month = "August";
        String year = "2021";
        // selecting year dropdown
        driver.findElement(By.xpath("//input[@id=\"txtDate\"]")).click();
        List<WebElement> yearList = driver.findElements(By.xpath("//select[@class=\"ui-datepicker-year\"]//option"));
        for(WebElement y: yearList){
            if(y.getText().equals(year)){
                y.click();
                break;
            }
        }
    }
}
