import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

import java.util.ArrayList;

public class OperationTest {


    @Test
    public void testSum() {
        //given
        ArrayList<Double> testArray = new ArrayList<Double>();
        testArray.add(10.0);
        testArray.add(3.0);
        testArray.add(2.0);
        //when
        double result = Operation.sum(testArray);
        //then
        double sum = 15.0;
        Assert.assertEquals(result, sum, 0.0);

    }

    @Test
    public void testSubstraction() {
        //given
        ArrayList<Double> testArray = new ArrayList<Double>();
        testArray.add(1.0);
        testArray.add(3.0);
        testArray.add(2.0);
        //when
        double result = Operation.substraction(testArray);
        //then
        double sub = -4.0;
        Assert.assertEquals(sub, result, 0.0);

    }
    @Test
    public void testMultiplication() {
        //given
        ArrayList<Double> testArray = new ArrayList<Double>();
        testArray.add(50.0);
        testArray.add(3.0);
        testArray.add(2.0);
        //when
        double result = Operation.multiplication(testArray);
        //then
        double mult = 300.0;
        Assert.assertEquals(mult, result, 0.0);

    }
    @Test
    public void testDivision() {
        //given
        ArrayList<Double> testArray = new ArrayList<Double>();
        testArray.add(16.0);
        testArray.add(2.0);
        testArray.add(2.0);
        //when
        double result = Operation.division(testArray);
        //then
        double div = 4.0;
        Assert.assertEquals(div, result, 0.0);

    }
}