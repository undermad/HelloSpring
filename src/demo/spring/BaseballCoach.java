package demo.spring;

import org.springframework.beans.factory.DisposableBean;

public class BaseballCoach implements Coach, DisposableBean {
    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyCoach() {
        return "Spend 30 min on holding a bat.";
    }

    @Override
    public String getDailyFortune() {
        return "Hold it well! " + fortuneService.getFortune();
    }

    //add an init method
    public void doOnCreate(){
        System.out.println("doOnCreate method has been called.");
    }
    //add a destroy method
    public void doOnDestroy(){
        System.out.println("doOnDestroy method has been called.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method implemented by custom code has been called.");
    }
}
