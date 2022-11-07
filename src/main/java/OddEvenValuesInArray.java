public class OddEvenValuesInArray {

    //1.1.10. Написать метод countEvenValuesInArray(), который принимает на вход
    //массив целых чисел, и возвращает количество четных чисел в этом
    //массиве
    public int countEvenValuesInArray(int arr[]) {
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    //1.1.11. Написать метод countOddValuesInArray(), который принимает на вход
    //массив целых чисел, и возвращает количество нечетных чисел в этом
    //массиве
    public int countOddValuesInArray(int[] arr) {
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odd++;
            }
        }
        return odd;
    }

    //1.1.12. В классе ManipulationsWithArrays написать метод
    //areValuesGreaterThanNumber(), который принимает на вход массив целых
    //чисел и число number. Метод возвращает значение true, если все элементы
    //массива больше number, иначе возвращает false
    public boolean ManipulationsWithArrays(int[] arr, int a){
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > a) {
                counter++;
            }
        }
        return (counter == arr.length);
    }


}
