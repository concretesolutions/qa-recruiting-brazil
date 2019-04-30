package config;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeSelected;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import static org.springframework.util.ReflectionUtils.makeAccessible;

public class WaitMeWebElementHandler implements InvocationHandler {
    private final ElementLocator locator;
    private final Field field;
    private final WebDriver driver;

    public WaitMeWebElementHandler(final ElementLocator locator, final WebDriver driver, final Field field) {
        if (driver == null)
            throw new IllegalArgumentException("WebDriver não está presente no contexto do spring.");

        this.field = field;
        this.locator = locator;
        this.driver = driver;
    }

    public Object invoke(final Object object, final Method method, final Object[] objects) throws Throwable {
        final WebElement element;

        try {
            element = locator.findElement();
        } catch (NoSuchElementException e) {
            if ("toString".equals(method.getName())) {
                return "Proxy element for: " + locator.toString();
            } else throw e;
        }

        if ("getWrappedElement".equals(method.getName())) {
            return element;
        }

        doWait(method, element);

        try {
            return method.invoke(element, objects);
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }

    private void doWait(final Method method, final WebElement element) throws InterruptedException {
        makeAccessible(field);
        final Class<?> type = field.getType();

        if (type.isAssignableFrom(WebElement.class)) {
            final WaitMe waitMe = field.getDeclaredAnnotation(WaitMe.class);
            final int seconds = waitMe.seconds();
            final boolean implicity = waitMe.onlyImplicity();

            final WebDriverWait wait = new WebDriverWait(driver, seconds);

            if ("click".equals(method.getName())) {
                if (!implicity) {
                    Thread.sleep(seconds * 1000L);
                }

                wait.until(elementToBeClickable(element));
            }

            if ("submit".equals(method.getName())) {
                if (!implicity) {
                    Thread.sleep(seconds * 1000L);
                }

                wait.until(elementToBeClickable(element));
            }

            if ("sendKeys".equals(method.getName())) {
                if (!implicity) {
                    Thread.sleep(seconds * 1000L);
                }

                wait.until(elementToBeClickable(element));
            }

            if ("clear".equals(method.getName())) {
                if (!implicity) {
                    Thread.sleep(seconds * 1000L);
                }

                wait.until(visibilityOf(element));
            }

            if ("isSelected".equals(method.getName())) {
                if (!implicity) {
                    Thread.sleep(seconds * 1000L);
                }

                wait.until(elementToBeSelected(element));
            }
        } else {
            throw new IllegalArgumentException("Você só pode anotar com o @WaitMe um campo WebElement");
        }
    }
}
