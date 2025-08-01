package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckboxesDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

//        1. select specific checkbox
//        driver.findElement(By.xpath("//input[@id='sunday']")).click();
//
//        2. selecting multiple elements
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//        for(int i = 0; i< checkboxes.size(); i++){
//            checkboxes.get(i).click();
//        }
//        enhanced for loop
//        for(WebElement checkbox: checkboxes) {
//            checkbox.click();
//        }
//        select last three checkboxes
//        formula: total no. of checkboxes - how many checkboxes required = starting index
//        starting_index = 7 - 3 = 4
//         for(int i = 4; i < checkboxes.size(); i++) {
//             checkboxes.get(i).click();
//         }

//         unselect checkboxes if they are  selected
        for(int i = 4; i < checkboxes.size(); i++) {
             checkboxes.get(i).click();
         }
        Thread.sleep(3000);
        for(int i = 4; i < checkboxes.size(); i++) {
            if(checkboxes.get(i).isSelected()) {
                checkboxes.get(i).click();
            }
         }
    }
}
