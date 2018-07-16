package org.simplespring.beans.factory.support;

import org.simplespring.beans.BeanDefinition;

/**
 * Created by xuexuxu on 2018/7/16.
 */
public interface BeanDefinitionRegistry {

    BeanDefinition getBeanDefinition(String beanID);

    void registerBeanDefinition(String beanID, BeanDefinition bd);
}
