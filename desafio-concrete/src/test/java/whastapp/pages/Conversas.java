package whastapp.pages;

import whastapp.elementos.Elementos;

public class Conversas extends Elementos {

    public void pesquisaContato(String nome) {
        pesquisa.sendKeys(nome);
        aguardarElementoNaTela(cssContato);
        contato.click();
    }

    public void enviaMsg(String msg) {
        aguardarElementoNaTela(cssCampoMsg);
        campoMsg.sendKeys(msg);
        enviar.click();
        aguardarElementoNaTela(cssStatusDeliv);
    }

    public void buscaConversaPorNome(String nome) {
        buscaConversa.sendKeys(nome);
        getContatoSide(nome).click();
    }

    public void excluirConversa(){
        btExcluir.click();
        btConfExc.click();
    }
}
