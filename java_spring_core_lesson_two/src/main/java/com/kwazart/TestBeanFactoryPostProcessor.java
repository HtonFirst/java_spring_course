package com.kwazart;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

        String[] names = configurableListableBeanFactory.getBeanDefinitionNames();

        for (String name:names) {
            System.out.println(name);

            BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition(name);
            if ("BlackAndWhiteRoll".equals(name)) {
                beanDefinition.setBeanClassName(ColorRoll.class.getName());
            }


            System.out.println("_________________________");
        }

    }
}
