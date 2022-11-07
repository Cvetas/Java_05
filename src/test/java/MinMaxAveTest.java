import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {

    @Test
    public void testMinMaxAve(){
        int a = 2;
        int b = 6;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expectedResult = {3, 7, 5};
        int[] actualResult = new MinMaxAve().minMaxAve(arr, a, b);

        Assert.assertEquals(actualResult, expectedResult);

    }
}
