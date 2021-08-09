package lesson14;

import java.util.Arrays;


public class chekArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 4, 7, 4, 8, 4};
        int[] arr1 = {1, 4, 1, 4, 1, 4, 1};
        int[] arr2 = {1, 1, 1};
        chekFour(arr);
        System.out.println(chekOneAndFour(arr2));
        chekFour(arr2);

    }

    public static int[] chekFour(int[] Arr) throws RuntimeException {
        int point = 0;
        int[] rezult = null;
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == 4) {
                point = Arr[i];
                rezult = new int[Arr.length - i - 1];
                for (int j = i + 1, k = 0; j < Arr.length; j++, k++) {
                    if (Arr[j] == 4) continue;
                    rezult[k] = Arr[j];
                }

            }

        }

        try {
            point = 1 / point;
        } catch (ArithmeticException e) {
            throw new RuntimeException();
        }

        System.out.println(Arrays.toString(rezult));
        return rezult;
    }

    public static boolean chekOneAndFour(int[] Arr) {
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] != 1 && Arr[i] != 4) {
                return false;
            }else {
                return true;
            }
        }
        return true;
    }
}
