package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestsellersByQuantityPage {

    public WebDriver driver;

    public BestsellersByQuantityPage(WebDriver driver) {
        this.driver=driver;

    }


    public String getProductName1(int rowNumber){
        WebElement productNameElem = driver.findElement(By.xpath("//*[@id='bestsellers-byquantity-grid']//a[@href=('/Admin/Product/Edit/"+rowNumber+"')]//../../td[1]"));
        String x = productNameElem.getText();
        System.out.println(x);
        return  x;
    }

    public String getEditProductHeader(int rowNumber){
        WebElement editHeader= driver.findElement(By.xpath("//*[@action='/Admin/Product/Edit/"+rowNumber+"']/div[@class='content-header clearfix']/h1"));
        return editHeader.getText();
    }


















}
