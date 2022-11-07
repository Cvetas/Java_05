import java.util.Arrays;

public class OddIndices {

    //Написать алгоритм OddIndices, который принимает массив
    //целых чисел, и возвращает массив значений нечетных
    //индексов


    public int[] oddIndices(int[] array) {
        int l;
        if (array.length % 2 == 0) {
            l = array.length / 2;
        } else {
            l = array.length / 2 + 1;
        }
        int[] array1 = new int[l];
        for (int i = 0; i < l; i++) {
                array1[i] = array[i+i+1];
        }

        return array1;
    }
}
