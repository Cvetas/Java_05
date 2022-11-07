import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

        @Test
        public void testIsPositiveNumberPositive_HappyPass(){
            int a = 555;
            boolean expectedResult = true;
            boolean actualResult = new IsPositiveNumber().isPositiveNumber(a);
            Assert.assertEquals(actualResult, expectedResult);

        }

    @Test
    public void testIsPositiveNumberNegative_HappyPass(){
        int a = -555;
        boolean expectedResult = false;
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(a);
        Assert.assertEquals(actualResult, expectedResult);

    }
    @Test
    public void testIsPositiveNumberZero_HappyPass(){
        int a = 0;
        boolean expectedResult = true;
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(a);
        Assert.assertEquals(actualResult, expectedResult);

    }
}
