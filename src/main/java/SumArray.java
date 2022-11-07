import java.util.Arrays;

public class SumArray {

    //Написать алгоритм SumArray, который возвращает сумму всех
    //чисел массива

    public int sumArray(int[] array) {
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            x = x + array[i];
        }
        return x;
    }

}
