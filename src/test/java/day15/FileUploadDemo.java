package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();

        // 1. single file upload
        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("location of file ");
        if(driver.findElement(By.xpath("//ul[@id=\"fileList\"]//li")).getText().equals("Ambuj_Mishra.pdf")){
            System.out.println("FIle successfully uploaded");
        }else{
            System.out.println("File upload failed");
        }

        // 2. upload multiple files
        String file1 = "location of the file1";
        String file2 = "location of the file2";
        driver.findElement(By.xpath("//input[@id='fileToUpload']")).sendKeys(file1+"\n"+file2);

    }
}
