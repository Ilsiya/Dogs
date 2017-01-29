import java.util.Random;

/**
 * Created by Home on 28.01.2017.
 */
public class Live extends Thread {
    static Random random = new Random();

    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                if (DogFactory.dogs.size() != 0) {

                    int dogsnum = random.nextInt(DogFactory.dogs.size());
                    int i = random.nextInt(1_000);
                    if (i % 2 == 0) {

                        DogFactory.dogs.get(dogsnum).move();

                    } else {

                        DogFactory.dogs.get(dogsnum).voice();

                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
            Thread.currentThread().interrupt();
            //e.printStackTrace();
        }
    }

    public void cancel() {
        System.out.println("Cancel method");
        interrupt();
    }
}
