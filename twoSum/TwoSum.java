package twoSum;

import java.util.Arrays;

public class TwoSum {
    //======= input'taki iki sayinin toplami target'a esit olan indis'leri yazdiriniz. =======
    // int [] input={1,2,3,4}
    // int target= 6
    // int [] out ={1,3}  seklinde olsun.
    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4}, 6)));
    }

    public static int[] twoSum(int[] input, int target) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] + input[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
