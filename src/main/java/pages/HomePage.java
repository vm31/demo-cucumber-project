package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
    public WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }





    @FindBy(xpath = "//div[@class=\"page-title\"]//h1[contains( text(),\"Admin area demo\")]")

    WebElement HomePageText;


    public boolean homePageText(){

        return HomePageText.isDisplayed();
    }
     public void getPageTitle(){
        driver.getTitle();
    }
}
