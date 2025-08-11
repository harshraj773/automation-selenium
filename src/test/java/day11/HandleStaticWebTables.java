package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.print.Book;
import java.util.List;
// Web Table are of three different types
//1. Static web table
//2. Dynamic web table
//3. Table with pagination

public class HandleStaticWebTables {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
//        driver.manage().window().maximize();

        //1. find number of rows in a table
        List<WebElement> rows = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr"));
        System.out.println(rows.size());

        //2. find total number of columns in a table
        List<WebElement> cols = driver.findElements(By.xpath("//table[@name='BookTable']//th"));
        System.out.println(cols.size());

        //3. read data from specific row and column(ex: 5th row and 1st col)
        String BookName = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[5]//td[1]")).getText();
        System.out.println("Book Name is "+ BookName);

        //4. read data from all rows and columns(NOTE: In xpath starts index from 1)
       /* for(int r = 2; r<=rows.size(); r++) {
            for(int c = 1; c<=cols.size(); c++){
                System.out.println(driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td["+c+"]")).getText() +" ");
            }
            System.out.println(" ");
        }*/

        //5. print book names written by 'Mukesh'
        for(int r = 2; r<=rows.size(); r++) {
                String author = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td["+2+"]")).getText();
                if(author.equals("Mukesh")){
                System.out.println(driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td["+1+"]")).getText() +" ");
            }
        }
        //6. find total price of all the books
        int totalPrice = 0;
        for(int r = 2; r<=rows.size(); r++) {
            String priceInString = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td["+4+"]")).getText();
            totalPrice += Integer.parseInt(priceInString);
            }
        System.out.println("Total Price "+totalPrice);
        }

    }
