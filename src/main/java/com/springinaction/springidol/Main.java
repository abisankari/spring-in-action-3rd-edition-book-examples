package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * @author YNaidyon
 * @since 6/4/13
 */
public class Main {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "com/springinaction/springidol/spring-idol.xml");

        Map<String, Performer> performers = ctx.getBeansOfType(Performer.class);
        for (String performerName: performers.keySet()) {
            System.out.println("\nWelcome " + performerName + " on the stage!");
            Performer performer = performers.get(performerName);
            performer.perform();
        }
    }
}
