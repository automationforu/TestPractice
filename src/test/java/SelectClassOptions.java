import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SelectClassOptions {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://My Softwares//drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("System.setProperty(\"webdriver.chrome.driver\",\"C://My Softwares//drivers/chromedriver.exe\");");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }
}
