package techproed.day_03_locators;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C_01_WebelementsLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resourses/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //amazon sayfasina gidelim:
        driver.get("https://www.amazon.com");

        //arama kutusunu locate edelim
        /*
        Bir webelementin locate'ini birden fazla kullanacaksaniz bir Webelement'te değişken olarak atayabilirsiniz.
        Webelement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox")); şeklinde kullanabiliriz
        1-Locate işlemi bittikten sonra eğer webelemente bir metin göndereceksek sendKeys() methodu kullanırız
        2-webelemente tıklayacaksak click() methodu kullanırız
        3-webelementin üzerindeki yazıyı almak istiyorsak getText() methodunu kullanırız
        4-sendKeys() methodundan sonra(yani webElemente metin gönderdikten sonra) Keys.ENTER ile yada
        submit() methodu ile manuel olarak enter yaptığımız gibi otomasyonda da yapabiliriz.
         */
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
        //Bir webelementin locate'ini birden fazla kullanacaksanız bir Webelement'e değişken olarak atayabilirsiniz.



        //arama kutusuna Iphone yazdiralim ve aratalim
        //sayfayi kapatalim
        driver.close();


    }
}
