package steps;

import Base.baseUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class dropDownListSteps extends baseUtil {




    @When("user clicks on the dropdown list options and chooses option {string}")
    public void userClicksOnTheDropdownListOptionsAndChoosesOption(String option) {

        driver.findElement(By.xpath("//select[@id='dropdown']")).click();
        System.out.println("User opens dropdown list");

        driver.findElement(By.xpath("//option[@value='"+ option +"']")).click();
        System.out.println("User chooses an option from dropdown list");

    }

    @Then("verifies that options {string} was chosen")
    public void verifiesThatOptionsWasChosen(String option) {

        driver.findElement(By.xpath("//option[@value='"+ option +"']")).isDisplayed();
        System.out.println("");

    }




}
