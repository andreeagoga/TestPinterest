package examen.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.util.List;

public class AccountPage extends PageObject {

    @FindBy(css = "#HeaderContent > div > div > div > div.zI7.iyn.Hsu > div > div > div > div.Jea.gjz.zI7.iyn.Hsu > div:nth-child(5) > button")
    private WebElementFacade confirmLoginButton;

    @FindBy(css = "#HeaderContent > div > div > div > div.zI7.iyn.Hsu > div > div > div > div.Jea.gjz.zI7.iyn.Hsu > div:nth-child(6) > div > div > div > div > div > div > div:nth-child(1) > div:nth-child(1) > div.hjj.zI7.iyn.Hsu > div > div > a > div > div.DUt.Jea.gjz.hA-.jar.zI7.iyn.Hsu > div:nth-child(2) > div.tBJ.dyH.iFc.yTZ.pBj.zDA.IZT.mWe.CKL")
    private WebElementFacade confirmLoginText;

    @FindBy(name = "searchBoxInput")
    private WebElementFacade searchBox;

    @FindBy(css = "#__PWS_ROOT__ > div.App.AppBase > div.appContent > div > div > div > div > div.gridCentered > div > div > div:nth-child(1) > div:nth-child(1)")
    private List<WebElementFacade> selectImage;

    @FindBy(css = "#__PWS_ROOT__ > div.App.AppBase > div.appContent > div > div > div > div.Closeup.Module.flex.flex-auto.justify-around.flex-column > div > div > div > div > div.m2F.zI7.iyn.Hsu > div > div > div > div > div > div > div > div > div:nth-child(2) > div > div.qiB > div > div > div > div.Pyg.zI7.iyn.Hsu")
    private WebElementFacade saveButton;

    public String login_confirmation_text(){
        confirmLoginButton.click();
        return confirmLoginText.getText();
    }

    public void get_search_box_text(String text) {
        searchBox.typeAndEnter(text);
    }

    public void select_image() {
        selectImage.get(0).click();
    }

    public void save_image() {
        saveButton.click();
    }



}
