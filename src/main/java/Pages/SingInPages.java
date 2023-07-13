package Pages;

import Base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class SingInPages extends BaseTest {

    @Test
    public void TC001(){
        driver.findElement(By.id("sp-cc-accept")).click();


//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("telefon");
//        driver.findElement(By.id("nav-search-submit-button")).click();
//
//        driver.close();


    }
}
