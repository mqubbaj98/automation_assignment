package steps;

import Base.baseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;


public class hooks extends baseUtil {


    @Before
    public void initializeTest() {

        System.out.println("Openning the browser: Chrome");

        //Passing a WebDriver instance
        System.setProperty("webdriver.chrome.driver", "/C:/Users/mqubbaj/Desktop/webdriver/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @After
    public void teardownTest() {

        System.out.println("\nclosing the browser: Chrome");
        //([WARNING]: Timed out connecting to Chrome, retrying...) this error is caused after adding the driver.close(); action.
        driver.close();
    }

}