/**
 * Created by Sviatoslav_H on 11.12.2017.
 */
public class FanImpl implements Fan {
    private String moto;
    private String name;

    public FanImpl(String name, String moto) {
        this.moto = moto;
        this.name = name;
    }

    public String getMoto() {
        return moto;
    }

    public String getName() {
        return name;
    }

    public void update(FootballHobby source) {
        System.out.println("I've got information that " + source.getNews() + ". I'm " + getName() + ". In my opinion " + getMoto());
    }
}
