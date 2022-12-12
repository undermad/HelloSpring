package demo.spring;

public class BaseballCoach implements Coach {
    @Override
    public String getDailyCoach() {
        return "Spend 30 min on holding a bat.";
    }
}
