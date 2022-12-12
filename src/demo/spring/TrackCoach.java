package demo.spring;

public class TrackCoach implements Coach{
    @Override
    public String getDailyCoach() {
        return "You spend 30 min on track coach.";
    }
}
