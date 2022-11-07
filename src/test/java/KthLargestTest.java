import org.testng.Assert;
import org.testng.annotations.Test;

public class KthLargestTest {

    @Test
    public void KthLargest(){
        int[] arr = {4, 3, 7, 13, 5, 2, 9, 4, 12};
        int k = 3;
        int expectedResult = 9;
        int actualResult = new KthLargest().KthLargest(arr, k);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
