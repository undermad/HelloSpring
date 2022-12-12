package demo.spring;

public class WowCoach implements Coach{
    private FortuneService fortuneService;
    private String team;
    private String email;
    private String name;

    public WowCoach() {
        System.out.println("************Creating wow coach bean inside no-arg constructor");
    }


    @Override
    public String getDailyCoach() {
        return "Let's set your addons first!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("************Setting fortune service!");
        this.fortuneService = fortuneService;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + "\n" + this.team + "\n" + this.email;
    }
}
