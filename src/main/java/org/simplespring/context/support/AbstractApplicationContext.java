package org.simplespring.context.support;

import org.simplespring.beans.factory.support.DefaultBeanFactory;
import org.simplespring.beans.factory.xml.XmlBeanDefinitionReader;
import org.simplespring.context.ApplicationContext;
import org.simplespring.core.io.Resource;
import org.simplespring.util.ClassUtils;

/**
 * Created by xuexuxu on 2018/7/17.
 */
public abstract class AbstractApplicationContext implements ApplicationContext{

    private DefaultBeanFactory factory = null;
    private ClassLoader beanClassLoader;

    public AbstractApplicationContext(String configFile) {
        this.factory = new DefaultBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        Resource resource = getResourceByPath(configFile);
        reader.loadBeanDefinitions(resource);
        factory.setBeanClassLoader(this.getBeanClassLoader());
    }

    public Object getBean(String beanID) {
        return factory.getBean(beanID);
    }

    protected abstract Resource getResourceByPath(String path);

    public void setBeanClassLoader(ClassLoader beanClassLoader) {
        this.beanClassLoader = beanClassLoader;
    }

    public ClassLoader getBeanClassLoader() {
        return (this.beanClassLoader != null ? this.beanClassLoader : ClassUtils.getDefaultClassLoader());
    }
}
