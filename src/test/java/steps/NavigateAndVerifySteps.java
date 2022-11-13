package steps;

import Base.baseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import static Base.baseUtil.HOME_PAGE;
import static Base.baseUtil.driver;

//This step class is only created to hold and execute the first two steps for all the other feature files


public class NavigateAndVerifySteps {


    private baseUtil base;

    public NavigateAndVerifySteps(baseUtil base) {
        this.base = base;
    }

    //Used by all other steps files
    @Given("user navigates to wanted site {string}")
    public void usersNavigatesToWantedSite(String url) {

        base.setNavigate(url);

        base.setBaseurl(HOME_PAGE + base.getNavigate());

        driver.navigate().to(base.getBaseurl());

        driver.manage().window().maximize();

    }

    //Used by all other steps files
    @And("verifies that it is the wanted site")
    public void verifiesThatItIsTheWantedSite() {

        driver.findElement(By.className("example")).isDisplayed();

        System.out.println("site verified");
    }



}
