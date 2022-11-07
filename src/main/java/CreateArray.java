import project_utils.Utils;

import java.util.Arrays;

public class CreateArray {

    //1.1.1. написать в этом классе
    //метод createIntArray(), который принимает на вход 5 целых чисел, и
    //возвращает массив из этих же чисел.
    public int[] createIntArray(int a, int b, int c, int d, int e){
        int[] arr = {a, b, c, d, e};
        return arr;
    }

    //1.1.2.Написать метод createDoubleArray(), который принимает на вход 5 чисел
    // типа double, и возвращает массив из этих же чисел
    //Например, createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}
    public double[] createDoubleArray(double a, double b, double c, double d, double e){
        double[] arr = {a, b, c, d, e};
        return arr;
    }

    //1.1.3. Написать метод createStringArray(), который принимает на вход 5 слов, и
    // возвращает массив из этих слов
    //Например, createStringArray(“It”, “was”, “an”, “apple”, “pie”) ->
    // {“It”, “was”, “an”, “apple”, “pie”}
    public String[] createStringArray(String a, String b, String c, String d, String e){
        String[] arr = {a, b, c, d, e};
        return arr;
    }

    //1.1.4. Написать метод createArrayFromText(), который принимает на вход предложение
    // из нескольких слов и возвращает массив из этих слов.
    //Например, createArrayFromText(“It was an apple pie”) ->
    // {“It”, “was”, “an”, “apple”, “pie”}
    public String[] createArrayFromText(String a){
        String[] arr = a.split(" ");
        return arr;
    }

    //2.1.1. В классе CreateArray написать метод createIntArrayFromText(),
    // который принимает на вход строку чисел (н-р, “3 4 1 8 10 12.3”) и
    // возвращает массив типа int[] из этих чисел. (vожно использовать split()
    // или toCharArray())
    public int[] createIntArrayFromText(String a){
        String[] arr = a.split(" ");
        for (int i = 0; i < arr.length; i++) {
        }
        return new int[0];
    }

    //2.1.5. В классе CreateArray написать метод multiplesOf(), который принимает
    // на вход целое положительные число number в пределах от 1 включительно до 10
    // включительно, и возвращает таблицу умножения на это число в виде массива
    //Например, multiplesOf(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
    public int [] multiplesOf(int number){
        int[] arr = new int[11];
        for (int i = 0; i < 11; i++) {
            arr[i] = i * number;
        }
        return arr;
    }

    //3.1.1. В классе CreateArray написать метод getPhoneNumberAndCountry(), который
    // принимает массив из 11 целых положительных чисел от 0 до 9, и возвращает массив,
    // который содержит номер телефона, состоящий из этих чисел,  и название страны,
    // которой номер принадлежит.
    //Например:
    //getPhoneNumberAndCountry({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) -> {“1(800)123-45-67”, “USA”}
    public String[] getPhoneNumberAndCountry(int[] arr){
        String[] arr1 = new String[2];
        arr1[0] = "" + arr[0] + "(" + arr[1] + arr[2] + arr[3] + ")" + arr[4] + arr[5]+ arr[6] + "-"
                + arr[7] + arr[8] + "-" + arr[9] + arr[10];
        if(arr[1] == 8 && arr[2] == 0 && arr[3] == 0){
            arr1[1] = "USA";
        }

        return arr1;
    }

    //3.1.2. В классе CreateArray написать метод createUniqueArray(), который принимает массив
    // целых положительных чисел больше 0, и возвращает массив уникальных чисел.
    //Например, createUniqueArray({1, 2, 1, 5, 23, 90, 3, 43, 23, 1}) ->
    //{1, 2, 5, 23, 90, 3, 43}
    public int[] createUniqueArray(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, k = 0; j < arr.length; j++) {
                if( i != j && arr[i] == arr[j] ){
                    arr[j] = 0;
                }
            }
        }
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                counter++;
            }
        }
        int[] arr1 = new int[counter];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                arr1[j++] = arr[i];
            }
        }

        return arr1;
    }

    //3.1.3. В классе ManipulationsWithArrays написать метод findNonUniqueValues(),
    // который принимает на вход массив целых положительных чисел, и возвращает
    // количество неуникальных элементов в виде двумерного массива {{n, c}},
    // где n = неуникальное число и с = сколько таких чисел найдено
    //Например,
    //findNonUniqueValues({1, 2, 1, 5, 23, 90, 3, 43, 23, 1}) -> {{1, 3}, {23, 2}}
//    public static int[][] findNonUniqueValues(int[] arr){
//        int[] arr1 = Utils.createUniqueArray(arr);
//        int[][] arr2 = new int[arr1.length][2];
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if(arr1[i] == arr[j]){
//                    arr2[i][0] = arr[i];
//                }
//            }
//        }
//
//
//
//        System.out.println(Arrays.toString(arr2[0]));
//        System.out.println(Arrays.toString(arr2[1]));
//        System.out.println(Arrays.toString(arr2[3]));
//        System.out.println(Arrays.toString(arr2[4]));
//        System.out.println(Arrays.toString(arr2[5]));
//        System.out.println(Arrays.toString(arr2[6]));
//
//        return arr2;
//    }
//
//    public static void main(String[] args) {
//         int[] arr = {1, 2, 1, 5, 23, 90, 3, 43, 23, 1};
//        findNonUniqueValues(arr);
//    }



}
