import java.util.Arrays;

public class PeakElement {

    //Написать алгоритм PeakElement, который принимает на вход
    //массив целых чисел и возвращает значения пиковых элементов
    //(элементы, которые больше своих соседей).

    public int[] peakElement(int[] arr) {
        if (arr == null) {
            return new int[0];
        }

        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((i == 0) && (arr[i] > arr[i + 1])) {
                counter++;
            } else if ((i == (arr.length - 1)) && (arr[i] > arr[i - 1])) {
                counter++;
            } else if ((arr[i] > arr[i - 1]) && (arr[i] > arr[i + 1])) {
                counter++;
            }
        }


        int[] arr1 = new int[counter];
        for (int j = 0; j < counter; j++) {
            for (int i = 0; i < arr.length; i++) {
                if(i == 0 && arr[i] > arr[i+1]){
                    arr1[j] = arr[i];
                    j++;
                } else if ((i != 0) && (i < (arr.length - 1)) && (arr[i] > arr[i - 1]) && (arr[i] > arr[i + 1])){
                    arr1[j] = arr[i];
                    j++;
                } else if (i== arr.length-1 && arr[i] > arr[i-1]) {
                    arr1[j] = arr[i];
                    j++;
                }

            }
        }

        return arr1;
    }

}








