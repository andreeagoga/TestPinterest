package examen.features.search;

import examen.steps.serenity.AccountSteps;
import examen.steps.serenity.LoginSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;

public class BaseClass {
    @Steps
    public LoginSteps login;

    @Steps
    public AccountSteps account;

    @Before
    public void setUp() {
        login.is_the_home_page();
        login.enters_data_and_click_login("andreea.ioana.goga@gmail.com", "pin1992");
    }
//
//    @After
//    public void tearDown() {
//        account.logout();
//    }
}