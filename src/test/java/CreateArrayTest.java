import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {

    @Test
    public void testCreateIntArray_HappyPath(){
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int[] expectedResult = {1, 2, 3, 4, 5};
        int[] actualResult = new CreateArray().createIntArray(a, b, c, d, e);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateDoubleArray_HappyPath(){
        double a = 1.2;
        double b = 2.3;
        double c = 3.4;
        double d = 4.5;
        double e = 5.6;
        double[] expectedResult = {1.2, 2.3, 3.4, 4.5, 5.6};
        double[] actualResult = new CreateArray().createDoubleArray(a, b, c, d, e);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateStringArray_HappyPath(){
        String a = "It";
        String b = "was";
        String c = "an";
        String d = "apple";
        String e = "pie";
        String[] expectedResult = {"It", "was", "an", "apple", "pie"};
        String[] actualResult = new CreateArray().createStringArray(a, b, c, d, e);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateArrayFromText_HappyPath(){
        String a = "It was an apple pie";
        String[] expectedResult = {"It", "was", "an", "apple", "pie"};
        String[] actualResult = new CreateArray().createArrayFromText(a);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testMultiplesOf_HappyPath(){
        int number = 2;
        int[] expectingResult = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] actualResult = new CreateArray().multiplesOf(number);
        Assert.assertEquals(actualResult, expectingResult);
    }

    @Test
    public void testGetPhoneNumberAndCountry_HappyPath(){
        int[] arr = {1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7};
        String[] expectingResult = {"1(800)123-45-67", "USA"};
        String[] actualResult = new CreateArray().getPhoneNumberAndCountry(arr);
        Assert.assertEquals(actualResult, expectingResult);
    }

    @Test
    public void testCreateUniqueArray_HappyPath(){
        int[] arr = {1, 2, 1, 5, 23, 90, 3, 43, 23, 1};
        int[] expectingResult = {1, 2, 5, 23, 90, 3, 43};
        int[] actualResult = new CreateArray().createUniqueArray(arr);
        Assert.assertEquals(actualResult, expectingResult);
    }

}
