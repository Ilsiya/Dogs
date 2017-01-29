/**
 * Created by Home on 28.01.2017.
 */
public class Cur implements Dog {
    String name;

    Cur(String name) {
        this.name = name;
        System.out.println("Новая дворняжка по имени: " + name);
    }

    @Override
    public void voice() throws InterruptedException {
        System.out.println(name + ": Гав-гав");
        Thread.sleep(4_000);
    }

    @Override
    public void move() throws InterruptedException {
        System.out.println(name + ": Виляет хвостом");
        Thread.sleep(4_000);
    }
}
