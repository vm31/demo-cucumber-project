package baseTest;

import helper.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SigninPage;

import java.util.Properties;

public class BaseTest {
    public HomePage homePage;
    public SigninPage signInPage;
    public Utility utility;
    public static Logger logger;
    public Properties configprop;
    public WebDriver driver;



}

