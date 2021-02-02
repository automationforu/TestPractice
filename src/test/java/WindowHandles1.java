import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandles1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://My Softwares//drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.in/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String a=driver.getWindowHandle();
        System.out.println(a);

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();

        Set<String> x= driver.getWindowHandles();
        System.out.println(x);
        Iterator<String> itr =x.iterator();

        while(itr.hasNext()){

            String y= itr.next();
            driver.switchTo().window(y);
            System.out.println(driver.getTitle());
            driver.close();
        }

//        for (String handle:x) {
//            driver.switchTo().window(handle);
//            System.out.println(driver.getTitle());
//            driver.close();
//        }
        Thread.sleep(5);
        driver.switchTo().window(a);
        System.out.println(driver.getTitle());
        driver.close();
    }
}
