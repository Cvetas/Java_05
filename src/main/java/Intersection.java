public class Intersection {

    //Написать алгоритм Intersection, который принимает на вход 2
    //массива целых чисел и возвращает массив общих элементов.

    public int[] intersection(int[] arr1, int[] arr2){
        int counter = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                    counter++;
                }
            }
        }

        int[] arr = new int[counter];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr[i] = arr1[i];

                }
            }
        }

        return arr;
    }

}
