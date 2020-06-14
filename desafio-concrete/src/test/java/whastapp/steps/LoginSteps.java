package whastapp.steps;

import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import whastapp.util.Login;

public class LoginSteps {

    @After
    public void tearsDown(){
        Login.quitDriver();
    }

    @Dado("^que o usuário esteja logado na conta Web Whatsapp$")
    public void queOUsuárioEstejaLogadoNaContaWebWhatsapp() {
        Login.getDriver();
        Login.getWait();
    }

}
