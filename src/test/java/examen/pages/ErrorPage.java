package examen.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ErrorPage extends PageObject {
    @FindBy(css = "[data-test-id='emailInputField'] fieldset>div> label[for='email']>div>div")
    private WebElementFacade usernameError;

    @FindBy(css ="#password-error")
    private WebElementFacade passwordError;

    public String getUsernameError(){
        return usernameError.getText();
    }

    public String getPasswordError(){
        return passwordError.getText();
    }
}
