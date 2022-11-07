import org.testng.Assert;
import org.testng.annotations.Test;

public class GoodBadPoorNumberTest {

    @Test
    public void testGoodBadPoorNumber_Good_HappyPath(){
            int m = 63;
            String expectedResult = "Good Number";
            String actionResult = new GoodBadPoorNumber().goodBadPoorNumber(m);
            Assert.assertEquals(actionResult, expectedResult);
    }

    @Test
    public void testGoodBadPoorNumber_Bad_HappyPath(){
        int m = 9;
        String expectedResult = "Bad Number";
        String actionResult = new GoodBadPoorNumber().goodBadPoorNumber(m);
        Assert.assertEquals(actionResult, expectedResult);
    }
    @Test
    public void testGoodBadPoorNumber_Poor_HappyPath(){
        int m = 11;
        String expectedResult = "Poor Number";
        String actionResult = new GoodBadPoorNumber().goodBadPoorNumber(m);
        Assert.assertEquals(actionResult, expectedResult);
    }

    @Test
    public void testGoodBadPoorNumber_MinesOne_HappyPath(){
        int m = 3;
        String expectedResult = "-1";
        String actionResult = new GoodBadPoorNumber().goodBadPoorNumber(m);
        Assert.assertEquals(actionResult, expectedResult);
    }

}
