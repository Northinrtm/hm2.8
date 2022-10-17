import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Tablica {
    public static void main(String[] args) {
        int i, j;
        Random random = new Random();
        Set set = new HashSet();
        while (set.size() != 15) {
            i = random.nextInt(7) + 2;
            j = random.nextInt(7) + 2;
            if (!set.contains(i * j)) {
                System.out.println(i + " * " + j + " = ?");
            }
            set.add(i * j);
        }
    }
}
