package org.simplespring.test.v1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.simplespring.beans.BeanDefinition;
import org.simplespring.beans.factory.BeanCreationException;
import org.simplespring.beans.factory.BeanDefinitionStoreException;
import org.simplespring.beans.factory.support.DefaultBeanFactory;
import org.simplespring.beans.factory.xml.XmlBeanDefinitionReader;
import org.simplespring.core.io.ClassPathResource;
import org.simplespring.service.v1.PetStoreService;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by xuexuxu on 2018/7/16.
 */
public class BeanFactoryTest {

    DefaultBeanFactory factory = null;
    XmlBeanDefinitionReader reader = null;

    @Before
    public void setUP(){
        factory = new DefaultBeanFactory();
        reader = new XmlBeanDefinitionReader(factory);
    }

    @Test
    public void testGetBean() throws Exception {

        reader.loadBeanDefinitions(new ClassPathResource("petstore-v1.xml"));

        BeanDefinition bd = factory.getBeanDefinition("petStore");

        assertEquals("org.simplespring.service.v1.PetStoreService", bd.getBeanClassName());

        PetStoreService petStoreService = (PetStoreService)factory.getBean("petStore");

        assertNotNull(petStoreService);
    }

    @Test
    public void testInvalidBean(){

        reader.loadBeanDefinitions(new ClassPathResource("petstore-v1.xml"));
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
            reader.loadBeanDefinitions(new ClassPathResource("xxxx.xml"));
        }catch(BeanDefinitionStoreException e){
            return;
        }
        Assert.fail("expect BeanDefinitionStoreException ");
    }


}
