package real_spring;

import my_spring.InjectRandomIntAnnotationObjectConfigurator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class InjectRandomIntBeanPostProcessor implements BeanPostProcessor {
    private InjectRandomIntAnnotationObjectConfigurator configurator = new InjectRandomIntAnnotationObjectConfigurator();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        bean = configurator.configure(bean);
        return bean;
    }
}
