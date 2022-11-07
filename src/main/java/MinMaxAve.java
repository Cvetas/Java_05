import java.util.Arrays;

public class MinMaxAve {


    //Написать алгоритм MinMaxAve, который принимает массив чисел
    //int[] и 2 значения индексов. Алгоритм возвращает массив, который
    //содержит минимальное значение, максимальное значение, и среднее
    //среди всех значений между 2-мя индексами.

    public int[] minMaxAve(int[] array, int a, int b){
        int min;
        int max;
        int med = 0;
        
        int[] array1 = new int[]{0,0,0};
        if(a <= b){
            min = array[a];
            max = array[a];
            for (int i = a; i <= b; i++) {
                med = med + array[i];
                min = min < array[i] ? min : array[i];
                max = max > array[i] ? max : array[i];
            }
            med = med / (b - a + 1);
            array1[0] = min;
            array1[1] = max;
            array1[2] = med;
            return array1;
        }

        return new int[0];
    }

}

