package org.simplespring.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by xuexuxu on 2018/7/16.
 */
public interface Resource {
    public InputStream getInputStream() throws IOException;
    public String getDescription();
}
