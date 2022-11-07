import java.util.Arrays;

public class ReverseArray {

    //Написать алгоритм ReverseArray, который принимает на вход
    //массив целых чисел, и возвращает “перевернутый” массив.
    public int[] reverseArray(int[]arr){
        if (arr == null) {
            return new int[0];
        }
        if(arr.length == 0){
            return new int[0];
        }
        int[] arr1 = new int[arr.length];
        for (int i = 0, j = arr.length-1; i < arr.length; i++, j--) {
            arr1[j] = arr[i];
        }

        return arr1;
    }

}
