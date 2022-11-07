import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SumArrayTest {

    @Test
    public void testSumArrayPositiveNumbers_HappyPath(){
        int[] array = new int[] {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;
        int actualResult = new SumArray().sumArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test

    public void testSumArrayNegativeNumbers_HappyPath(){
        int[] array = new int[] {-7, -3};
        int expectedResult = -10;
        int actualResult = new SumArray().sumArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
