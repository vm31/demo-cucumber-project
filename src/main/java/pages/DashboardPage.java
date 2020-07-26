package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {


    @FindBy(xpath = "//div[@class=\"page-title\"]//h1[contains( text(),\"Admin area demo\")]")
    WebElement DashboardText;
    @FindBy(xpath = "//div[@class=\"page-title\"]//h1[contains( text(),\"Admin area demo\")]")
    WebElement title;

    public boolean DashboardText(){
        return DashboardText.isDisplayed();
    }
     public String getDashboardPageTitle(){
        return title.getText();
    }
}
