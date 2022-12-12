package demo.spring;

public class HappyDayFortune implements FortuneService{
    @Override
    public String getFortune() {
        return "This is your day, very happy day!";
    }
}
