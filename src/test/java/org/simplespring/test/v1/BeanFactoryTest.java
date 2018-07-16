package org.simplespring.test.v1;

import org.junit.Assert;
import org.junit.Test;
import org.simplespring.beans.BeanDefinition;
import org.simplespring.beans.factory.BeanCreationException;
import org.simplespring.beans.factory.BeanDefinitionStoreException;
import org.simplespring.beans.factory.BeanFactory;
import org.simplespring.beans.factory.support.DefaltBeanFactory;
import org.simplespring.service.v1.PetStoreService;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by xuexuxu on 2018/7/16.
 */
public class BeanFactoryTest {

    @Test
    public void testGetBean() throws Exception {

        BeanFactory factory = new DefaltBeanFactory("petstore-v1.xml");

        BeanDefinition bd = factory.getBeanDefinition("petStore");

        assertEquals("org.simplespring.service.v1.PetStoreService", bd.getBeanClassName());

        PetStoreService petStoreService = (PetStoreService)factory.getBean("petStore");

        assertNotNull(petStoreService);
    }

    @Test
    public void testInvalidBean(){

        BeanFactory factory = new DefaltBeanFactory("petstore-v1.xml");
        try{
            factory.getBean("invalidBean");
        }catch(BeanCreationException e){
            return;
        }
        Assert.fail("expect BeanCreationException ");
    }
    @Test
    public void testInvalidXML(){
        try{
            new DefaltBeanFactory("xxxx.xml");
        }catch(BeanDefinitionStoreException e){
            return;
        }
        Assert.fail("expect BeanDefinitionStoreException ");
    }


}
