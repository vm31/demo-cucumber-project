package baseTest;

import helper.Utility;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import pages.HomePage;
import pages.ProductSearchPage;
import pages.SigninPage;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseTest {
    public HomePage homePage;
    public SigninPage signInPage;
    public Utility utility;
    public static Logger logger;
    public Properties configprop;
    public WebDriver driver;
    public ProductSearchPage productSearchPage;


}

