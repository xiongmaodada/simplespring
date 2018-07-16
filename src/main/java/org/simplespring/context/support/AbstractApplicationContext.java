package org.simplespring.context.support;

import org.simplespring.beans.factory.support.DefaltBeanFactory;
import org.simplespring.beans.factory.xml.XmlBeanDefinitionReader;
import org.simplespring.context.ApplicationContext;
import org.simplespring.core.io.Resource;

/**
 * Created by xuexuxu on 2018/7/17.
 */
public abstract class AbstractApplicationContext implements ApplicationContext{

    private DefaltBeanFactory factory = null;

    public AbstractApplicationContext(String configFile) {
        this.factory = new DefaltBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        Resource resource = getResourceByPath(configFile);
        reader.loadBeanDefinitions(resource);
    }

    public Object getBean(String beanID) {
        return factory.getBean(beanID);
    }

    protected abstract Resource getResourceByPath(String path);
}
