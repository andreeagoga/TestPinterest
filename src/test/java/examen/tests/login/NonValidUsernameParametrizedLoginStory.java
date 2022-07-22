package examen.tests.login;

import examen.steps.login.LoginErrorSteps;
import examen.steps.login.LoginSteps;
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
public class NonValidUsernameParametrizedLoginStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public LoginSteps loginSteps;

    @Steps
    public LoginErrorSteps errorSteps;

    private String username, password, message;

    @Issue("#errorLogin-1")
    @Test
    public void non_valid_username_login_test() {
        loginSteps.is_the_home_page();
        loginSteps.enters_data_and_click_login(username, password);
        errorSteps.should_see_username_error_test(message);
    }
}