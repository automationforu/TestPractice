package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Facebooklogin {

    WebDriver driver;

    @Given("open browser")
    public void open_browser() {
        System.setProperty("webdriver.chrome.driver","C://My Softwares//drivers/chromedriver.exe");
        driver=new ChromeDriver();
    }

    @When("enter the url {string}")
    public void enter_the_url(String string) {
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @And("Enter username and password")
    public void enter_username_and_password() {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("manojkumar.21041996");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("ManojReddy@1996");
    }

    @And("Click on login button")
    public void click_on_login_button() throws InterruptedException {
        driver.findElement(By.xpath("//button[@id='u_0_b']")).click();

    }

    @Then("close browser")
    public void close_browser() {
        driver.quit();
    }

}
