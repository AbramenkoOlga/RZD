package RZD;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Entrance {
    private static WebDriver driver;

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rzd.ru/");
        driver.findElement(By.xpath("//a/span[text()='Вход']")).click();

        driver.findElement(By.xpath("//input[@name = 'j_username']")).sendKeys("qa12081997");
        driver.findElement(By.xpath("//input[@name = 'j_password']")).sendKeys("Qa12_08_1997");
        driver.findElement(By.xpath("//button[text()='Войти']")).sendKeys(Keys.ENTER);
    }
}
