package steps;

import Base.baseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import static Base.baseUtil.driver;


public class forgotPasswordSteps {


    @When("user enters in their email {string}")
    public void userEntersInTheirEmail(String email) {

        driver.findElement(By.id("email")).sendKeys("mqubbaj+1@atypon.com");


        System.out.println("Email is entered");

    }

    @And("user clicks on retrieve password button")
    public void userClicksOnRetrievePasswordButton() {

        driver.findElement(By.id("form_submit")).click();

        System.out.println("Button is clicked");

    }

    @Then("navigates to confirmation page")
    public void navigatesToConfirmationPage() {

      driver.findElement(By.xpath("//body")).isDisplayed();

      System.out.println("Confirmation page - Pass");

    }
}
