package org.simplespring.test.v1;

import org.junit.Assert;
import org.junit.Test;
import org.simplespring.context.ApplicationContext;
import org.simplespring.context.support.ClassPathXmlApplicationContext;
import org.simplespring.context.support.FileSystemXmlApplicationContext;
import org.simplespring.service.v1.PetStoreService;

import static org.junit.Assert.assertNotNull;

/**
 * Created by xuexuxu on 2018/7/16.
 */
public class ApplicationContextTest {
    @Test
    public void testGetBean() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("petstore-v1.xml");
        PetStoreService petStore = (PetStoreService)ac.getBean("petStore");
        assertNotNull(petStore);
    }

    @Test
    public void testGetBeanFromFileSystemContext(){
        //注意啊，这里仍然是hardcode了一个本地路径，这是不好的实践!! 如何处理，留作作业
		ApplicationContext ctx = new FileSystemXmlApplicationContext("C:\\Users\\xuexuxu\\Desktop\\petstore-v1.xml");
		PetStoreService petStore = (PetStoreService)ctx.getBean("petStore");
		Assert.assertNotNull(petStore);

    }
}
