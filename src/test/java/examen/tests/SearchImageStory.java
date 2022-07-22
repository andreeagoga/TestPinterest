package examen.tests;

import examen.tests.login.BaseClass;
import examen.steps.AccountSteps;
import examen.steps.ImageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchImageStory extends BaseClass {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public AccountSteps accountSteps;

    @Steps
    public ImageSteps imageSteps;

    @Test
    public void search_images_test() {
        accountSteps.enter_words_to_search("apple");
        accountSteps.go_to_image();
        imageSteps.confirm_correct_search("Apple Crisp Mini Cheesecakes");
    }

}
