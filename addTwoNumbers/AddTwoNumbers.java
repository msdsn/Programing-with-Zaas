package addTwoNumbers;

import java.util.Arrays;

public class AddTwoNumbers {
    public static void main(String[] args) {

        // new int[] {2,4,3} ile new int[] {5,6,4} u toplayiniz

        int[] sayi1 = new int[3];
        sayi1[0] = 2;
        sayi1[1] = 4;
        sayi1[2] = 3;
        int[] sayi2 = {5, 6, 4};

        //iki arrray i toplayalım
        int[] toplamlari = new int[3];

        int elde = 0;
        for (int i = 2; i >= 0; i--) {

            if ((toplamlari[i] + sayi1[i] + sayi2[i]) >= 10) {

                toplamlari[i] += (sayi1[i] + sayi2[i]) % 10;
                elde++;
                if (i != 0) {
                    toplamlari[i - 1] = elde;
                } else toplamlari[i] = toplamlari[i] + 10;
            } else {
                toplamlari[i] += sayi1[i] + sayi2[i];
            }
            elde = 0;
        }
        System.out.println(Arrays.toString(toplamlari));

        int topsayi = toplamlari[0] * 100 + toplamlari[1] * 10 + toplamlari[2];
        System.out.println(topsayi);


    }

}
