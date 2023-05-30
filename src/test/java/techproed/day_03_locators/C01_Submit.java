package techproed.day_03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Submit {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resourses/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //amazon sayfasina gidelim
        driver.get("https://www.amazon.com");
        //arama locate edip iphone artalim
       WebElement aramaKutusu=driver.findElement(By.name("field-keywords"));
       aramaKutusu.sendKeys("iphone");
       Thread.sleep(3000);
       aramaKutusu.submit();//keys.Enter


        //sayfayi kaoatalim
        driver.close();




    }
}
