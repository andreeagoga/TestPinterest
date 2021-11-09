package examen.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class AccountPage extends PageObject {

    @FindBy(css = "#HeaderContent > div > div > div > div.zI7.iyn.Hsu > div > div > div > div.Jea.gjz.zI7.iyn.Hsu > div:nth-child(5) > button")
    private WebElementFacade confirmLoginButton;

    @FindBy(css = "#HeaderContent > div > div > div > div.zI7.iyn.Hsu > div > div > div > div.Jea.gjz.zI7.iyn.Hsu > div:nth-child(6) > div > div > div > div > div > div > div:nth-child(1) > div:nth-child(1) > div.hjj.zI7.iyn.Hsu > div > div > a > div > div.DUt.Jea.gjz.hA-.jar.zI7.iyn.Hsu > div:nth-child(2) > div.tBJ.dyH.iFc.yTZ.pBj.zDA.IZT.mWe.CKL")
    private WebElementFacade confirmLoginText;

//    public void login_confirmation_button(){
//        confirmLoginButton.click();
//    }

    public String login_confirmation_text(){
        return confirmLoginText.getText();
    }



}
