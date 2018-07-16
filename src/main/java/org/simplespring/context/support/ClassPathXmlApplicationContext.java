package org.simplespring.context.support;

import org.simplespring.core.io.ClassPathResource;
import org.simplespring.core.io.Resource;

/**
 * Created by xuexuxu on 2018/7/16.
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {


    public ClassPathXmlApplicationContext(String configFile) {
        super(configFile);
    }

    protected Resource getResourceByPath(String path) {
        return new ClassPathResource(path, this.getBeanClassLoader());
    }
}
