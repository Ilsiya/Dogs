
/**
 * Created by Home on 28.01.2017.
 */
public class Husky implements Dog {
    String name;

    Husky(String name) {
        this.name = name;
        System.out.println("Новая хаски по имени: " + name);
    }

    @Override
    public void voice() throws InterruptedException {
        System.out.println(name + ": Ауууууууу");
        Thread.sleep(4_000);
    }

    @Override
    public void move() throws InterruptedException {
        System.out.println(name + ": Носится по двору");
        Thread.sleep(4_000);
    }
}
