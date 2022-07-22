package examen.pages.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class LoginErrorPage extends PageObject {
    @FindBy(css = "#__PWS_ROOT__ > div:nth-child(1) > div > div > div > div:nth-child(2) > div.Jea.MIw.TpD.mQ8.sLG.zI7.iyn.Hsu > div.Jea.MIw.QLY.Rym.jzS.mQ8.ojN.p6V.prG.sLG.zI7.iyn.Hsu > div > div > div > div > div > div > div > div:nth-child(4) > form > div:nth-child(1) > fieldset > span > div.hjj.zI7.iyn.Hsu")
    private WebElementFacade usernameError;

    @FindBy(css = "#password-error")
    private WebElementFacade passwordError;

    public String get_username_error(){
        return usernameError.getText();
    }

    public String get_password_error(){
        return passwordError.getText();
    }
}
