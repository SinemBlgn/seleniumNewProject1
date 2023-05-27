package techproed.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethod_ImplicitlyWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resourses/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        /*
        implicitlyWait(Duration.ofSeconds(20)) Sayfadaki webElementleri gorunur olana kadar(sayfada olusana kadar)
        maximum 20saniye bekler. Eger webElementler 2 saniyede olusursa 2 saniye bekler ve alt satira gecer.Fakat
        belirttigimiz maximum sure boyunca internetten yada sayfadan kaynakli olarak webElementler olusmazsa testimiz
        fail verir
         Thread.sleep() java kodlarini bizim belirttigimiz sure kadar bekler. 30 saniye beklemesini belirtirsem
    30 saniye bekler ve alt satira gecer .
       */

        //techproya gidelim
        driver.get("https://techproeducation.com");


        //amazona gidelim
        driver.get("https://www.amazon.com");



        //techpro sayfasina geri donelim
        driver.navigate().back();



        //sayfa basliginin techpro icerdigini test edelm
        String actualTitle=driver.getTitle();
        String expectedtitle="Techpro";
        if (actualTitle.contains(expectedtitle)){
            System.out.println("test PASSED");
        }else System.out.println("test FAILED");





        //tekrar amazon sayfasina gidelim
        driver.navigate().forward();
        //sayfa basliginin amamzon icerdigini test edelim
        String amazonActualTitle=driver.getTitle();
        String amazonExpectedTitle="Amazon";
        if(amazonActualTitle.contains(amazonExpectedTitle)){
            System.out.println("amazon:"+"iceriyor");
        }else System.out.println("amazon:"+"icermiyor");

        //sayfayi kapatiniz
        driver.close();





    }
}
