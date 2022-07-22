package examen.steps;

import examen.pages.AccountPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class AccountSteps {
    private AccountPage accountPage;

    @Step
    public void confirm_login(String text){
        assertEquals(accountPage.set_login_confirmation_text(), text);
    }

    @Step
    public void enter_words_to_search(String text){
        accountPage.set_search_box_text(text);
    }

    @Step
    public void go_to_image(){
        accountPage.set_image();
    }

    @Step
    public void go_to_profile(){
        accountPage.set_profile();
    }

}
