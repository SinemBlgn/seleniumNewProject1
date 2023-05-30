package techproed.day_03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_findElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resourses/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//Amazon sayfasına gidelim
        driver.get("https://www.amazon.com");

//Sayfadaki linklerin sayısını ve linkleri yazdıralım
   /*
        findelement ile bir webelemente ulasabilirken,
        birden fazla webelement icin findelements methodunu kullaniriz. Bu webelementlerin sayisina ulasmak icin ya da
        bu webelementlerin yazisini konsola yazdirabilmek icin list<Webelement> linklerinlistesi == driver.findelements(By.locator("locator degeri)) olarak kullaniriz
        Olusturmus oldugumuz listi loop ole konsola yazdirabiliriz
         */
        List<WebElement> linklerListesi= driver.findElements(By.tagName("a"));
        System.out.println("Linklerin sayisi:"+linklerListesi.size());

        /*for (WebElement w: linklerListesi){
            if (!w.getText().isEmpty()) {
                System.out.println(w.getText());
            }
        }

         */

        //lambda
        linklerListesi.forEach(link -> {if (!link.getText().isEmpty())
        {System.out.println(link.getText());}});

        //Shop deals in Electronics webElementinin yazısını yazdıralım
        System.out.println("**********************************************************");
        System.out.println(driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText());
        WebElement webElementYazisi = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        System.out.println(webElementYazisi.getText());




        driver.close();













    }
}
