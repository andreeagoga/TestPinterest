package examen.features.search;

import examen.pages.ImagePage;
import examen.steps.serenity.AccountSteps;
import examen.steps.serenity.ImageSteps;
import examen.steps.serenity.LoginSteps;
import examen.steps.serenity.ProfileSteps;
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

    @Steps
    public ImageSteps imageSteps;

    @Steps
    public ProfileSteps profileSteps;

    @Test
    public void login_confirmation(){
        accountSteps.confirm_login("Andreea Ioana.goga");
    }

    @Test
    public void search_images() {
        accountSteps.enter_words_to_search("apple");
        accountSteps.go_to_image();
        imageSteps.confirm_correct_search("Old Fashioned Easy Apple Crisp");
    }

    @Test
    public void save_images() {
        accountSteps.enter_words_to_search("dress");
        accountSteps.go_to_image();
        imageSteps.push_save_button("Saved");
    }

    @Test
    public void create_board(){
        accountSteps.go_to_profile();
        profileSteps.create_board("Activities");
        profileSteps.confirmation_board_created("Activities");
    }

}

//BUGS
//1.Nu se retrage bara de meniu pentru a accesa setarea de creare director (ProfilePage, linia 11)
//2.Exista doua "+" care creaza un director/pin
//3.Poti salva o imagine de foarte multe ori
//4.Nu apare acelasi mesaj sub imaginea creata, astfel trebuie uneori sa dai refresh(nu am putut identifica imaginea dupa text)
//5.Daca trebuie sa stergi o imagine cateodata trebuie sa apesi de doua ori pe edit sau trebuie sa dai refresh pentru a o sterge
