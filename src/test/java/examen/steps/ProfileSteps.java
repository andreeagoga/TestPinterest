package examen.steps;

import examen.pages.ProfilePage;
import net.thucydides.core.annotations.Step;

import static org.junit.Assert.assertEquals;

public class ProfileSteps {
    private ProfilePage profilePage;

    @Step
    public void create_board(String name){
        profilePage.set_create_board(name);
    }

    @Step
    public void confirmation_board_created(String text){
        assertEquals(profilePage.set_board_created_confirmation(), text);
    }

}
