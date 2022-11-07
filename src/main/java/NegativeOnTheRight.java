import java.util.Arrays;

public class NegativeOnTheRight {

    //13. Написать алгоритм NegativeOnTheRight, который принимает на
    //вход массив целых чисел, и возвращает массив, в котором все
    //негативные числа находятся во второй половине массива (массив не
    //должен быть отсортирован)
    public int[] NegativeOnTheRight(int[] arr){
        int[] arr1 = new int[arr.length];
        int posind = 0;
        int negind = arr1.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >=0){
                arr1[posind++] =  arr[i];
            } else {
                arr1[negind--] = arr[i];
            }
        }
        return arr1;
    }

}
