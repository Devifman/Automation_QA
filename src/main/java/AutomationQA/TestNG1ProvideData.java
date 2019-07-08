package AutomationQA;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners()
public class TestNG1ProvideData {
@DataProvider(name = "name")
    @Test
    public Object[][] dataProvider(){
    return new Object[][]{
            {1,"One"},
            {2,"Two"},
            {3,"Three"},

    };
}
@Test(dataProvider = "name")
    public void equalsOfProvideData(int x, int y){
    Assert.assertEquals(Math.max(x,5),Math.max(y,5));
}
@Test(dataProvider = "name")
    public void dataTrueorFail(int x, int y){

}
    }


