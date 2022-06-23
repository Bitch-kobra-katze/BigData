import java.util.ArrayList;
import java.util.Random;

public class HashGenerator {

    public static ArrayList<Integer> hashCodes(String element, Integer k, Integer m) {
        ArrayList<Integer> hashes = new ArrayList<Integer>();

        Random random = new Random();
        random.setSeed(element.hashCode());

        for (int i = 0; i < k; i++) {
            int hash = random.nextInt(m);
            hashes.add(hash);
        }
        return hashes;
    }
}
