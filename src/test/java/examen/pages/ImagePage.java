package examen.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.util.List;

public class ImagePage extends PageObject {

    @FindBy(css = "#__PWS_ROOT__ > div.App.AppBase > div.appContent > div > div > div > div.Closeup.Module.flex.flex-auto.justify-around.flex-column > div > div > div > div > div.m2F.zI7.iyn.Hsu > div > div > div > div > div > div > div > div > div:nth-child(2) > div > div.Jea.jzS.zI7.iyn.Hsu > div > div > div:nth-child(2) > div > div > div > div > div > a > h1")
    private WebElementFacade confirmSearchText;

    @FindBy(css = "[data-test-id='PinBetterSaveButton']")
    private WebElementFacade saveButton;

    @FindBy(css = "[class='tBJ dyH iFc yTZ erh tg7 mWe']")
    private WebElementFacade savedText;

//    @FindBy(css = "#__PWS_ROOT__ > div.App.AppBase > div.appContent > div > div > div > div.Closeup.Module.flex.flex-auto.justify-around.flex-column > div > div > div > div > div.m2F.zI7.iyn.Hsu > div > div > div > div > div > div > div > div > div:nth-child(2) > div > div.qiB > div > div > div > div.Pyg.zI7.iyn.Hsu > div > div > div > div > div.Shl.ujU.zI7.iyn.Hsu > a > div > div")
//    private WebElementFacade profileButton;

    public String set_confirm_correct_search(){
        return confirmSearchText.getText();
    }

    public String set_save_image() {
        saveButton.click();
        return savedText.getText();
    }

//    public void set_profile(){
//        profileButton.click();
//    }
}
