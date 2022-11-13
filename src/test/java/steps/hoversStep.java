package steps;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static Base.baseUtil.HOME_PAGE;
import static Base.baseUtil.driver;

public class hoversStep {

    @When("user hovers over figure {string}")
    public void userHoversOverFigure(String fig) {

        driver.findElement(By.xpath("(//img[@alt='User Avatar'])[" + fig + "]")).isDisplayed();

        Actions act = new Actions(driver);

        WebElement figureHover = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[" + fig + "]"));

        act.moveToElement(figureHover).build().perform();

        System.out.println("User successfully hovers over figure");

    }

    @Then("user should be able to see figure {string}")
    public void userShouldBeAbleToSeeFigure(String fig) {

        driver.findElement(By.xpath("//h5[normalize-space()='name: user" + fig + "']")).isDisplayed();

        driver.findElement(By.xpath("(//a[contains(text(),'View profile')])[" + fig + "]")).isDisplayed();

        System.out.println("and verifies the caption is shown when hovering over");


    }

    @When("user clicks on figure caption {string}")
    public void userClicksOnFigureCaption(String view) {

        driver.findElement(By.xpath("(//a[contains(text(),'View profile')])[" + view + "]")).click();

        System.out.println("user clicks on figure 3's view profile");

    }

    @Then("user should be navigated to user {string} page")
    public void userShouldBeNavigatedToUserPage(String views) {
        String userUrl = HOME_PAGE + "users" + views;

        /*System.out.println(userUrl);
        System.out.println(driver.getCurrentUrl());*/

        if (userUrl.equals(driver.getCurrentUrl())) {

            System.out.println("URL check - Pass");

        } else {

            System.out.println("URL check - Fails");

        }

    }
}
