/**
 * Created by Sviatoslav_H on 11.12.2017.
 */
public class Main {
    public static void main(String[] args) {
        FanImpl fan1 = new FanImpl("Ivan", "We will win !!!");
        FanImpl fan2 = new FanImpl("Taras", "OMG");
        FanImpl fan3 = new FanImpl("Kostyan", "Two beers for all!");

        FootballHobby football = new FootballHobby();
        football.addFanObserver(fan1);
        football.addFanObserver(fan2);
        football.addFanObserver(fan3);

        football.setNews("Next game in London at sunday");
    }
}
