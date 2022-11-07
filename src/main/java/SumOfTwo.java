import project_utils.Utils;

import java.util.Arrays;

public class SumOfTwo {

    //14.Написать алгоритм SumOfTwo, который принимает на вход
    //массив целых чисел, и число n. Алгоритм возвращает пары
    //элементов, которые в сумме дают число n.
    public static int[][] SumOfTwo(int[] arr, int n) {
        int[] firstarr = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] + arr[j] == n) {
                    firstarr[k++] = arr[i];
                    System.out.println(arr[i]);
                    System.out.println(Arrays.toString(firstarr));
                }
            }
        }

        int[] secarr = new Utils().nullOutOffArr(firstarr);
        System.out.println(Arrays.toString(secarr));
        int s = secarr.length / 2;
        int l = 0;
        int[][] arr1 = new int[2][2];
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < 2; j++) {
                arr1 = new int[s][2];
                arr1[i][j] = secarr[l++];

            }

        }

        System.out.println(Arrays.toString(arr1[0]));
        System.out.println(Arrays.toString(arr1[1]));
        return arr1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int x = 12;
        System.out.println(Arrays.toString(SumOfTwo(arr, x)));
    }
}
