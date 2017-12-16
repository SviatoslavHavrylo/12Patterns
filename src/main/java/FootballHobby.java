import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by Sviatoslav_H on 11.12.2017.
 */
public class FootballHobby extends Observable {
    private String news;
    private ArrayList<FanImpl> fanList = new ArrayList<FanImpl>();

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }

    void addFanObserver(FanImpl fan) {
        fanList.add(fan);
    }

    void removeFanObserver(FanImpl fan) {
        fanList.remove(fan);
    }

    @Override
    public void notifyObservers() {
        for (FanImpl fan : fanList) {
            fan.update(this);
        }
    }
}
