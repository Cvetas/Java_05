import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {

    @Test
    public void testManipulationsWithArrays_HappyPath(){
        int[] arr = {1, 2, 3, 4, 5};
        int a =5;
        int[] expectedResult = {5, 10, 15, 20, 25};
        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(arr, a);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToDoubleArray_HappyPath(){
        int[] arr = {1, 2, 3, 4, 5};
        double[] expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToIntArray_HappyPath(){
        double[] arr = {1.1, 2.5, 3.7, 4.0, 5.5};
        int[] expectedResult = {1, 2, 3, 4, 5};
        int[] actualResult = new ManipulationsWithArrays().toIntArray(arr);
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testToStringArray_HappyPath(){
        int[] arr = {1, 2, 3, 4, 5};
        String[] expectedResult = {"1", "2", "3", "4", "5"};
        String[] actualResult = new ManipulationsWithArrays().toStringArray(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testToStringArray_Double_HappyPath(){
        double[] arr = {1.1, 2.5, 3.7, 4.0, 5.5};
        String[] expectedResult = {"1.1", "2.5", "3.7", "4.0", "5.5"};
        String[] actualResult = new ManipulationsWithArrays().toStringArray(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testgetTheGreaterHalf_HappyPath(){
        int[] arr = {2, 1, 1, 1, 1, 8, 3, 4, 2, 3, 2, 3};
        int [] expectedResult = {3, 4, 2, 3, 2, 3};
        int[] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testgetTheGreaterHalf_Odd_HappyPath(){
        int[] arr = {2, 1, 1, 1, 1, 8, 3, 4, 5, 2, 3, 2, 3};
        int [] expectedResult = {3, 4, 5, 2, 3, 2, 3};
        int[] actualResult = new ManipulationsWithArrays().getTheGreaterHalf(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }


}
