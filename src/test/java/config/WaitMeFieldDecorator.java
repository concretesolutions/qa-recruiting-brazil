package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.internal.WrapsElement;
import org.openqa.selenium.support.pagefactory.DefaultFieldDecorator;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.util.List;

import static java.lang.reflect.Proxy.newProxyInstance;

public class WaitMeFieldDecorator extends DefaultFieldDecorator {
    private WebDriver webDriver;

    public WaitMeFieldDecorator(final ElementLocatorFactory factory, final WebDriver webDriver) {
        super(factory);
        this.webDriver = webDriver;
    }

    public Object decorate(final ClassLoader loader, final Field field) {
        if(!field.isAnnotationPresent(WaitMe.class))
            return super.decorate(loader, field);

        if (!(WebElement.class.isAssignableFrom(field.getType()) || isDecoratableList(field))) {
            return null;
        }

        final ElementLocator locator = factory.createLocator(field);

        if (locator == null) {
            return null;
        }

        if (WebElement.class.isAssignableFrom(field.getType())) {
            return proxyForLocator(loader, locator, field);
        } else if (List.class.isAssignableFrom(field.getType())) {
            return proxyForListLocator(loader, locator, field);
        } else {
            return null;
        }
    }

    protected WebElement proxyForLocator(final ClassLoader loader, final ElementLocator locator, final Field field) {
        final InvocationHandler handler = new WaitMeWebElementHandler(locator, webDriver, field);

        return (WebElement) newProxyInstance(loader, new Class[]{WebElement.class,
                                             WrapsElement.class, Locatable.class}, handler);
    }

    protected List<WebElement> proxyForListLocator(final ClassLoader loader, final ElementLocator locator, final Field field) {
        final InvocationHandler handler = new WaitMeWebElementHandler(locator, webDriver, field);

        return (List<WebElement>) newProxyInstance(loader, new Class[]{List.class}, handler);
    }
}