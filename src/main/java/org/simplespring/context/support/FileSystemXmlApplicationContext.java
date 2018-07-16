package org.simplespring.context.support;

import org.simplespring.beans.factory.support.DefaltBeanFactory;
import org.simplespring.beans.factory.xml.XmlBeanDefinitionReader;
import org.simplespring.context.ApplicationContext;
import org.simplespring.core.io.FileSystemResource;
import org.simplespring.core.io.Resource;

/**
 * Created by xuexuxu on 2018/7/16.
 */
public class FileSystemXmlApplicationContext implements ApplicationContext {
    private DefaltBeanFactory factory = null;

    public FileSystemXmlApplicationContext(String configFile) {
        this.factory = new DefaltBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        Resource resource = new FileSystemResource(configFile);
        reader.loadBeanDefinitions(resource);
    }

    public Object getBean(String beanID) {
        return factory.getBean(beanID);
    }
}
