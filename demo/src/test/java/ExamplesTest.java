import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.example.Cal;

public class ExamplesTest {

    @DataProvider(name = "DivisionTesting")
    public Object[][] dpMethod() {
        return new Object[][] { { 10, 5, 2 }, { 5, 5, 1 }, { 5, 5, 1 },{ 5, 0, 0 } };
    }

    @DataProvider(name = "marksTesting")
    public Object[][] marks() {
        return new Object[][] {
                { 100, "Excellent" },
                { 101, "Invalid" },
                { 5, "Invalid" },
                { 0, "Invalid" },
                { -1, "Invalid" },
                { 99, "Excellent" },
                { 91, "Excellent" },
                { 90, "Excellent" },
                { 89, "Very Good" },
                { 81, "Very Good" },
                { 80, "Very Good" },
                { 79, "Good" },
                { 71, "Good" },
                { 70, "Good" },
                { 69, "Accepted" },
                { 61, "Accepted" },
                { 60, "Accepted" },
                { 59, "Failed" },
                { 41, "Failed" },
                { 40, "Failed" },
                { 39, "Invalid" },
        };
    }

    @Test(dataProvider = "DivisionTesting", expectedExceptions = ArithmeticException.class)
    public void testDivisionWithException(double x, double y, double expected) {
        Cal calDiv = new Cal();
        Assert.assertEquals(calDiv.testDivision(x, y), expected);
    }
    @Test(dataProvider = "DivisionTesting")
    public void testDivision(double x, double y, double expected) {
        Cal calDiv = new Cal();
        Assert.assertEquals(calDiv.testDivision(x, y), expected);
    }

    @Test(dataProvider = "marksTesting", enabled = false)
    public void testMarks(int x, String expected) {
        Cal calDiv = new Cal();
        Assert.assertEquals(calDiv.getGrade(x), expected);
    }
}