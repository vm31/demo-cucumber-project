package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.DashboardPage;
import pages.LoggedInUserCommon;
import pages.SignInPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private static final WebDriver driver;
    protected DashboardPage dashboardPageObj;
    protected SignInPage signInPageObj;
    protected LoggedInUserCommon loggedInUserCommonObj;

    static {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.nl");

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
        dashboardPageObj= PageFactory.initElements(driver,DashboardPage.class);
        signInPageObj= PageFactory.initElements(driver,SignInPage.class);
        loggedInUserCommonObj= PageFactory.initElements(driver,LoggedInUserCommon.class);
    }

}

