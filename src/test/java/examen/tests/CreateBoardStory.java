package examen.tests;

import examen.tests.login.BaseClass;
import examen.steps.AccountSteps;
import examen.steps.ProfileSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CreateBoardStory extends BaseClass {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public AccountSteps accountSteps;

    @Steps
    public ProfileSteps profileSteps;


    @Test
    public void create_board_test(){
        accountSteps.go_to_profile();
        profileSteps.create_board("Home");
        profileSteps.confirmation_board_created("Home");
    }
}
