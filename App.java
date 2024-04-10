package com.example1.ST1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!Welcome Ramana:" );
        final Resource resource = new ClassPathResource("applicationContext.xml");
        final DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        final XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions(resource);
        System.out.println("bean definition loaded ---");
        
        Student student1=(Student)beanFactory.getBean("studentbean1");  
        student1.displayInfo();  
        
        Student student2=(Student)beanFactory.getBean("studentbean2");  
        student2.displayInfo();  
        
        Student student3=(Student)beanFactory.getBean("studentbean3");  
        student3.displayInfo();  
        
        
    }
}
