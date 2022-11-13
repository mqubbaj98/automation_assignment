package steps;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import static Base.baseUtil.HOME_PAGE;
import static Base.baseUtil.driver;

public class floatingMenuSteps {


    @When("user clicks on {string}")
    public void userClicksOn(String menuItem) {

        driver.findElement(By.xpath("//a[normalize-space()='" + menuItem + "']")).click();
        System.out.println("User clicks on menu item");


    }

    @Then("user checks url to see {string} was added there")
    public void userChecksUrlToSeeWasAddedThere(String menuItem) {
        String userUrl = HOME_PAGE + "floating_menu#" + menuItem;

        /*System.out.println(userUrl);
        System.out.println(driver.getCurrentUrl());*/

        if (userUrl.equals(driver.getCurrentUrl())) {

            System.out.println("URLs are matching - Pass");

        } else {

            System.out.println("URLs are not matching - Fails");

        }
    }
}
