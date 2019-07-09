package AutomationQA;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

@Listeners()
public class TestNG1ProvideData {
    @DataProvider(name = "Done")
    @Test
    public Object[][] dataProvider() {
        return new Object[][]{
                {1, -1},
                {2, -2},
                {-3, 3},

        };
    }

    @DataProvider(name = "True")
    public Object[] True() {
        return new Object[]{
                false
        };
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite Check");
    }

    @DataProvider(name = "Fail")
    public Object[] Fail() {
        return new Object[]{
                "Fail"
        };
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite Check");
    }

    @Test
    @Parameters({"NumberOne", "NumberTwo"})
    public void SoftAssertTest(int x, int y) {
        SoftAssert saTest = new SoftAssert();
        saTest.assertEquals(x, y, "Provided numbers is not equal");
        x = 2;
        y = 2;
        saTest.assertEquals(x, y, "Provided numbers is not equal");
        saTest.assertAll();
    }

    @Test(dataProvider = "Done")
    public void testing(int x, int y) {
        Assert.assertEquals(Math.abs(x), Math.abs(y), "Provided numbers are equals");
    }

    @Test(dataProvider = "True")
    public void secondTesting(boolean x) {
        Assert.assertFalse(x, "True");
    }

    @Test(dataProvider = "Done")
    public void thirdTesting(int x, int y) {
        Assert.assertNotEquals(Math.pow(x, 2), Math.pow(y, 2), "Provided numbers are not Equals");
    }

    @Test(dataProvider = "Fail")
    public void fourthTesting(String x) {
        Assert.fail(x);
    }

    @Test(dataProvider = "True")
    public void fifthTesting(boolean x) {
        Assert.assertFalse(x, "False");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method check");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After method check");
    }
}


