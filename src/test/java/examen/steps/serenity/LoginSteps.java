package examen.steps.serenity;

import examen.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {
    LoginPage loginPage;

    @Step
    public void is_the_home_page() {
        loginPage.open();
        loginPage.getDriver().manage().window().maximize();
    }

    @Step
    public void enters_data_and_click_login(String email, String password) {
        loginPage.set_login_button();
        loginPage.set_email(email);
        loginPage.set_password(password);
        loginPage.set_submit_button();
    }
}
