package org.simplespring.beans.factory;

import org.simplespring.beans.BeanDefinition;

/**
 * Created by xuexuxu on 2018/7/16.
 */
public interface BeanFactory {

    BeanDefinition getBeanDefinition(String beanID);

    Object getBean(String beanID);
}
