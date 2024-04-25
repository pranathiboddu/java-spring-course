package com.java.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App 
{
    public static void main( String[] args )
    {
//    	BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//    	Alien obj = (Alien) factory.getBean("alien");
    	
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
    	
    	Alien obj = (Alien) ctx.getBean("alien");
    	obj.show();
    	System.out.println(obj.getAge());
        }
}
