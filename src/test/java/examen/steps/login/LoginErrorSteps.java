package examen.steps.login;


import examen.pages.login.LoginErrorPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginErrorSteps {
    private LoginErrorPage loginErrorPage;

    @Step
    public void should_see_username_error_test(String message) {
        assertEquals(loginErrorPage.get_username_error(), message);
    }

    @Step
    public void should_see_password_error_test(String message) {
        assertEquals(loginErrorPage.get_password_error(), message);

    }
}


