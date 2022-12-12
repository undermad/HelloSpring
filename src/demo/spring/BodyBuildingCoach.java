package demo.spring;

public class BodyBuildingCoach implements Coach{
    FortuneService fortuneService;

    public BodyBuildingCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyCoach() {
        return "You will spend around 1h and 30min on coached training.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
