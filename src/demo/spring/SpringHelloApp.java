package demo.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("theCoach", Coach.class);
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyCoach());

        theCoach = context.getBean("muscleCoach", Coach.class);
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyCoach());

        Coach wowCoach = context.getBean("wowCoach", WowCoach.class);
        System.out.println(wowCoach.getDailyCoach());
        System.out.println(wowCoach.getDailyFortune());

        Coach wowCoachEctimel = context.getBean("wowCoachEctimel", WowCoach.class);
        System.out.println(wowCoachEctimel.toString());


        context.close();
    }
}
