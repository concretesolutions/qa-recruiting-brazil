package stepDefinitions;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.springframework.beans.factory.annotation.Autowired;
import pageObjects.CadastroPage;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by assisjrs on 04/04/17.
 */
public class  InserçãoDeUsuariosSteps {
    @Autowired
    private CadastroPage cadastroPage;

    @Dado("^que já existe um usuário cadastrado$")
    public void queJáExisteUmUsuárioCadastrado() {}

    @Dado("^que o nome do usuário é \"([^\"]*)\" e o email \"([^\"]*)\"$")
    public void queONomeDoUsuárioÉEOEmail(final String nome, final String email) {
        cadastroPage.setNome(nome);
        cadastroPage.setEmail(email);
    }

    @Quando("^o usuário é inserido$")
    public void oUsuárioÉInserido() {
        cadastroPage.acessar();
        cadastroPage.novoUsuario();
    }

    @Então("^Devem existir (\\d+) usuários$")
    public void devemExistirUsuários(int usuariosCadastrados) throws Throwable {
        assertThat(cadastroPage.getUsuarios().size()).isEqualTo(usuariosCadastrados);
    }
}
