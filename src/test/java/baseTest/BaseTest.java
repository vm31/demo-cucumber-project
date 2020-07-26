package baseTest;

import helper.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.DashboardPage;
import pages.ProductSearchPage;
import pages.SignInPage;

public class BaseTest {
    public DashboardPage dashboardPageObj;
    public SignInPage signInPageObj;
    public Utility util;
    public WebDriver driver;
    public ProductSearchPage productSearchPageObj;

    public BaseTest(){
        dashboardPageObj= PageFactory.initElements(driver,DashboardPage.class);
        signInPageObj= PageFactory.initElements(driver,SignInPage.class);
        util= PageFactory.initElements(driver,Utility.class);
        productSearchPageObj= PageFactory.initElements(driver,ProductSearchPage.class);
    }

}

