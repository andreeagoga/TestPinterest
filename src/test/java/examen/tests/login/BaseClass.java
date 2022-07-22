package examen.tests.login;


import examen.steps.login.LoginSteps;
import net.serenitybdd.core.annotations.events.BeforeScenario;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;

public class BaseClass {
    @Steps
    public LoginSteps loginSteps;

    @Before
    public void set_Up() {
        loginSteps.is_the_home_page();
        loginSteps.enters_data_and_click_login("andreea.ioana.goga@gmail.com", "pin1992");
    }

}
