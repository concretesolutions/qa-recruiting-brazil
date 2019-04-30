package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.FieldDecorator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import static org.openqa.selenium.support.PageFactory.initElements;

@Component
public class PagePostBeanProcessor implements BeanPostProcessor {
    @Autowired
    private WebDriver driver;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        final Class beanClass = bean.getClass();
        final boolean isPage = beanClass.isAnnotationPresent(Page.class);
        final boolean isPageElement = beanClass.isAnnotationPresent(PageElement.class);

        if(isPage || isPageElement) {
            final ElementLocatorFactory locatorFactory = new DefaultElementLocatorFactory(driver);
            final FieldDecorator decorator = new WaitMeFieldDecorator(locatorFactory, driver);

            initElements(decorator, bean);
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
