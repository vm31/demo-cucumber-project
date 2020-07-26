package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public WebDriver ldriver;

    public HomePage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }





    @FindBy(xpath = "//div[@class=\"page-title\"]//h1[contains( text(),\"Admin area demo\")]")

    WebElement HomePageText;


    public boolean homePageText(){

        return HomePageText.isDisplayed();
    }
     public void getPageTitle(){
        ldriver.getTitle();
    }
}
