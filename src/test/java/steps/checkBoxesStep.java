package steps;

import Base.baseUtil;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class checkBoxesStep extends baseUtil {

    @And("make sure that i navigated to the right site")
    public void makeSureThatINavigatedToTheRightSite() {

        driver.findElement(By.className("example")).isDisplayed();
        driver.findElement(By.id("checkboxes")).isDisplayed();

        System.out.println("User makes sure he can see the check boxes and the page title");

    }

    @When("user clicks on first checkbox")
    public void userClicksOnFirstCheckbox() {



        WebElement checkboxOne = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        boolean isCheckedOne = checkboxOne.isSelected();

            if (!isCheckedOne) {

            checkboxOne.click();
           }
        System.out.println("User clicks on the 1st checkbox to check it");


    }
    @And("user clicks on second checkbox")
    public void userClicksOnSecondCheckbox() {


        WebElement checkboxTwo = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        boolean isCheckedTwo = checkboxTwo.isSelected();

       if (!isCheckedTwo) {

            checkboxTwo.click();

        }

        System.out.println("User clicks on the 1st checkbox to make it unchecked");
    }

    @Then("the checkbox is checked")
    public void theCheckboxIsChecked() {



        boolean verify1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected();
        boolean verify2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected();

        System.out.println("Checking if 1st checkbox is checked and the second check box is unchecked");

        if (verify1){

            System.out.println("Checkbox 1 is checked - Pass");

        } else {

            System.out.println("Checkbox 1 is unchecked - Fails");

        }
         //changes whether we want the checkbox to be checked or not
        if (verify2){

             System.out.println("Checkbox 2 is still checked - Pass");

        } else {

            System.out.println("Checkbox 2 is unchecked - Fails");

        }


    }

}
