package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestsellersByQuantityPage {

    public WebDriver ldriver;

    public BestsellersByQuantityPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[@id=\"bestsellers-byquantity-grid\"]//a[@href=\"/Admin/Product/Edit/16\"]//../../td[1]")
    WebElement productText1;
    @FindBy(xpath = "//*[@id=\"bestsellers-byquantity-grid\"]//a[@href=\"/Admin/Product/Edit/17\"]//../../td[1]")
    WebElement productText2;
    @FindBy(xpath = "//*[@id=\"bestsellers-byquantity-grid\"]//a[@href=\"/Admin/Product/Edit/30\"]//../../td[1]")
    WebElement productText3;
    @FindBy(xpath = "//*[@id=\"bestsellers-byquantity-grid\"]//a[@href=\"/Admin/Product/Edit/34\"]//../../td[1]")
    WebElement productText4;

    @FindBy(xpath = "//*[@id=\"bestsellers-byquantity-grid\"]//a[@href=\"/Admin/Product/Edit/16\"]")
    WebElement viewBtn1;
    @FindBy(xpath = "//*[@id=\"bestsellers-byquantity-grid\"]//a[@href=\"/Admin/Product/Edit/17\"]")
    WebElement viewBtn2;
    @FindBy(xpath = "//*[@id=\"bestsellers-byquantity-grid\"]//a[@href=\"/Admin/Product/Edit/30\"]")
    WebElement viewBtn3;
    @FindBy(xpath = "//*[@id=\"bestsellers-byquantity-grid\"]//a[@href=\"/Admin/Product/Edit/34\"]")
    WebElement viewBtn4;

    @FindBy(xpath = "//h1[@class='pull-left']")
    WebElement editDisplayMsg;

    public String getProdutName1(){
        return  productText1.getText();
    }
    public String getProdutName12(){
        return  productText2.getText();
    }
    public String getProdutName3(){
        return  productText3.getText();
    }
    public String getProdutName4(){
        return  productText4.getText();
    }
    public void clickBViewBtn1(){
        viewBtn1.click();
    }
    public void clickBViewBtn2(){
        viewBtn2.click();
    }
    public void clickBViewBtn3(){
        viewBtn3.click();
    }
    public void clickBViewBtn4(){
        viewBtn4.click();
    }

    public String getEditPageMsg(){
        return editDisplayMsg.getText();
    }

















}
