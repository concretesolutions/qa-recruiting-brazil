package whastapp.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.support.PageFactory;
import whastapp.pages.Grupos;
import whastapp.util.Login;
import static org.junit.Assert.assertEquals;

public class GruposSteps {

    Grupos grupo = PageFactory.initElements(Login.getDriver(), Grupos.class);

    @Quando("^o usuário clica em Novo Grupo$")
    public void clica_em_Novo_Grupo() {
       grupo.clicaNovo();
    }

    @Quando("^informa o nome \"(.*)\" e o contato \"(.*)\"$")
    public void informa_dados_válidos(String nomeGr, String contato) {
        grupo.criarGrupo(nomeGr, contato);
    }

    @Então("^o grupo \"(.*)\" deverá ser encontrado$")
    public void o_grupo_deverá_ser_encontrado(String nomeGr) {
        assertEquals(grupo.getNomeGrupo().getText(), nomeGr);
    }

    @Então("^deverá ser possível enviar mensagens para o grupo$")
    public void deverá_ser_possível_enviar_mensagens() {
        grupo.enviarMsg("Testando Mensagem Grupo");
        assertEquals(grupo.getStatusDeliv().getAttribute("aria-label"), " Delivered ");
    }

    @Dado("^que o usuário está no grupo \"(.*?)\"$")
    public void que_eu_estou_em_grupo_chamado(String nomeGrupo) {
        clica_em_Novo_Grupo();
        informa_dados_válidos(nomeGrupo, "Carolina");
    }

    @Quando("^ele modifica o nome do grupo para \"(.*?)\"$")
    public void modifico_o_nome_do_grupo_para(String nomeGrupo) {
        grupo.modificarNome(nomeGrupo);
    }

    @Então("^o usuário deve sair do grupo$")
    public void removo_o_contato_do_grupo() {
        grupo.sairDoGrupo();
    }

    @Então("^ele deve ver a mensagem de exclusão$")
    public void o_contato_deve_ser_removido_do_grupo() {
        grupo.aguardarElementoNaTela(grupo.cssConfExclGroup);
        assertEquals(grupo.getConfExclGroup().getText(), "You can't send messages to this group because you're no longer a participant.");
    }
}
