package project_utils;

import java.util.Arrays;

public class Utils {


    public int[] sortArrayMin(int[] arr){
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

    public int[] sortArrayMax(int[] arr){
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
                if(arr[i]<arr[i+1]){
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

    public int[] originBySortArr(int[] arr){
        int counter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i+1]){
                counter++;
            }
        }
        int newLength = arr.length - counter;
        int[] arr1 = new int[newLength];
        for (int i = 1, j = 0; i < arr.length; i++) {
            if (arr[i-1] == arr[i]){

            } else {
                arr1[j] = arr[i-1];
                j++;
            }
            if(i == arr.length - 1 && arr[i-1] != arr[i]){
                arr1[j] = arr[i];
            }
        }
        return arr1;
    }

    public int[] nullOutOffArr(int[] arr){
        int counter =  0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                counter++;
            }
        }
        int[] arr1 = new int[counter];
        for (int i = 0, j = 0; i < arr1.length; i++) {
            if(arr[i] != 0){
                arr1[j++] = arr[i];
            }
        }
        return arr1;
    }

    public static int countEvenValuesInArray(int arr[]) {
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    public static int countOddValuesInArray(int[] arr) {
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odd++;
            }
        }
        return odd;
    }

    public static int[] createIntArr(int n){

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }

        return arr;
    }

    public  static int[] createUniqueArray(int[] arr){

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



    }




