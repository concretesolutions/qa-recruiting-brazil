package whastapp.pages;

import whastapp.elementos.Elementos;

public class Grupos extends Elementos {

    public void clicaNovo(){
        menuSide.click();
        newGroup.click();
    }

    public void criarGrupo(String nomeGr, String contato) {
        aguardarElementoNaTela(cssBuscaContato);
        buscaContato.sendKeys(contato);
        addContato.click();
        envAddContato.click();
        txtNomeGrupo.sendKeys(nomeGr);
        criarGrupo.click();
        aguardarElementoNaTela(cssNomeGrupo);
    }

    public void enviarMsg(String msg) {
        campoMsg.sendKeys(msg);
        enviar.click();
        aguardarElementoNaTela(cssStatusDeliv);
    }

    public void modificarNome(String nomeGrupo) {
        aguardarElementoNaTela(cssNomeGrupoBt);
        nomeGrupoBt.click();
        editGrupo.click();
        txtNomeGrupo.clear();
        txtNomeGrupo.sendKeys(nomeGrupo);
        bEditar.click();
        fechar.click();
    }

    public void sairDoGrupo() {
        aguardarElementoNaTela(cssNomeGrupoBt);
        nomeGrupoBt.click();
        sair.click();
        btConfExc.click();
    }

}
