package pageObjects;

import config.PageElement;
import config.WaitMe;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Iterator;

import static org.openqa.selenium.By.tagName;
import static org.openqa.selenium.By.xpath;

@PageElement
public class UsuariosPageElement implements Iterable<WebElement> {
    @Autowired
    private WebDriver driver;

    @WaitMe(onlyImplicity = false, seconds = 10)
    @FindBy(id = "dataTable_data")
    private WebElement dataTable_data;

    public int size() throws InterruptedException {
        driver.get("http://localhost:9090/index.xhtml");

        dataTable_data.click();

        return dataTable_data.findElements(tagName("tr")).size();
    }

    @Override
    public Iterator<WebElement> iterator() {
        driver.get("http://localhost:9090/index.xhtml");
        return dataTable_data.findElements(tagName("tr")).iterator();
    }

    public WebElement getRowBy(final String usuario) {
        driver.get("http://localhost:9090/index.xhtml");

        for (final WebElement tr: this) {
            for (final WebElement td: tr.findElements(xpath("td[2]"))) {
                final String text = td.getText();

                if(usuario.equalsIgnoreCase(text))
                    return td;
            }
        }

        return null;
    }
}
