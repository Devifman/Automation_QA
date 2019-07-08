package AutomationQA;
import org.testng.annotations.*;
import org.testng.*;

public class TestNG1 {
@Test
   @Parameters({"Var 1", "Var 2"})
   public void testForNG1(String x, String y){
   Assert.assertEquals(x.length(),y.length());

}
}
