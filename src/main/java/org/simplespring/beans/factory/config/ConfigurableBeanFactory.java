package org.simplespring.beans.factory.config;

import org.simplespring.beans.factory.BeanFactory;

/**
 * Created by xuexuxu on 2018/7/17.
 */
public interface ConfigurableBeanFactory extends BeanFactory{
    void setBeanClassLoader(ClassLoader beanClassLoader);
    ClassLoader getBeanClassLoader();
}
