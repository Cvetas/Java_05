import project_utils.Utils;

import java.util.Arrays;

public class OddEvenElementsInArray {

    //2.1.2. В классе OddEvenElementsInArray написать метод countOddEvenValuesInArray(),
    // который принимает на вход массив целых чисел и возвращает массив int[2], который
    // содержит количество четных и нечетных элементов входящего массива
    public int[] countOddEvenValuesInArray(int[] arr){
        int [] arr1 = new int[2];
        arr1[0] = Utils.countEvenValuesInArray(arr);
        arr1[1] = Utils.countOddValuesInArray(arr);
        return arr1;
    }

    //2.1.3. В классе OddEvenElementsInArray написать метод createOddEvenArray(),
    // который принимает массив целых случайных чисел, и возвращает двумерный массив
    // (массив четных и массив нечетных чисел)
    public int[][] createOddEvenArray(){
        int[] arr = Utils.createIntArr(20);
        int counterEven = 0;
        int counterOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                counterEven++;
            } else {
                counterOdd++;
            }
        }
        int[][] arr1 = new int[counterEven][counterOdd];
        for (int i = 0, j = 0; i < counterEven; i++) {
            if(arr[i] % 2 == 0){
                arr1[0][j++] = arr[i];
            }
        }
        for (int i = 0, j = 0; i < counterEven; i++) {
            if(arr[i] % 2 != 0){
                arr1[1][j++] = arr[i];
            }
        }

       // Arrays.stream(arr1).map(Arrays::toString).forEach(System.out::println);
        return arr1;
    }


}
