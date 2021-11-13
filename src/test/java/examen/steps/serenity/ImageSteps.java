package examen.steps.serenity;

import examen.pages.ImagePage;
import net.thucydides.core.annotations.Step;

import static org.junit.Assert.assertEquals;

public class ImageSteps {

    private ImagePage imagePage;

    @Step
    public void confirm_correct_search(String text){
        assertEquals(imagePage.set_confirm_correct_search(), text);
    }

    @Step
    public void push_save_button(String text) {
        assertEquals(imagePage.set_save_image(), text);
    }

//    @Step
//    public void go_to_profile() {
//        imagePage.set_profile();
//    }
}
