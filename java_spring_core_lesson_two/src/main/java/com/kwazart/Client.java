package com.kwazart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring_context.xml");

//        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);


        Camera camera = context.getBean("camera", Camera.class);
        camera.doPhoto();
        camera.doPhoto();


        context.close();





    }
}
