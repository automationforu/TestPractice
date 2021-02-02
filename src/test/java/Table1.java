import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Table1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C://My Softwares//drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
        List<WebElement> e=driver.findElements(By.xpath("//table[@id='task-table']//tr"));
        System.out.println(e.size());
        String column1="//table[@id='task-table']//tr[";
        String column2="]//td";
        String column;
        List<WebElement> tablecolumns;
        for (int i=1;i<e.size();i++){
            column=column1+i+column2;

            tablecolumns= driver.findElements(By.xpath(column));
            System.out.println("");

            for (int j=0;j<tablecolumns.size();j++){
                System.out.print(tablecolumns.get(j).getText()+"                  ");
            }

        }
        driver.close();

    }
}
