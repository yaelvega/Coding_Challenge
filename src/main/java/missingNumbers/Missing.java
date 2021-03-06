package missingNumbers;

import java.util.Arrays;
import java.util.List;

public class Missing {

    static void missing(List<Integer> list) {
        int tmp, end;
        boolean first = true;

        tmp = list.get(0) + 1;
        end = list.get(list.size() - 1);

        do {
            if(!list.contains(tmp)) {
                if(first) {
                    System.out.print(tmp);
                    first = false;
                } else {
                    System.out.print(", " + tmp );
                }
            }
            tmp++;
        } while (tmp <= end);

        System.out.println(" ;");
    }


    public static void main(String[] args) {
        // In a sorted list, print all the missing numbers in a given sequence

        List<Integer> test1 = Arrays.asList(0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 18, 20, 21, 23);
        // expected output : 5, 16, 17, 19, 22 ;
        missing(test1);

        List<Integer> test2 = Arrays.asList(85, 92);
        // expected output : 86, 87, 88, 89, 90, 91 ;
        missing(test2);

        List<Integer> test3 = Arrays.asList(420, 421);
        // expected output : ;
        missing(test3);
    }

}
