package Base;

import org.openqa.selenium.WebDriver;


public class baseUtil {

    public static WebDriver driver;

    public static final String HOME_PAGE = "http://the-internet.herokuapp.com/";
    private String navigate;
    private String baseurl = HOME_PAGE + navigate;


    public String getNavigate() {
        return navigate;
    }

    public void setNavigate(String navigate) {
        this.navigate = navigate;
    }

    public String getBaseurl() {
        return baseurl;
    }

    public void setBaseurl(String baseurl) {
        this.baseurl = baseurl;
    }
}
