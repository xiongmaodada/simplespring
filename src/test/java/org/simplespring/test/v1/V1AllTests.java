package org.simplespring.test.v1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by xuexuxu on 2018/7/16.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ApplicationContextTest.class,
        BeanFactoryTest.class,
        ResourceTest.class})
public class V1AllTests {
}
