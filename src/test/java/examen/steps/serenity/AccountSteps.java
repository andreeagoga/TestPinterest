package examen.steps.serenity;

import examen.pages.AccountPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class AccountSteps {
    private AccountPage accountPage;

    @Step
    public void login_confirmation(String text){
        assertEquals(accountPage.login_confirmation_text(), text);
    }

    @Step
    public void enter_words_to_search(String text){
        accountPage.get_search_box_text(text);
    }

    @Step
    public void select_save_image() {
        accountPage.select_image();
        accountPage.save_image();
    }
}
