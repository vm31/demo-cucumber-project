package baseTest;

import helper.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.*;
import stepDefinition.CommonActions;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected HomePage homePage;
    protected LoginPage loginPageObj;
    public Utility utility;
    public static final WebDriver driver;
    protected ProductSearchPage productSearchPage;
    protected EditTablesPage editTablesPage;
    protected SwitchPage switchPage;
    protected BestsellersByQuantityPage bestsellersByQuantityPage;
    protected CommonActionsPage commonActionsObj;






    static {

        System.setProperty("webdriver.chrome.driver","E://demo-project//libraries//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://admin-demo.nopcommerce.com/login");

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
        homePage= PageFactory.initElements(driver,HomePage.class);
        loginPageObj= PageFactory.initElements(driver, LoginPage.class);
        productSearchPage=PageFactory.initElements(driver, ProductSearchPage.class);
        utility=PageFactory.initElements(driver, Utility.class);
        editTablesPage=PageFactory.initElements(driver, EditTablesPage.class);
        switchPage=PageFactory.initElements(driver, SwitchPage.class);
        bestsellersByQuantityPage=PageFactory.initElements(driver, BestsellersByQuantityPage.class);
        commonActionsObj=PageFactory.initElements(driver, CommonActionsPage.class);

    }


}

