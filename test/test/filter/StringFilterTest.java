package test.filter;

import by.bsu.lab3.filter.StringFilter;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StringFilterTest {

    StringFilter filter;

    @BeforeClass
    public void setUp(){
        filter = new StringFilter();
    }

    @Test(description = "positive test for filtering string to ints", enabled = true)
    public void filterIntTestPositive() {
        String [] strings = {"32424", "fsq231", "24,32", "32k", "4334/2", "42"};

        String[] actual = filter.filterInt(strings);
        String[] expected = {"32424", "42"};

        Assert.assertEquals(actual, expected, "test wrong because .....");
    }

    @Test(description = "negative test for filtering string to ints", enabled = true)
    public void filterIntTestNegative() {
        String [] strings = {"32424", "fsq231", "24,32", "32k", "4334.2", "42"};

        String[] actual = filter.filterInt(strings);
        String[] expected = {"32424", "4334.2", "42"};

        Assert.assertNotEquals(actual, expected, "test wrong because .....");
    }

    @AfterClass
    public void tierDown(){
        filter = null;
    }
}
