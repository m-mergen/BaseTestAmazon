package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
public static void main (String[]args){
    System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
    ChromeOptions co = new ChromeOptions();
    co.addArguments("--remote-allow-origins=*");
    ChromeDriver driver = new ChromeDriver(co);
    driver.get("https://www.amazon.com");
    driver.manage().window().maximize();
    driver.close();
}

}