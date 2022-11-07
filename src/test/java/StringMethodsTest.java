import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {

    @Test
    public void testRemoveSpaces_Deleted_HappyPath(){
        String text = "  Red Rover School  ";
        String expectedResult = "Лишние пробелы удалены";
        String actualResult = new StringMethods().removeSpaces(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveSpaces_Wasnt_HappyPath(){
        String text = "Red Rover School";
        String expectedResult = "Пробелов не было";
        String actualResult = new StringMethods().removeSpaces(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveSpaces_Empty_HappyPath(){
        String text = "";
        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().removeSpaces(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllAs_HappyPath(){
        String text = " Red Rover School  ";
        String expectedResult = "Red Rover School";
        String actualResult = new StringMethods().removeAllAs(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllAs_WithA_HappyPath(){
        String text = " panda  ";
        String expectedResult = "pnd";
        String actualResult = new StringMethods().removeAllAs(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllZeros_HappyPath(){
        String text = "3504209706040000 ";
        String expectedResult = "35429764";
        String actualResult = new StringMethods().removeAllZeros(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllZeros_Val_HappyPath(){
        String text = "0000000111";
        String expectedResult = "111";
        String actualResult = new StringMethods().removeAllZeros(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllZeros_Valid_HappyPath(){
        String text = "111";
        String expectedResult = "This is a valid string";
        String actualResult = new StringMethods().removeAllZeros(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllSpaces_HappyPath(){
        String text = " R e d Ro ve r Sc h ool ";
        String expectedResult = "RedRoverSchool";
        String actualResult = new StringMethods().removeAllSpaces(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllSpaces(){
        String text = " p a n d a  ";
        String expectedResult = "panda";
        String actualResult = new StringMethods().removeAllSpaces(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountAs_One_HappyPath(){
        String text = "Abracadabra";
        int[] expectedResult = {5, 6};
        int[] actualResult = new StringMethods().countAs(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountAs_Two_HappyPath(){
        String text = "Homenum Revelio";
        int[] expectedResult = {0, 15};
        int[] actualResult = new StringMethods().countAs(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountAs_Three_HappyPath(){
        String text = "3 tarAmasAlatA";
        int[] expectedResult = {6, 8};
        int[] actualResult = new StringMethods().countAs(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountJava_True_HappyPath(){
        String text = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current " +
                "long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy " +
                "version Java 8 LTS in January 2019 for commercial use, although it will otherwise still support " +
                "Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer " +
                "zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades";
        boolean expectedResult = true;
        boolean actualResult = new StringMethods().countJava(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountJava_False_HappyPath(){
        String text = "99 little bugs in a code.\n" +
                "99 little bugs in a code.\n" +
                "Take one down, and patch it around.\n" +
                "235 critical bugs in the code.";
        boolean expectedResult = false;
        boolean actualResult = new StringMethods().countJava(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testInsertQuotes_HappyPath(){
        String text = "Abracadabra";
        String expectedResult = "\"Abracadabra\"";
        String actualResult = new StringMethods().insertQuotes(text);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testInsertQuotes_Two_HappyPath(){
        String text1 = "Федор Достоевский писал";
        String text2 = "Надо любить жизнь больше, чем смысл жизни.";
        String expectedResult = "Федор Достоевский писал: \"Надо любить жизнь больше, чем смысл жизни.\"";
        String actualResult = new StringMethods().insertQuotes(text1, text2);
    }

    @Test
    public void testInsertQuotes_Nap_HappyPath(){
        String text1 = "Наполеон Бонапарт писал";
        String text2 = "В моем словаре нет слова «невозможно».";
        String expectedResult = "Наполеон Бонапарт писал: \"В моем словаре нет слова «невозможно».\"";
        String actualResult = new StringMethods().insertQuotes(text1, text2);
    }

    @Test
    public void testCityName_HappyPath(){
        String text = "ташкент";
        String expectedResult = "Ташкент";
        String  actualResult = new StringMethods().cityName(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCityName_Chi_HappyPath(){
        String text = "ЧикаГО";
        String expectedResult = "Чикаго";
        String  actualResult = new StringMethods().cityName(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTextBetween_B_HappyPath(){
        String text = "Abracadabra";
        String s = "b";
        String expectedResult = "bracadab";
        String actualResult = new StringMethods().textBetween(text, s);
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testTextBetween_P_HappyPath(){
        String text = "Whippersnapper";
        String s = "p";
        String expectedResult = "ppersnapp";
        String actualResult = new StringMethods().textBetween(text, s);
        Assert.assertEquals(actualResult, expectedResult);


    }

    @Test
    public void oneWordStartEndSame(){
        String text = "Abracadabra";
        boolean expectedResult = true;
        boolean actualResult = new StringMethods().oneWordStartEndSame(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void lastWord(){
        String text = "Red Rover";
        String expectedResult = "Rover";
        String actualResult = new StringMethods().lastWord(text);
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void deleteBetween(){
        String text = "Red rover";
        int a = 1;
        int b = 4;
        String expectedResult = "Rover";
        String actualResult  = new StringMethods().deleteBetween(text, a, b);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testWordToArr_HappyPath(){
        String text = "QA for Everyone";
        String[] expectedResult = {"QA", "for", "Everyone"};
        String [] actualResult = new StringMethods().wordToArr(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNameToArr_HappyPath(){
        String text = "Александр Сергеевич Пушкин";
        String[] expectedResult = {"Имя: Александр", "Отчество: Сергеевич", "Фамилия: Пушкин"};
        String [] actualResult = new StringMethods().nameToArr(text);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRepeatNTime_HappyPath(){
        String text = "one";
        int n = 5;
        String expectedResult = "oneoneoneoneone";
        String actualResult = new StringMethods().repeatNTime(text, n);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIndexLetter_HappyPath(){
        String text = "oneoneoneoneone";
        int i = 5;
        char expectedResult = 101;
        char actualResult = new StringMethods().indexLetter(text, i);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTreeWordEquals_HappyPath(){
        String word1 = "one";
        String word2 = "One";
        String word3 = "ONE";
        boolean expectedResult = true;
        boolean actualResult = new StringMethods().treeWordEquals(word1, word2, word3);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTreeWordEquals_NegativePath(){
        String word1 = "one";
        String word2 = "Один";
        String word3 = "ONE";
        boolean expectedResult = false;
        boolean actualResult = new StringMethods().treeWordEquals(word1, word2, word3);
        Assert.assertEquals(actualResult, expectedResult);
    }






}
