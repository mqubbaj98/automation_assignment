package steps;

import Base.baseUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;


import java.util.List;


public class basicLoginStep extends baseUtil {




    @When("user enters the following given credentials in the URL")
    public void userEntersTheFollowingGivenCredentialsInTheURL(DataTable table) {


        List<List<String>> data = table.cells();

        String url = "https://" + data.get(1).get(0) + ":" + data.get(1).get(1) + "@" + "the-internet.herokuapp.com/basic_auth";
        driver.get(url);

        System.out.println("user logs in by entering credentials through the URL");
    }



    @Then("user should see confirmation page")
    public void userShouldSeeConfirmationPage() {

        driver.findElement(By.className("example")).isDisplayed();
        driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credenti')]")).isDisplayed();

        System.out.println("verifies that they are the verification page");

    }


}
