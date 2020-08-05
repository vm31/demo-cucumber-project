package steps;

import base.BaseTest;
import com.sun.xml.internal.rngom.parse.host.Base;
import cucumber.api.java.en.And;

public class CommonActionsStep extends BaseTest {


    @And("I click on login button")
    public void i_click_on_login() {
        loginPageObj.ClickLogin();
    }
}
