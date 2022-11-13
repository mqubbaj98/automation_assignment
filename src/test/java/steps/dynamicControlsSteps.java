package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Base.baseUtil.driver;

public class dynamicControlsSteps {


    @Then("user verifies that controls {string} subheaders are showing")
    public void userVerifiesThatControlsSubheadersAreShowing(String subHeaders) {

        driver.findElement(By.xpath("//h4[normalize-space()='" + subHeaders + "']")).isDisplayed();
        System.out.println("User checks if subheaders are visible");

    }

    @When("user checks checkbox")
    public void userChecksCheckbox() {

        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        System.out.println("User checks checkbox");

    }

    @When("user clicks on {string} button")
    public void userClicksOnButton(String actionButton) {


        driver.findElement(By.xpath("//button[normalize-space()='" + actionButton +"']")).click();
        System.out.println("User clicks on action button");


    }

    @Then("waits for action to be done")
    public void waitsForActionToBeDone() {

        Duration times = Duration.ofSeconds(10);

        WebDriverWait wait = new WebDriverWait(driver,times);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        System.out.println("User waits until action is done");


    }

    @And("verifies that the action was executed and confirmation message is present")
    public void verifiesThatTheActionWasExecutedAndConfirmationMessageIsPresent() {

        driver.findElement(By.xpath("//p[@id='message']")).isDisplayed();
        System.out.println("verifies that confirmation message is showing");


    }

    @And("verifies that the check box is back and confirmation message is present")
    public void verifiesThatTheCheckBoxIsBackAndConfirmationMessageIsPresent() {

        driver.findElement(By.xpath("//div[normalize-space()='A checkbox']")).isDisplayed();
        driver.findElement(By.xpath("//p[@id='message']")).isDisplayed();
        System.out.println("Verifies that verification message appears and checkbox is back");

    }


    @And("writes {string} in the enabled empty field")
    public void writesInTheEnabledEmptyField(String text) {

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(text);
        System.out.println("User fills in empty field with test");



    }
}
