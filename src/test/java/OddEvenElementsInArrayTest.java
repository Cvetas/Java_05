import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenElementsInArrayTest {

    @Test
    public void testOddEvenElementsInArray_HappyPath(){
        int[] arr = {1, 3, 4, 5, 8, 3, 6, 3, 14};
        int[] expectedResult = {4, 5};
        int[] actualResult = new OddEvenElementsInArray().countOddEvenValuesInArray(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }

}
