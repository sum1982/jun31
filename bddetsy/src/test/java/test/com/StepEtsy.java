/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author User
 */
public class StepEtsy {

    private static WebDriver driver;
    private String baseUrl = "https://www.etsy.com";

    @Given("^user is already on Home Page$")
    public void user_is_already_on_Home_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @When("^title of Home Page is Esty$")
    public void title_of_Home_Page_is_Esty() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone", driver.getTitle());
    }

    @Then("^user clicks on Sign in button$")
    public void user_clicks_on_Sign_in_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//header[@id='gnav-header-inner']/div[4]/nav/ul/li/button")).click();
    }

    @Then("^user enters Sign in data$")
    public void user_enters_Sign_in_data() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//*[@id=\"join_neu_email_field\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"join_neu_email_field\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"join_neu_email_field\"]")).sendKeys("tejas.shah1295@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"join_neu_password_field\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"join_neu_password_field\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"join_neu_password_field\"]")).sendKeys("Akuna456");
    }

    @Then("^user clicks submit button$")
    public void user_clicks_submit_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//*[@id=\"join-neu-form\"]/div[1]/div/div[5]/div/button")).click();
    }

    @Then("^user is on Welcome Page$")
    public void user_is_on_Welcome_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone", driver.getTitle());
    }

    @Then("^user close the browser$")
    public void user_close_the_browser() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
    }
}
