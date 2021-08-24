package RZD;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationNegativeCases {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rzd.ru/");
        driver.findElement(By.xpath("//a/span[text()='Вход']")).click();
        driver.findElement(By.xpath("//a[text()='Регистрация']")).click();
        driver.findElement(By.name("E-MAIL")).sendKeys("qa12081997@mail.ru");
        driver.findElement(By.name("NAME")).sendKeys("qa1208199");
        driver.findElement(By.name("userpassword")).sendKeys("Qa12_08_1997");
        driver.findElement(By.name("userpassword_CONFIRM")).sendKeys("Qa12_08_1997");
        driver.findElement(By.name("FIRST_NAME")).sendKeys("Ольга");
        driver.findElement(By.name("LAST_NAME")).sendKeys("Абраменко");
        driver.findElement(By.name("LAST_NAME")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//span[@class='check__label static-content']/p[text()]")).click();
        driver.findElement(By.xpath("//span[@class=\"check__label static-content\"]/p/span")).click();
        driver.findElement(By.name("_CAPTCHA_VALUE")).sendKeys("662166");
        driver.findElement(By.xpath("//button[text()='Зарегистрироваться']")).click();
    }
}
