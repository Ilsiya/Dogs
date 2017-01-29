import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by Home on 28.01.2017.
 */
public class Main {
    static Random random = new Random();
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String text = reader.readLine();
        Live live = new Live();
        live.start();


        while (!text.equals("exit")) {
            String name = text;
            Dog dog = DogFactory.takeTheDog(random.nextInt(3), name);
            text = reader.readLine();

        }
        live.cancel();

        System.out.println("Пока!");

    }
}
