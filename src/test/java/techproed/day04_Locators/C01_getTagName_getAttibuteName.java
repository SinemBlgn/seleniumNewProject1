package techproed.day04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C01_getTagName_getAttibuteName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resourses/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // 1- amazon.com'a gidip arama kutusunu locate edin
        driver.get("https://www.amazon.com/");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));



       // 2- arama kutusunun tagName'inin input oldugunu test edin
        String actualTagName=aramaKutusu.getTagName();
        System.out.println(actualTagName);
        String expectedTagName="input";
        if (actualTagName.equals(expectedTagName)){
            System.out.println("test passed");
        }else System.out.println("test failed");



       // 3- arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin
        String actualAttributeName= aramaKutusu.getAttribute("name");
        System.out.println(actualAttributeName);
        String expectedAttributeName="field-keywords";
        if (actualAttributeName.equals(expectedAttributeName)){
            System.out.println("test passed");
        }else System.out.println("tesy failed");



       // 4- sayfayı kapatınız
        driver.close();















    }
}
