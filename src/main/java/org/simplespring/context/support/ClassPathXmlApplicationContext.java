package org.simplespring.context.support;

import org.simplespring.beans.factory.support.DefaltBeanFactory;
import org.simplespring.beans.factory.xml.XmlBeanDefinitionReader;
import org.simplespring.context.ApplicationContext;
import org.simplespring.core.io.ClassPathResource;
import org.simplespring.core.io.Resource;

/**
 * Created by xuexuxu on 2018/7/16.
 */
public class ClassPathXmlApplicationContext implements ApplicationContext {

    private DefaltBeanFactory factory = null;

    public ClassPathXmlApplicationContext(String configFile) {
        this.factory = new DefaltBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        Resource resource = new ClassPathResource(configFile);
        reader.loadBeanDefinitions(resource);
    }

    public Object getBean(String beanID) {
        return factory.getBean(beanID);
    }
}
