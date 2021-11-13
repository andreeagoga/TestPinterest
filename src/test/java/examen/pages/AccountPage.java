package examen.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.util.List;
import java.util.Locale;

public class AccountPage extends PageObject {

    @FindBy(css = "#HeaderContent > div > div > div > div.zI7.iyn.Hsu > div > div > div > div.Jea.gjz.zI7.iyn.Hsu > div:nth-child(5) > button")
    private WebElementFacade confirmLoginButton;

    @FindBy(css = "#HeaderContent > div > div > div > div.zI7.iyn.Hsu > div > div > div > div.Jea.gjz.zI7.iyn.Hsu > div:nth-child(6) > div > div > div > div > div > div > div:nth-child(1) > div:nth-child(1) > div.hjj.zI7.iyn.Hsu > div > div > a > div > div.DUt.Jea.gjz.hA-.jar.zI7.iyn.Hsu > div:nth-child(2) > div.tBJ.dyH.iFc.yTZ.pBj.zDA.IZT.mWe.CKL")
    private WebElementFacade confirmLoginText;

    @FindBy(name = "searchBoxInput")
    private WebElementFacade searchBox;

    @FindBy(css = "#__PWS_ROOT__ > div.App.AppBase > div.appContent > div > div > div.zI7.iyn.Hsu > div.zI7.iyn.Hsu > div:nth-child(1) > div > div > div > div:nth-child(1) > div:nth-child(2)")
    private List<WebElementFacade> selectImage;


    public String set_login_confirmation_text(){
        confirmLoginButton.click();
        return confirmLoginText.getText();
    }

    public void set_search_box_text(String text) {
        searchBox.typeAndEnter(text);
    }

    public void set_image(){
        selectImage.get(0).click();
    }

    public void set_profile(){
        confirmLoginButton.click();
        confirmLoginText.click();

    }



}
