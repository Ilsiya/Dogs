/**
 * Created by Home on 28.01.2017.
 */
public class Shepherd implements Dog {
    String name;

    Shepherd(String name) {
        this.name = name;
        System.out.println("Новая овчарка по имени: " + name);
    }

    @Override
    public void voice() throws InterruptedException {
        System.out.println(name + ": Рррррр");
        Thread.sleep(4_000);
    }

    @Override
    public void move() throws InterruptedException {
        System.out.println(name + ": Гоняет кота");
        Thread.sleep(4_000);
    }
}
