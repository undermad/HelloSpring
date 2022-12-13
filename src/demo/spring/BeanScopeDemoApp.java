package demo.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");


        Coach theCoach = context.getBean("theCoach", Coach.class);
        Coach anotherCoach = context.getBean("theCoach", Coach.class);

        boolean result = (theCoach == anotherCoach);
        System.out.println("theCoach and anotherCoach are same object? " + result);
        System.out.println("theCoach memory location: " + theCoach);
        System.out.println("anotherCoach memory location: " + anotherCoach);

        Coach withDestroyMethod = context.getBean("baseballCoachWithCustomDestroyMethod", BaseballCoach.class);
        System.out.println(withDestroyMethod.getDailyFortune());

        context.close();

    }
}
