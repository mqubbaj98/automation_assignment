package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import static Base.baseUtil.HOME_PAGE;
import static Base.baseUtil.driver;

public class loginPagesSteps {
    @When("user enters the credentials {string} and {string}")
    public void userEntersTheCredentialsAnd(String username, String password) {

        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);

        System.out.println("User enters credentials");

    }


    @And("submits")
    public void submits() {

        driver.findElement(By.className("radius")).click();

        System.out.println("user submits");
    }

    @Then("user should see a verification message {string} and login or logout button")
    public void userShouldSeeAVerificationMessageAndLoginOrLogoutButton(String message) {

        driver.findElement(By.cssSelector(".subheader")).isDisplayed();

        String messageToURL = HOME_PAGE + message;
        String checkURL = messageToURL.toString();
        try {


            if (driver.findElement(By.cssSelector(".button.secondary.radius")).isDisplayed()) {

                driver.findElement(By.id("flash")).isDisplayed();

                System.out.println("user is navigated to secure page" + " " + checkURL);//This was added to verify that the user was navigated to the intended page or not
                driver.findElement(By.cssSelector(".button.secondary.radius")).click();

                System.out.println("user logs out");

                driver.findElement(By.id("login")).isDisplayed();

                System.out.println("and verifies that they are back at the login page");
            }

        } catch (Exception e) {

            driver.findElement(By.id("flash")).isDisplayed();

            driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();//login button is displayed

            driver.findElement(By.id("login")).isDisplayed();

            System.out.println("User fails the log in");
            System.out.println(checkURL);


        }


    }
}
