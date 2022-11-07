import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    @Test
    public void testOddHappyPath(){
        int a = -345;
        String expectedResult = "Odd";
        String actualResult = new OddEven().oddEven(a);
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testEvenHappyPath(){
        int a = 222222;
        String expectedResult = "Even";
        String actualResult = new OddEven().oddEven(a);
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testEvenZeroHappyPath(){
        int a = 0;
        String expectedResult = "Even";
        String actualResult = new OddEven().oddEven(a);
        Assert.assertEquals(actualResult, expectedResult);

    }
}
