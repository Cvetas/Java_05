import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeOnTheRightTest {

    @Test
    public void testNegativeOnTheRightTest(){
        int[] arr =  {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult = {4, 7, 5, 9, 4, 12, -2, -12, -3};
        int[] actualResult = new NegativeOnTheRight().NegativeOnTheRight(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
