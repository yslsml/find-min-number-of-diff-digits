package test.operation;

import by.bsu.lab3.operation.OperationsIntArray;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OpeartionsIntArrayTest {

    OperationsIntArray operation;

    @BeforeClass
    public void setUp(){
        operation = new OperationsIntArray();
    }

    @Test(description = "positive test for finding Element With Min Same Digits", enabled = true)
    public void findElemWithMinSameDigitsTestPositive() {
        int[] nums = new int[]{342, 33, 2, 1111, 32};

        int actual = operation.findElemWithMinDiffDigits(nums);
        int expected = 1111;

        Assert.assertEquals(actual, expected, "test wrong because .....");
    }

    @Test(description = "negative test for finding Element With Min Same Digits", enabled = true)
    public void findElemWithMinSameDigitsTestNegative() {
        int[] nums = new int[]{342, 33, 2, 1111, 32};

        int actual = operation.findElemWithMinDiffDigits(nums);
        int expected = 33;

        Assert.assertNotEquals(actual, expected, "test wrong because .....");
    }

    @AfterClass
    public void tierDown(){
        operation = null;
    }

}
