import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Browsers {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://My Softwares//drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.cricbuzz.com/");
        String a=driver.getTitle();
        System.out.println("Title of the current page :"+a);
        String b=driver.getCurrentUrl();
        System.out.println("The current Url :"+b);
        String c=driver.getPageSource();
        System.out.println("The Current Web Page Source :"+c);
        WebElement d=driver.findElement(By.xpath("//input[@id='search_bar']"));
        d.sendKeys("Rohit Sharma");
        d.clear();
        d.sendKeys("Virat kohli");
        d.clear();
        String x=d.getAttribute("value");
        System.out.println("Value of Attribute :"+x);
        String y=driver.findElement(By.xpath("//a[@title='Live Cricket Score']")).getText();
        System.out.println("Text of the WebElement is :"+y);
        List<WebElement> l=driver.findElements(By.tagName("a"));
        System.out.println(l.size());
        List<WebElement> i=driver.findElements(By.xpath("//input[@type='text']"));
        System.out.println(i.size());
        driver.close();

    }
}
