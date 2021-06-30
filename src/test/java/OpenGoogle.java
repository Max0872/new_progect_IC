import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenGoogle {
    WebDriver wd ;

    @BeforeMethod
    public void setUp(){
       wd = new ChromeDriver();
       wd.manage().window().maximize();

       wd.get("https://www.google.com/");

    }

    @Test
    public void searchWebDriver(){
      wd.findElement(By.name("q")).sendKeys("WebDriver" + Keys.ENTER);
      wd.findElement(By.name("q")).click();
      wd.findElement(By.name("q")).clear();


    }


    @AfterMethod
    public void tearDown(){
    wd.quit();

    }
}
