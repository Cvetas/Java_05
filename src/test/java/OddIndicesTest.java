import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class OddIndicesTest {

    public void testOddIndices(){
        int[] array = new int[]{-45, 590, 234, 985, 12, 68};
        int[] expectedResult = new int[] {590, 985, 68};
        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);

    }
}
