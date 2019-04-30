package stepDefinitions;

import config.DBUnit;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.assertj.db.type.Request;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import pageObjects.CadastroPage;

import javax.sql.DataSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.db.api.Assertions.assertThat;

/**
 * Created by assisjrs on 04/04/17.
 */
public class ListaDeUsuariosSteps {
    @Autowired
    private CadastroPage cadastroPage;

    @Autowired
    private DataSource dataSource;

    @Autowired
    private DBUnit dbUnit;

    private Request usuarios;

    @Dado("^que deve-se sempre ter o administrador cadastrado$")
    public void queDeveSeSempreTerOAdministradorCadastrado() throws Throwable {
        dbUnit.cleanInsert("EncontrarUsuarioPorEmail.xml");
    }

    @Quando("^pesquisa-se pelo email \"([^\"]*)\"$")
    public void sePesquisaPeloEmail(String email) {
        usuarios = new Request(dataSource, "select nome from usuario where email = ?");
        usuarios.setParameters(email);
    }

    @Então("^o email deve estar associado ao usuário \"([^\"]*)\"$")
    public void oEmailDeveEstarAssociadoAoUsuário(String usuario) {
        assertThat(usuarios).column("nome")//
                .value().isEqualTo(usuario);
    }

    @Dado("^exista o usuário \"([^\"]*)\" cadastrado$")
    public void existaOUsuárioCadastrado(String arg0) throws Throwable {
        dbUnit.cleanInsert("VisualizarTodosOsOutrosUsuarios.xml");
    }

    @Quando("^é exibida a lista de usuários$")
    public void éExibidaAListaDeUsuários(){}

    @Então("^a lista deve conter o usuário \"([^\"]*)\"$")
    public void aListaDeveConterOUsuário(String usuario) {
        final WebElement usuarioNaTabela = cadastroPage.getUsuarios().getRowBy(usuario);

        assertThat(usuarioNaTabela).isNotNull();
    }
}
