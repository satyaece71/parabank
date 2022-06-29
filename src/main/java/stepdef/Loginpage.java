package com.gluecode;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {
    static  WebDriver driver;
    static By signbutton= By.className("login");
    static By Username= By.id("email");
    static By Password= By.id("passwd");
    static By LoginButton= By.id("SubmitLogin");
    static By signinuserdisplay= By.xpath("//div[@class='header_user_info']");

    public Loginpage(WebDriver driver){
        this.driver=driver;
    }
    public static void LaunchURL(String url){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);

    }

     public static void verifyLogin(){

        driver.findElement(signbutton).click();
        driver.findElement(Username).sendKeys("sunitha.488@gmail.com");
        driver.findElement(Password).sendKeys("12345678");
        driver.findElement(LoginButton).click();
        String loginuserdisplay = driver.findElement(signinuserdisplay).getText();
         System.out.println(loginuserdisplay);
        Assert.assertEquals("testing testing",loginuserdisplay);
         JavascriptExecutor js=(JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(0,1000)");
         System.out.println("scrolledBy");
        driver.quit();
    }
}
