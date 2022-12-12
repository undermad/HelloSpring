package demo.spring;

public class TrackCoach implements Coach{
    FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyCoach() {
        return "You spend 30 min on track coach.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
