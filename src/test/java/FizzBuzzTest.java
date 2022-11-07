import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzTest {

    //1. Positive testing Happy path
    //if (start <= end)
    //return array

    //start < end

    @Test
    public void testStartLessThanEnd_HappyPath() {
        //AAA
        //arrange
        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13",
                "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testStartEaquelEnd_HappyPath() {
        //AAA
        //arrange
        int start = 1;
        int end = 1;
        String[] expectedResult = {"1"};

        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //assert
        Assert.assertEquals(actualResult, expectedResult);

    }
}
