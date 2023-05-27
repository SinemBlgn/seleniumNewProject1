package techproed.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resourses/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //techproeducation sayfasina gidelim
      driver.navigate().to("https://techproeducation.com");//get methodu ile ayni mantikta calisir
        Thread.sleep(3000);//javakodlarini bekletmek icin

        //amazon sayfasina gidelim
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(3000);

        //amazon sayfasinin basligini yazdiralim
        System.out.println("amazon sayfa basligi:"+driver.getTitle() );
        Thread.sleep(3000);
        //techproeducation sayfasina geri donelim
        driver.navigate().back();
        Thread.sleep(3000);
        //sayfa basligini yazdiralim
        System.out.println("techpro sayfa baslgi"+driver.getTitle());
        Thread.sleep(3000);

        //amamzon sayfasina tekrar gidip url i yazdiralim
        driver.navigate().forward();
        System.out.println("amazon sayfasi url'i"+driver.getCurrentUrl());
        Thread.sleep(3000);

        //amamzon sayfasindayken sayfayi yenileyelim
        driver.navigate().refresh();
        Thread.sleep(3000);

        //sayfayi kapatalim
        driver.close();


















    }
}
