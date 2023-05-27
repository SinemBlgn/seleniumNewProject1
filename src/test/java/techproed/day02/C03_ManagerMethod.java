package techproed.day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManagerMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resourses/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //browser in konumunu yazdiralim
        System.out.println("sayfanin konumu:"+driver.manage().window().getPosition());

        //browser in boyutlarini yazdiralim
        System.out.println("sayfanin boyutlari"+driver.manage().window().getSize());

        //browser i maximize yapalim
        driver.manage().window().maximize();
        /*
    Bir web sitesine gittiğimizde browser default olarak bir boyutta gelir. Ve açılan browser'daki
webElementlere browser maximize olmadığı için ulaşamayabiliriz. Dolayısıyla browser'ı açtıktan sonra
maximize yaparsak driver bütün webelementleri görür ve rahatlikla müdehale edebilir. Bu yüzden
browser'ı açtıktan sonra ilk olarak driver.manage().window().maximize(); yapmamız bizim webelementlere
ulaşmada işimizi kolaylaştırır. Böylelikle fail almamış oluruz
 */

        //techpro sayfasina gidelim
        driver.get("https://techproeducation.com");

       // browser in konumunu yazdiralim
        System.out.println("sayfanin konumu:"+driver.manage().window().getPosition());

        //browser in boyutlarini yazdiralim
        System.out.println("sayfanin boyutlari"+driver.manage().window().getSize());
        Thread.sleep(3000);

        //sayfayi minimize yaptiralim
        driver.manage().window().minimize();
        Thread.sleep(3000);

        //sayfayi fullscreen yapalm
        driver.manage().window().fullscreen();

        driver.manage().window().setPosition(new Point(50,50));//istedigimiz konuma getirir
        driver.manage().window().setSize(new Dimension(600,600));//istedigimiz size a getirir

        //sayfaayi kapatalim
        driver.close();



















    }
}
