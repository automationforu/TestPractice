package Draggable;

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

public class MyStepDef {


        WebDriver driver;

        @Given("Open Browser")
        public void OpenBrowser(){
            System.setProperty("webdriver.chrome.driver","C://My Softwares//drivers/chromedriver.exe");
            driver=new ChromeDriver();
        }
        @When("launch url {string}")
        public void launchUrl(String arg0) {
            driver.get("https://jqueryui.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }

        @And("click on Draggable")
        public void clickOnDraggable() {
            driver.findElement(By.xpath("//a[text()='Draggable']")).click();

        }
        @And("Switch to frame")
        public void Switchtoframe(){
            driver.switchTo().frame(0);
        }
        @And("Select WebElement To Drag")
        public void selectWebElementToDrag() {
            WebElement e= driver.findElement(By.xpath("//div[@id='draggable']"));
            int x=e.getLocation().getX();
            int y=e.getLocation().getY();
            Actions a=new Actions(driver);
            a.moveByOffset(x,y).build().perform();
            System.out.println(x);
            System.out.println(y);

        }

        @Then("Close Browser")
        public void closeBrowser() {
            driver.close();
        }
    }


