package educational_Tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.Support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Day1 {
    WebDriver driver;
    //JavascriptExecutor jse;

    public void invokeBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ina Gous\\IdeaProjects\\web_driver\\resources\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");


        WebElement name =driver.findElement(By.name("q"));
            name.sendKeys("life meaning");

        WebElement arts=driver.findElement(By.name("btnK"));
            arts.click();

;[]
    }

    public static void main(String args[]){
        Day1 mybj = new Day1();
        mybj.invokeBrowser();
    }

}
