package stepDefinitions;

import cucumber.api.java.pt.Quando;

public class LoginSteps {
    @Quando("^o \"([^\"]*)\" realiza uma ação$")
    public void oRealizaUmaAção(final String usuario) {
        //fazer login
    }
}
