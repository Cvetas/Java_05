import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenValuesInArrayTest {

    @Test
    public void testCountEvenValuesInArray_HappyPath(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expectedResult = 5;
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountOddValuesInArray_HappyPath(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expectedResult = 5;
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(arr);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testManipulationsWithArrays(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int a = 15;
        boolean expectedResult = false;
        boolean actualResult = new OddEvenValuesInArray().ManipulationsWithArrays(arr, a);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCreateOddEvenArray_HappyPath(){
        int[][] actualResult = new OddEvenElementsInArray().createOddEvenArray();
    }




}
