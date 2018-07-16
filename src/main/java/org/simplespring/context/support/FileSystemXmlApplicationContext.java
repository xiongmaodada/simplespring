package org.simplespring.context.support;

import org.simplespring.core.io.FileSystemResource;
import org.simplespring.core.io.Resource;

/**
 * Created by xuexuxu on 2018/7/16.
 */
public class FileSystemXmlApplicationContext extends AbstractApplicationContext {

    public FileSystemXmlApplicationContext(String configFile) {
        super(configFile);
    }

    protected Resource getResourceByPath(String path) {
        return new FileSystemResource(path);
    }
}
