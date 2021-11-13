package examen.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class ProfilePage extends PageObject {

    @FindBy(css = "#__PWS_ROOT__ > div.App.AppBase > div.appContent > div > div > div > div.Jea.m2F.mQ8.zI7.iyn.Hsu > div > div > div:nth-child(2) > div > h1")
    private WebElementFacade isProfile;

    @FindBy(css = "[data-test-id='boardActionsButton']")
    private WebElementFacade createButton;

    @FindBy(css = "[data-test-id='Create board']")
    private WebElementFacade createBoardButton;

    @FindBy(id = "boardEditName")
    private WebElementFacade boardNameTextBox;

    @FindBy(css = "body > div.NIm.MIw.QLY.Rym > div > div > div > div.ZHw.XiG.XbT._O1.SpV.OVX.rDA.jar.CCY > div > div:nth-child(3) > div > div > div > div > div > button")
    private WebElementFacade boardFinishButton;

    @FindBy(css = "body > div.NIm.MIw.QLY.Rym > div > div > div > div.ZHw.XiG.XbT._O1.SpV.OVX.rDA.jar.CCY > div > div:nth-child(3) > div > div > button > div")
    private WebElementFacade doneButton;

    @FindBy(css = "#__PWS_ROOT__ > div.App.AppBase > div.appContent > div > div > div > div:nth-child(1) > div > div > div > div.Bdr.Jea.KO4.gjz.mQ8.zI7.iyn.Hsu > h1")
    private WebElementFacade confirmBoardText;

    public void set_create_board(String text){
        isProfile.click();
        createButton.click();
        createBoardButton.click();
        boardNameTextBox.type(text);
        boardFinishButton.click();
        doneButton.click();
    }

    public String set_board_created_confirmation(){
        return confirmBoardText.getText();
    }





}
