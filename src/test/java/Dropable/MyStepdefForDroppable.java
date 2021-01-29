package Dropable;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MyStepdefForDroppable {

    WebDriver driver;

    @Given("Open Browser")
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver","C://My Softwares//drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("Enter url {string}")
    public void enterUrl(String arg0) {
        driver.get("https://jqueryui.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @And("click on Droppable")
    public void clickOnDroppable() {
        driver.findElement(By.xpath("//a[text()='Droppable']")).click();
    }

    @And("Switch to frame")
    public void switchToFrame() {
        driver.switchTo().frame(0);
    }

    @And("select element to drop")
    public void selectElementToDrop() {
        WebElement a=driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement b=driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions c=new Actions(driver);
        c.dragAndDrop(a,b).perform();
    }

    @Then("close browser")
    public void closebrowser() {
        driver.close();

    }
}
