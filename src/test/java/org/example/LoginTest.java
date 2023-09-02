package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    @Test
    public void main1() throws InterruptedException {
        String expectedtitle = "User Inyerface - A worst-practice UI experiment";
        String expectedtext = "Help";
        String expectedtitle2 = "How can we help?";
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://userinyerface.com/");
        String actualtitle = driver.getTitle();
        Assert.assertEquals(actualtitle, expectedtitle, "Main page is not open");
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[4]/p/a")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String actualtitle2 = driver.getTitle();
        Assert.assertEquals(actualtitle2, expectedtitle2, "Game page is not opened");
        driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div/div/div[1]/a")).click();
        String actualtext = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div/div/div[1]/a")).getAttribute("class");
        Assert.assertEquals(actualtext, expectedtext, "Help response is not displayed");
        driver.close();

    }

    @Test
    public void main2() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://userinyerface.com/");
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[4]/p/a")).click();
        driver.close();
    }

    @Test
    public void main3() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://userinyerface.com/");
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[4]/p/a")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[4]/div/div[1]/div/div[3]/form/div[1]/div[2]/input")).sendKeys("Livmo90iuk");
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[4]/div/div[1]/div/div[3]/form/div[1]/div[3]/div[1]/input")).sendKeys("kent8mkent");
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[4]/div/div[1]/div/div[3]/form/div[1]/div[3]/div[3]/input")).sendKeys("gmail");
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[4]/div/div[1]/div/div[3]/form/div[1]/div[3]/div[4]/div/div[1]/div[2]")).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[4]/div/div[1]/div/div[3]/form/div[1]/div[3]/div[4]/div/div[2]/div[9]")).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[4]/div/div[1]/div/div[3]/form/div[2]/a/span")).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div/div/div/div/div[2]/div/div/button")).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div/div/div/div/div[2]/div/div/button")).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[4]/div/div[1]/div/div[3]/form/div[4]/div[1]/a")).click();
        driver.close();
    }

    @Test
    public void main4() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://userinyerface.com/");
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[4]/p/a")).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[4]/div/div[1]/div/div[3]/form/div[1]/div[2]/input")).sendKeys("loivmiuk");
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[4]/div/div[1]/div/div[3]/form/div[1]/div[3]/div[1]/input")).sendKeys("kent8mkent");
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[4]/div/div[1]/div/div[3]/form/div[1]/div[3]/div[3]/input")).sendKeys("gmail");
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[4]/div/div[1]/div/div[3]/form/div[1]/div[3]/div[4]/div/div[1]/div[2]")).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[4]/div/div[1]/div/div[3]/form/div[1]/div[3]/div[4]/div/div[2]/div[9]")).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[4]/div/div[1]/div/div[3]/form/div[2]/a/span")).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div/div/div/div/div[2]/div/div/button")).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div/div/div/div/div[2]/div/div/button")).click();
        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[4]/div/div[1]/div/div[3]/form/div[4]/div[1]/a")).click();
        driver.close();

    }
}

