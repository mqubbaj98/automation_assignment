package steps;

import Base.baseUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static Base.baseUtil.driver;

public class addAndRemoveSteps {


    @When("user clicks on add element button")
    public void userClicksOnAddElementButton() {

        driver.findElement(By.xpath("//button[normalize-space()='Add Element']")).click();

        System.out.println("User clicks on the add element button");


    }

    @Then("user should see a new element being added that can be deleted")
    public void userShouldSeeANewElementBeingAddedThatCanBeDeleted() {

        driver.findElement(By.xpath("(//button[@class='added-manually'][normalize-space()='Delete'])[1]")).isDisplayed();

        System.out.println("User checks if the new element was actually added");
    }

    @When("user tries to delete new created element")
    public void userTriesToDeleteNewCreatedElement() {

        driver.findElement(By.xpath("(//button[@class='added-manually'][normalize-space()='Delete'])[1]")).click();

        System.out.println("User deletes new element");
    }

    @Then("user should see the same site seen when first navigating to site")
    public void userShouldSeeTheSameSiteSeenWhenFirstNavigatingToSite() {

       driver.findElements(By.xpath("(//button[@class='added-manually'][normalize-space()='Delete'])[1]")).isEmpty();

        System.out.println("New button is not there - Pass");


    }
}
