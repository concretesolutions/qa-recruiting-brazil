package whastapp.elementos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import whastapp.util.Login;

public class Elementos {

    public static final String cssMsgTelaInicial = "._2dH1A";
    @FindBy(css = cssMsgTelaInicial)
    protected WebElement msgTelaInicial;

    @FindBy(className ="J3VFH")
    protected WebElement busca;

    @FindBy(css="._1QUKR div[class='_3euVJ'] div[title='New chat']")
    protected WebElement novaConversa;

    @FindBy(css="._3xpD_ div[class^='_3FRCZ']")
    protected WebElement pesquisa;

    protected final String cssContato = "._2kHpK";
    @FindBy(css=cssContato)
    protected WebElement contato;

    @FindBy(css="._3xpD_ div[class^='_3FRCZ']")
    protected WebElement buscaConversa;

    protected final String cssCampoMsg = "._3uMse div[class^='_3FRCZ']";
    @FindBy(css=cssCampoMsg)
    protected WebElement campoMsg;

    @FindBy(css="span[data-icon='send']")
    protected WebElement enviar;

    protected final String cssStatusDeliv = "._2frDn span[aria-label=' Delivered ']";
    @FindBy(css=cssStatusDeliv)
    protected WebElement statusDeliv;

    @FindBy(css="._1iFv8 div[class='_3nq_A'] div[title='Menu']")
    protected WebElement menuConversa;

    @FindBy(css=".I4jbF div[title='Delete chat']")
    protected WebElement btExcluir;

    @FindBy(css=".S7_rT.FV2Qy")
    protected WebElement btConfExc;

    @FindBy(css="._3euVJ div[title='Menu']")
    protected WebElement menuSide;

    @FindBy(css=".I4jbF div[title='New group']")
    protected WebElement newGroup;

    protected final String cssBuscaContato = "._1tbWk input[type='text']";
    @FindBy(css=cssBuscaContato)
    protected WebElement buscaContato;

    @FindBy(css=".eJ0yJ")
    protected WebElement addContato;

    @FindBy(css="._39PT0 span[data-icon='arrow-forward']")
    protected WebElement envAddContato;

    @FindBy(css="._1Rerq div[class^='_3FRCZ']")
    protected WebElement txtNomeGrupo;

    @FindBy(css="._1KM01 div[role='button']")
    protected WebElement criarGrupo;

    protected final String cssNomeGrupo = "._2FCjS span[class^='_3ko75']";
    @FindBy(css=cssNomeGrupo)
    protected WebElement nomeGrupo;

    protected final String cssNomeGrupoBt = "._33QME";
    @FindBy(css=cssNomeGrupoBt)
    protected WebElement nomeGrupoBt;

    @FindBy(css="._3-8bl")
    protected WebElement editGrupo;

    @FindBy(css="._1Rerq div[class='_3-8bl']")
    protected WebElement bEditar;

    public final String cssConfExclGroup = "._3ge3i";
    @FindBy(css=cssConfExclGroup)
    protected WebElement confExclGroup;

    @FindBy(css="._2TZYF button[class='t4a8o']")
    protected WebElement fechar;

    @FindBy(css="._1TM40 div[class^='_3wAoe']")
    protected WebElement sair;

    public WebElement getMsgTelaInicial() {
        return msgTelaInicial;
    }

    public WebElement getBusca() {
        return busca;
    }

    public WebElement getNovaConversa() {
        return novaConversa;
    }

    public WebElement getStatusDeliv() {
        return statusDeliv;
    }

    public WebElement getMenuConversa() {
        return menuConversa;
    }

    public WebElement getNomeGrupo() {
        return nomeGrupo;
    }

    public WebElement getConfExclGroup() {
        return confExclGroup;
    }


    public WebElement getNomeContatoWE(String contato) {
        WebElement nomeContato = Login.getDriver().findElement((By.cssSelector("span[title='"+ contato +"']")));
        return nomeContato;
    }

    protected WebElement getContatoSide(String contato) {
        By contatoBy = By.cssSelector("._357i8 span[title='"+contato+"']");
        Login.getWait().until(ExpectedConditions.visibilityOfElementLocated(contatoBy));
        WebElement contatoSide = Login.getDriver().findElement(contatoBy);
        return contatoSide;
    }

    public void aguardarElementoNaTela(String css){
        Login.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(css)));
    }

}
