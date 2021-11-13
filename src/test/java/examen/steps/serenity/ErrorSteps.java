package examen.steps.serenity;


import examen.pages.ErrorPage;
import net.thucydides.core.annotations.Step;
import org.yecht.JechtIO;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertTrue;

public class ErrorSteps {
    private ErrorPage errorPage;

    @Step
    public void should_see_username_error_test(String message) {
        String text = errorPage.getUsernameError();
        assertTrue(text.contains(message));
    }

    @Step
    public void should_see_password_error_test(String message) {
        String text = errorPage.getPasswordError();
        assertTrue(text.contains(message));
    }
}


