package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectDropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement dropCountryElement = driver.findElement(By.xpath("//select[@id='country']"));
        // Select Dropdowns
        Select dropCountry = new Select(dropCountryElement);
        // Select option from the dropdown

        /*dropCountry.selectByVisibleText("France");
        dropCountry.selectByValue("japan");
        dropCountry.selectByIndex(2);
        */

        //capture the options from the dropdown
        List<WebElement> options  = dropCountry.getOptions();
        System.out.println(options.size());

        // printing the options
        /*for(WebElement ele: options){
            System.out.println(ele.getText());
        }*/

    }
}
