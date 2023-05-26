package techproed.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Ilktest {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resourses/driver/chromedriver.exe");
        //java uygulamalarinda sistem ozelliklerini ayarlamak icin setProperty methodu ile kullaniriz
        //setproperty methodu ile classlarimiza driver in fiziki yolunu belirtiriz

        System.out.println(System.getProperty("chromeDriver"));
    //getProperty ile "Key" degerini girerek "value"ya ulasabilirim
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        driver.get("https://techproeducation.com");//get() methodu ile String olarak girilen url'e gideriz






    }
}
