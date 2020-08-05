package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardCommonStatisticsPage {
    public WebDriver driver;

    public DashboardCommonStatisticsPage(WebDriver driver) {
        this.driver = driver;
    }


    @FindBy(xpath = "//div[@id='nopcommerce-common-statistics-box']//div[@class='box-header with-border clearfix']//div[1]")
    WebElement commonStatsHeader;

    @FindBy(xpath = "//div[@class='small-box bg-aqua']//a[@class='small-box-footer'][contains(text(),'More info')]")
    WebElement ordersBox;

    @FindBy(xpath = "//div[@class='small-box bg-yellow']//a[@class='small-box-footer'][contains(text(),'More info')]")
    WebElement pendingBox;

    @FindBy(xpath = "//div[@class='small-box bg-green']//a[@class='small-box-footer'][contains(text(),'More info')]")
    WebElement registerBox;

    @FindBy(xpath = "//div[@class='small-box bg-red']//a[@class='small-box-footer'][contains(text(),'More info')]")
    WebElement lowStockBox;






    public boolean verifyCommonStatsHeader(){
        return commonStatsHeader.isDisplayed();
    }

    public void clickOrdersBox(){
        ordersBox.click();
    }
    public void clickPendingBox(){

        pendingBox.click();
    }
    public void clickRegisterBox(){
        registerBox.click();
    }
    public void clickLowStockBox(){
        lowStockBox.click();

    }


}
