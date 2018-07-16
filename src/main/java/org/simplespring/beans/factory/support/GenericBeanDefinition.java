package org.simplespring.beans.factory.support;

import org.simplespring.beans.BeanDefinition;

/**
 * Created by xuexuxu on 2018/7/16.
 */
public class GenericBeanDefinition implements BeanDefinition {

    private String id;

    private String beanClassName;

    public GenericBeanDefinition(String id, String beanClassName) {
        this.id = id;
        this.beanClassName = beanClassName;
    }

    public String getBeanClassName() {
        return this.beanClassName;
    }
}
