package day20;


import org.testng.annotations.Test;

public class AnnotationsDemo1 {
    @Test
     void login(){
         System.out.println("This is login");
     }
     @Test(priority = 1)
     void search(){
         System.out.println("This is search");
     }
    @Test(priority = 2)
     void advancedSearch(){
         System.out.println("This is advanced search");
     }
     @Test
     void logout(){
         System.out.println("This is logout");
     }
}
