package demo.spring;

public class BaseballCoach implements Coach {
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
        return fortuneService.getFortune();
    }
}
