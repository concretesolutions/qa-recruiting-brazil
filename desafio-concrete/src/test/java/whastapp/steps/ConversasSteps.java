package whastapp.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.support.PageFactory;
import whastapp.pages.Conversas;
import whastapp.util.Login;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ConversasSteps {

    Conversas conversa = PageFactory.initElements(Login.getDriver(), Conversas.class);

    @E("^que está na tela inicial$")
    public void que_na_tela_de_conversas() {
        assertTrue(conversa.getMsgTelaInicial().getText().contentEquals("Keep your phone connected"));  //Está logado no Whatsapp
    }

    @Dado("^que o usuário clique em Nova Conversa$")
    public void que_o_usuario_clique_em_nova_conversa() {
        conversa.getNovaConversa().click();
    }

    @E("^pesquisa por \"(.*?)\"$")
    public void pesquiso_por(String arg1) {
        conversa.pesquisaContato(arg1);
    }

    @Então("^a conversa deve ser iniciada com \"(.*?)\"$")
    public void uma_nova_conversa_deve_ser_iniciada(String contato) {
        assertTrue(conversa.getNomeContatoWE(contato).getText().contentEquals(contato));
    }

    @Então("^deverá ser possível enviar mensagens para o contato\\.$")
    public void deverá_ser_possível_enviar_mensagens_para_o_contato() throws InterruptedException {
        conversa.enviaMsg("Testando Mensagem");
        assertEquals(conversa.getStatusDeliv().getAttribute("aria-label"), " Delivered ");
    }

    @Dado("^que o usuário está na tela de busca$")
    public void que_o_usuario_esta_na_tela_de_buscas(){
        assertTrue(conversa.getBusca().getText().contentEquals("Search or start new chat"));
    }

    @E("^busca por \"(.*)\"$")
    public void busca_por(String nome) {
        conversa.buscaConversaPorNome(nome);
    }

    @E("^clica em Configurações$")
    public void clica_em_configuracoes(){
        conversa.getMenuConversa().click();
    }

    @Quando("^clica no botão excluir$")
    public void clica_no_botão_excluir() {
        conversa.excluirConversa();
    }

    @Então("^a conversa deve ser excluída$")
    public void a_conversa_deve_ser_excluída() {
        conversa.aguardarElementoNaTela(conversa.cssMsgTelaInicial);
        assertTrue(conversa.getMsgTelaInicial().getText().contentEquals("Keep your phone connected"));
    }

}
