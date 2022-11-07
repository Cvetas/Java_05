import org.testng.Assert;
import org.testng.annotations.Test;

public class PeakElementTest {

    @Test
    public void testPeakElement_HappyPath(){
        int[] arr1 = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};
        int[] actualResult = new PeakElement().peakElement(arr1);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testPeakElement_CheckEnd_HappyPath(){
        int[] arr1 = {3, 2, 7, 5, 1, 9, 23, 1, 23};
        int[] expectedResult = {3, 7, 23, 23};
        int[] actualResult = new PeakElement().peakElement(arr1);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testPeakElement_Null_HappyPath(){
        int[] arr1 = new int[0];
        int[] expectedResult = new int[0];
        int[] actualResult = new PeakElement().peakElement(arr1);

        Assert.assertEquals(actualResult, expectedResult);

    }
}
