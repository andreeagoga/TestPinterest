package examen.features.search;

import examen.pages.LoginPage;
import examen.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ValidLoginTest {

    @Managed(uniqueSession = true)
    public WebDriver webDriver;

    @Steps
    public LoginSteps loginSteps;

    @Issue("login valid")
    @Test
    public void login_valid(){
        loginSteps.is_the_home_page();
        loginSteps.enters_data_and_click_login("andreea.ioana.goga@gmail.com", "pin1992");
    }
}
