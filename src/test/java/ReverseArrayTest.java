import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseArrayTest {

    @Test
    public void testReverseArray(){
        int[] arr = new int[] {2, 7, 3, 10};
        int[] expectedResult = new int[] {10, 3, 7, 2};
        int[] actualResult = new ReverseArray().reverseArray(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
