package techproed.day04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C02_WebElementLocator {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resourses/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com/");
        // arama kutusuna "city bike" yazıp aratın
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);


        // sonuc yazısını yazdırın
        List<WebElement>  sonucYazisi=driver.findElements(By.className("sg-col-inner"));
        System.out.println(sonucYazisi.get(0).getText());//1-16 of 178 results for "city bike"



        // sonuc sayısını yazdırın
        String [] sonucSayisi=sonucYazisi.get(0).getText().split(" ");
        System.out.println("sonuc sayisi: "+sonucSayisi[2]);
        //Sayfadaki 12. elementi list kullanmadan xpath'in index özelliğini kullanarak locate aldık
        WebElement onikinciElement = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[12]"));
        System.out.println(onikinciElement.getText());


        // ilk ürünün locatini alın
        List<WebElement> urunler=driver.findElements(By.className("s-image"));
        WebElement ilkUrun= urunler.get(0);

        // ilk ürünün, görünür olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrun.isDisplayed());


        // ilk ürünün, erisilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrun.isEnabled());
        // ilk ürünün, secilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(ilkUrun.isSelected());
        // ilk urune tıklayın
        ilkUrun.click();//web elementin uzerine tiklar
        // sayfayı kapatın
        driver.close();

            /*
            //ARAMA KUTUSUNUN HTML KODLARI
            <input type="text" value="" name="field-keywords" autocomplete="off"
            placeholder="Search Amazon" class="nav-input nav-progressive-attribute" dir="auto"
            tabindex="0" aria-label="Search Amazon" spellcheck="false">
             */
        //Relative Xpath syntax -->  //tagname[@attributeName='atributeValue']
        //input[@type='text']
        //                            (//input[@type='text'])[1]
        //                            //*[@type='text']
    /*
        Aldığımız xpath unique olmadığı zaman xpath'imizi parantez içine alarak index belirtebiliriz.
    Böylelikle webelementleri Liste atıp istediğimiz elementi almakla uğraşmayız.
    Xpath'in değişik kullanma yolları vardır.
     */



    }
}
