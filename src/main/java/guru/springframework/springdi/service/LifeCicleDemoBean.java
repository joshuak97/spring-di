package guru.springframework.springdi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCicleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {

    private static final Logger log = LoggerFactory.getLogger(LifeCicleDemoBean.class);

    public LifeCicleDemoBean() {
        log.info("LifeCicleDemoBean Constructor");
    }

    @Override
    public void destroy() throws Exception {
        log.info("The LifeCicle Bean has been terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("The LifeCicle Bean has its properties set");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        log.info("The LifeCicle Bean has been set");
    }

    @Override
    public void setBeanName(String name) {
        log.info("The LifeCicle Bean name is " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.info("The LifeCicle ApplicationContext has been set");
    }
}
