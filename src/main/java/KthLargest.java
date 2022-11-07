public class KthLargest {

    //13. Написать алгоритм KthLargest, который принимает на вход
    //массив целых чисел и число k, и возвращает k-тый максимальный
    //элемент
    public int KthLargest(int[] arr, int k){
        int[] pk = new PeakElement().peakElement(arr);

        return pk[k];
    }
}
