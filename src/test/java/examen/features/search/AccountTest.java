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

    @Test
    public void search_images() {
        accountSteps.enter_words_to_search("home decor ideas");
        accountSteps.enter_words_to_search("wedding dress");
        accountSteps.enter_words_to_search("fruits");
    }

    @Test
    public void save_images() {
        accountSteps.enter_words_to_search("kids activities");
        accountSteps.select_save_image();
    }

}
