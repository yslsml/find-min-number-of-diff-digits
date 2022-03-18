package test.creator;

import by.bsu.lab3.creator.ArrayCreator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArrayCreatorTest {

    ArrayCreator creator;

    @BeforeClass
    public void setUp(){
        creator = new ArrayCreator();
    }

    @Test(description = "positive test for creating array of integers", enabled = true)
    public void factoryIntArrayTestPositive() {
        String [] strings = {"32424", "231", "2432", "43342", "42"};

        int[] actual = creator.factoryIntArray(strings);
        int[] expected = {32424, 231, 2432, 43342, 42};

        Assert.assertEquals(actual, expected, "test wrong because .....");
    }

    @Test(description = "negative test for filtering string to ints", enabled = true)
    public void filterIntTestNegative() {
        String [] strings = {"32424", "231", "2432", "43342", "42"};

        int[] actual = creator.factoryIntArray(strings);
        int[] expected = {32424, 231, 42};

        Assert.assertNotEquals(actual, expected, "test wrong because .....");
    }

    @AfterClass
    public void tierDown(){
        creator = null;
    }

}
