import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));

        List<Integer> resList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int checker = list.get(i);
            if (checker > 0 && checker % 2 == 0) resList.add(checker);
        }

        Collections.sort(resList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(resList);

    }
}