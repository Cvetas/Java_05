public class AreNumbersEqual {


    //1.6 Напишите алгоритм AreNumbersEqual, который принимает на
    //вход 2 любых int числа, и возвращает
    //0, если числа равны
    //-1, если первое число меньше второго
    //1, если первое число больше второго

    public int areNumbersEqual(int a, int b){
        if(a == b){
            return 0;
        }
        if(a < b){
            return -1;
        }
        if(a > b){
            return 1;
        }

        return 666;
    }
}
