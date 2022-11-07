import java.util.Arrays;

public class ManipulationsWithArrays {

    //1.1.5. Написать метод multiplуArrayByNumber(), который принимает на вход
    //массив целых чисел и число int number. Метод возвращает массив тех же
    //чисел, умноженных на number
    public int[] multiplуArrayByNumber(int[] arr, int a){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * a;
        }

        return arr;
    }

    //1.1.6. Написать метод toDoubleArray(), который принимает на вход массив целых
    //чисел, и возвращает массив типа double[] из тех же чисел
    public double[] toDoubleArray(int[] arr){
        double[] arr1 = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = (double)arr[i];
        }

        return arr1;
    }

    //1.1.7. Написать метод toIntArray(), который принимает на вход массив типа
    //double[], и возвращает массив типа int[] из тех же чисел
    public int[] toIntArray(double[] arr){
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = (int)arr[i];
        }

        return arr1;
    }

    //1.1.8. Написать метод toStringArray(), который принимает на вход массив целых
    //чисел, и возвращает массив типа String[] из тех же чисел (желательно не
    //использовать метод .toString(), нужно переводить вручную)
    public String[] toStringArray(int[] arr){
        String[] arr1 = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = (""+ arr[i]);
        }
        return arr1;
    }

    //1.1.9. Перегрузить метод toStringArray() параметром double[]. Этот метод
    // должен возвращать массив типа String[] (желательно не использовать метод .toString(),
    // нужно переводить вручную)
    //Например, toStringArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {“1.1”, “2.5”, “3.7”, “4.0”, “5.5”}
    public String[] toStringArray(double[] arr){
        String[] arr1 = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = (""+ arr[i]);
        }
        return arr1;
    }

    //2.1.3. В классе ManipulationsWithArrays написать метод getTheGreaterHalf(),
    // который принимает массив целых чисел,  и возвращает  массив из суммарно бОльшей
    // первой или второй половины входящего массива
    public int[] getTheGreaterHalf(int[] arr){
    int halfLength = arr.length /2;
    int firstSumHalfArr = 0;
        for (int i = 0; i < halfLength; i++) {
            firstSumHalfArr = firstSumHalfArr + arr[i];
        }
        int secondSumHalfArr = 0;
        for (int i = halfLength; i < arr.length; i++) {
            secondSumHalfArr = secondSumHalfArr + arr[i];
        }
        int[] arr1 = new int[halfLength];
        int[] arr2 = new int[arr.length - halfLength];
        if(firstSumHalfArr >= secondSumHalfArr){
            for (int i = 0; i < halfLength; i++) {
                arr1[i] = arr[i];
            }

            return arr1;
        } else {
            for (int i = halfLength, j = 0; i < arr.length; i++) {
                arr2[j++] = arr[i];
            }

            return arr2;
        }
    }



}
