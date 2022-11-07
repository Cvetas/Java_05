import java.util.Arrays;

public class SortArray {

    //Написать алгоритм SortArray, который принимает на вход массив
    // целых чисел, и сортирует элементы массива в порядке возрастания.
    public int[] sortArray(int[] arr){
        if (arr == null) {
            return new  int[0];
        }
        if (arr.length == 1) {
            return arr;
        }
        if (arr.length == 2){
            int a = arr[0];
            arr[0] = arr[1];
            arr[1] = a;
        }

        while (true) {
            int counter = 0;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i]>arr[i+1]){
                    int t = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = t;
                    counter++;
                }
            }
            if(counter == 0){
                break;
            }
        }

        return arr;
    }


}
