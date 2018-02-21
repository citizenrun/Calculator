
import org.junit.Assert;
import org.junit.Test;
public class TestSum {
    @Test
    public void TestMultiplication() {
        double[]testArray = {2, 3, 4};
        double sum = 24;
        double result = Operation.multiplication(testArray);
      Assert.assertEquals(result, sum);
    }
}
