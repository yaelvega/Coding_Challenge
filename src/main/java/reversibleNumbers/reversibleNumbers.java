package reversibleNumbers;



public class reversibleNumbers {

    // Bonus tip, maybe int it's not the correct type for calculating the reverse of a 1x10e9 number
    static int reversible(int N) {
        int count = 0;
        long reverseNumber, tmp;
        boolean isValid;
        for(int value = 1; value <= N; value++) {
            //No leading zeroes
            if((value % 10) != 0) {
                //reverse calculation
                reverseNumber = 0;
                tmp = value;
                while(tmp != 0) {
                    reverseNumber *= 10;
                    reverseNumber += tmp % 10;
                    tmp /= 10;
                }

                //sum verification
                isValid = true;
                tmp = value + reverseNumber;
                while(tmp != 0) {
                    if((tmp % 2) == 0) {
                        isValid = false;
                        break;
                    }
                    tmp /= 10;
                }
                if(isValid)
                    count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(reversible(100));
        System.out.println(reversible(1000));
        System.out.println(reversible(100000));
        System.out.println(reversible(1000000));
        System.out.println(reversible(1000000000));
    }
}
