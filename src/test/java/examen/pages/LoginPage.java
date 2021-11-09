package examen.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.pinterest.com/")
public class LoginPage extends PageObject {

        @FindBy(css = "#__PWS_ROOT__ > div:nth-child(1) > div > div > div > div:nth-child(2) > div.Jea._he.b8T.gjz.zI7.iyn.Hsu > div.Jea.l7T.zI7.iyn.Hsu > div:nth-child(2) > button")
        private WebElementFacade loginButton;

        @FindBy(id = "email")
        private WebElementFacade emailTextBox;

        @FindBy(id = "password")
        private WebElementFacade passwordTextBox;

        @FindBy(css = "#__PWS_ROOT__ > div:nth-child(1) > div > div > div > div:nth-child(2) > div.Jea.MIw.TpD.mQ8.sLG.zI7.iyn.Hsu > div.Jea.MIw.QLY.Rym.jzS.mQ8.ojN.p6V.prG.sLG.zI7.iyn.Hsu > div > div > div > div > div > div > div > div:nth-child(4) > form > div:nth-child(5) > button")
        private WebElementFacade submitButton;

        public void push_login_button(){
                loginButton.click();
        }

        public void enter_email(String email){
                emailTextBox.type(email);
        }

        public void enter_password(String password){
                passwordTextBox.type(password);
        }

        public void push_submit_button(){
                submitButton.click();
        }

}
