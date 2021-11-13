package examen.features.search;

import examen.steps.serenity.ErrorSteps;
import examen.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("src\\test\\resources\\NonValidUsername.csv")
public class NonValidUsernameParametrizedLoginTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LoginSteps login;

    @Steps
    public ErrorSteps errors;

    private String username, password, message;

    @Issue("#errorLogin-1")
    @Test
    public void NonValidUsernameLoginTest() {
        login.is_the_home_page();
        login.enters_data_and_click_login(username, password);
        errors.should_see_username_error_test(message);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}