import java.util.ArrayList;

/**
 * Created by Home on 28.01.2017.
 */
class DogFactory {

    private static int count = 0;
   volatile static ArrayList<Dog> dogs = new ArrayList<>();

    public static Dog takeTheDog(int i, String name) {
        Dog newdog;
        switch (i) {
            default:
                return null;
            case 0:
                count++;
                newdog = new Cur(name);
                dogs.add(newdog);
                return newdog;
            case 1:
                count++;
                newdog = new Shepherd(name);
                dogs.add(newdog);
                return newdog;
            case 2:
                count++;
                newdog = new Husky(name);
                dogs.add(newdog);
                return newdog;
        }
    }

    public int getCount() {
        return count;
    }

    public void giveTheDog(int i) {
        count--;
        dogs.remove(i);
    }
}
