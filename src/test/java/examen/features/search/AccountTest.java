package examen.features.search;

import examen.steps.serenity.AccountSteps;
import examen.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class AccountTest extends BaseClass{

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public AccountSteps accountSteps;

    @Test
    public void confirm_login(){
        accountSteps.login_confirmation("Andreea Ioana.goga");
    }

}
