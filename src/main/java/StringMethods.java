import java.util.Arrays;
import java.util.Locale;

public class StringMethods {


    //1. Написать метод removeSpaces(), который принимает на вход строку.
    //Если строка не пустая (проверить методом класса String), то
    //примените метод по удалению пробелов в начале и в конце строки.
    //Догадаться, каким методом из видео можно проверить, были ли
    //пробелы в строке.
    //Если пробелы были, то метод должен удалить их и вернуть сообщение:
    //“Лишние пробелы удалены”.
    //Если пробелов не было, вернуть сообщение “Пробелов не было”.
    //Если строка пустая (проверить методом класса String), вернуть
    //сообщение “Строка пустая”.
    public String removeSpaces(String text){
        if(text.isEmpty()){
            return "Строка пустая";
        }

            int a = text.length();
            text = text.trim();
            int b = text.length();
            if(b < a){
                return "Лишние пробелы удалены";
            } else {
                return "Пробелов не было";
            }
    }

    //2. Написать алгоритм removeAllAs().
    //С помощью методов из видео1, написать алгоритм, который
    //принимает на вход строку. Если строка валидная, то метод удаляет все
    //буквы a из строки, если таковые имеются. Метод возвращает
    //обработанную строку.
    public String removeAllAs(String text){
        if(!text.isEmpty()){
            text = text.trim();
            text = text.replace("a", "");
            return text;
        }
        return text;
    }

    //3. Написать алгоритм removeAllZeros().
    //С помощью методов из видео1, написать алгоритм, который
    //принимает на вход строку, состоящую из цифр. Если строка валидная,
    //то метод удаляет все пробелы из строки, если таковые имеются. Метод
    //возвращает обработанную строку, в которой нет нулей. Если в строке
    //не было нулей, метод возвращает сообщение “This is a valid string”.
    public String removeAllZeros(String text){
        if(!text.isEmpty()){
            text = text.trim();
            int a = text.length();
            text = text.replace("0", "");
            int b = text.length();
            if(b < a){
                return text;
            } else {
                return "This is a valid string";
            }

        }
        return text;

    }

    //4. Написать алгоритм removeAllSpaces.
    //С помощью методов из видео1, написать алгоритм, который
    //принимает на вход строку. Если строка валидная, то метод удаляет все
    //пробелы из строки, если таковые имеются. Метод возвращает
    //обработанную строку.
    public String removeAllSpaces(String text){
        if(!text.isEmpty()){
            text = text.replace(" ", "");
            return text;
        }
        return text;
    }

    //5. Напишите метод countAs(), который принимает на вход строку
    // и считает, сколько букв а или А содержится в строке. Метод
    // возвращает количество букв a/A,  и количество букв/знаков в
    // слове без букв a/A. Итоговый результат должен строится с
    // помощью метода из видео 2
    public int[] countAs(String text){
        int length1 = text.length();
        if(text.contains("A") || text.contains("a")){
            text = text.replace("A", "");
            text = text.replace("a", "");
            int length2 = text.length();
            int[] length = {length1-length2, length2};
            return length;
        }

        return new int[] {0, length1};
    }

    //6. Напишите метод countJava(), который принимает на вход текст
    // и проверяет, содержится ли в тексте хотя бы одно слово Java.
    public boolean countJava(String text){
        return text.contains("Java");
    }

    //7.Напишите метод insertQuotes(), который принимает слово и возвращает строку,
    // в которой это слово “обернуто” в кавычки
    public String insertQuotes(String text){
       text  = "\"" + text;
        return text.concat("\"");
    }

    //8. Напишите метод insertQuotes(), который принимает на вход две строки, и добавляет
    // знак :  после слова “писал”,  и оборачивает в кавычки вторую строку
    //(результат строится с помощью метода concat())
    public String insertQuotes(String text1, String  text2){
        text2 = insertQuotes(text2);
        text1 = text1.replace("писал", "писал: ");
        return text1+text2;
    }

    //9.Напишите метод, кторый принимает на вход название города и исправляет написание:
    //Test Data:
    //“ташкент” → “Ташкент”
    //“ЧикаГО” → “Чикаго”
    public String cityName(String text){
        text = text.toLowerCase();
        int length = text.length();
        String s = text.substring(0,1);
        s = s.toUpperCase();
        text = text.substring(1, length);
        text = s+text;
        return text;
    }

    //10. Напишите метод, который принимает на вход строку и букву-параметр, и
    //возвращает все, что находится между первой и последней буквой-параметром:
    //Test Data:
    //“Abracadabra”, “b” → “bracadab”
    //“Whippersnapper”, “p” → “ppersnapp”
    public String textBetween(String text, String s){
        int first = text.indexOf(s);
        int last = text.lastIndexOf(s);
        return text.substring(first, last + 1);
    }

    //11. Напишите метод, который принимает на вход слово, и возвращает true,
    // если слово начинается и заканчивается на одинаковую букву, и false иначе
    //Test Data:
    //	“Abracadabra” → true
    //	“Whippersnapper” → false
    public boolean oneWordStartEndSame(String text){
        text = text.toLowerCase();
        String start = String.valueOf(text.charAt(0));
        int l = text.length();
        String end = String.valueOf(text.charAt(l-1));

        return  start.equals(end);
    }

    //12. Напишите метод, который принимает на вход строку из двух слов,
    // разделенных пробелом, и возвращает последнее слово
    //Test Data:
    //	“Red Rover” → “Rover”
    public String lastWord(String text){
        int index = text.indexOf(" ");
        String word = text.substring(index + 1);
        return word;
    }

    //13. Написать метод, который принимает строку, и 2 индекса. Метод удаляет все,
    // что находится между двумя индексами включительно
    //Test Data:
    //	“Red rover”, 1, 4 → “Rover”
    public String deleteBetween(String text, int a, int b){
        String text1 = text.substring(0, a);
        String text2 = text.substring(b + 1);
        return text1+text2;
    }

    //14. Напишите метод, который принимает на вход предложение и возвращает слова из
    // этого предложения в виде массива слов
    //Test Data:
    //“QA for Everyone” → {“QA”, “for”, “Everyone”}
    public String[] wordToArr(String text){
        String[] arr = text.split(" ");
        return arr;
    }

    //15. Написать метод, который принимает на вход предложение, которое состоит из имени,
    // фамилии, отчества и возвращает текст:
    //Test Data:
    //“Александр Сергеевич Пушкин” →
    //
    //“Имя: Александр
    //Отчество: Сергеевич
    //Фамилия: Пушкин”
    public String[] nameToArr(String text){
        String[] arr = text.split(" ");
        String[] arr1 = new String[3];
        arr1[0] = "Имя: ".concat(arr[0]);
        arr1[1] = "Отчество: ".concat(arr[1]);
        arr1[2] = "Фамилия: ".concat(arr[2]);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        return arr1;
    }

    //16. Написать метод, который принимает на вход слово и число n,
    // и возвращает строку, где слово повторяется n раз.
    //Test Data:
    //“one”, 5 → “oneoneoneoneone”
    public String repeatNTime(String text, int n){
        text = text.repeat(n);
        return text;
    }

    //17.  Напишите метод, который принимает строку и index, и возвращает
    // численное значение буквы, которая находится на позиции index
    // (использовать только один метод класса String)
    public char indexLetter(String text, int i){
        return text.charAt(i);
    }

    //18.  Написать метод, который принимает 3 слова, и сравнивает их методом,
    // который считает, что прописные и заглавные буквы - это одни и те же буквы.
    // Метод возвращает true, если все слова одинаковы, и метод возвращает false,
    // если слова не одинаковы:
    //Test Data:
    //“one”, “One”, “ONE”  → true
    //“one”, “Один”, “ONE” → false
    public boolean treeWordEquals(String word1, String word2, String word3){
        boolean b = word1.equalsIgnoreCase(word2);
        boolean b1 = word2.equalsIgnoreCase(word3);
        return b && b1;
    }


}
