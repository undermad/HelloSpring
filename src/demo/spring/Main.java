package demo.spring;

public class Main {
    public static void main(String[] args) {
        Coach theCoach = new TrackCoach();

        System.out.println(theCoach.getDailyCoach());
    }
}