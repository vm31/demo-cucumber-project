package base;

import helper.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.*;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected LoginPage loginPageObj;
    public Utility utility;
    public static final WebDriver driver;
    protected CatalogMenuPage catalogMenuPageObj;
    protected BestsellersByQuantityPage bestSellersByQuantityPageObj;
    protected DashboardCommonStatisticsPage dashboardCommonStatisticsPageObj;
    protected CommonActionsPage commonActionsPageObj;







    static {

       System.setProperty("webdriver.chrome.driver","libraries//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //launch url should not have anything after ".com"
        driver.get("https://admin-demo.nopcommerce.com");

        Runnable r = new Runnable() {

            @Override
            public void run() {
                if (driver != null) {
                    driver.quit();
                }
            }
        };
        Runtime.getRuntime().addShutdownHook(new Thread(r));

    }

    

    public BaseTest() {
        loginPageObj= PageFactory.initElements(driver, LoginPage.class);
        catalogMenuPageObj=PageFactory.initElements(driver, CatalogMenuPage.class);
        utility=PageFactory.initElements(driver, Utility.class);
        bestSellersByQuantityPageObj=PageFactory.initElements(driver, BestsellersByQuantityPage.class);
        dashboardCommonStatisticsPageObj =PageFactory.initElements(driver, DashboardCommonStatisticsPage.class);
        bestSellersByQuantityPageObj=PageFactory.initElements(driver, BestsellersByQuantityPage.class);
        commonActionsPageObj=PageFactory.initElements(driver, CommonActionsPage.class);
    }


}

