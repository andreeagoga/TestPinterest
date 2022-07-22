package examen.tests.login;

import examen.steps.AccountSteps;
import examen.steps.login.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ValidLoginStory {

    @Managed(uniqueSession = true)
    public WebDriver webDriver;

    @Steps
    public LoginSteps loginSteps;

    @Steps
    public AccountSteps accountSteps;

    @Issue("login valid")
    @Test
    public void valid_login_test() {
        loginSteps.is_the_home_page();
        loginSteps.enters_data_and_click_login("username@gmail.com", "password");
        accountSteps.confirm_login("Andreea Ioana.goga");
    }
}
