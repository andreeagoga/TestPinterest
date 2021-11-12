package examen.features.search;

import examen.steps.serenity.AccountSteps;
import examen.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
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
    public void login_confirmation(){
        accountSteps.confirm_login("Andreea Ioana.goga");
    }

    @Test
    public void search_images() {
        accountSteps.enter_words_to_search("wedding dress");
    }

    @Pending
    @Test
    public void search_confirmation(){
        accountSteps.enter_words_to_search("apple");
        accountSteps.confirm_search("apple");
    }

    @Test
    public void save_images() {
        accountSteps.enter_words_to_search("kids activities");
        accountSteps.select_save_image();
    }

}
