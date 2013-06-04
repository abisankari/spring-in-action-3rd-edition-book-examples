package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YNaidyon
 * @since 6/4/13
 */
public class Main {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "com/springinaction/springidol/spring-idol.xml");

        Performer performer = (Performer) ctx.getBean("duke");
        performer.perform();
    }
}