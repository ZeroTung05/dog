import java.util.ArrayList;

public class Main {
    static ArrayList<Dog> dogs = new ArrayList<>();
    public static void main(String[] args) {

        Dog cow1 = new Dog (10,1,false,1,true,false);
        Dog  cow2 = new Dog (2,3,false,1,true,true);
        Dog  cow3 = new Dog (2, 4, true, 0, true, true);
        Dog  cow4 = new Dog (2, 3, true, 0, true, true);
        Dog  cow5 = new Dog (0, 3, false, 0, true, true);
        dogs.add(cow1);
        dogs.add(cow2);
        dogs.add(cow3);
        dogs.add(cow4);
        dogs.add(cow5);
        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i).getEyes());

        }
    }
}