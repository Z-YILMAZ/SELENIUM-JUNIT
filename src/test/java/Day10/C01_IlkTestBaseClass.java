package Day10;

import Utilities.TestBaseBeforeAfter;
import org.junit.Test;
import Utilities.TestBaseBeforeAfter;

public class C01_IlkTestBaseClass extends TestBaseBeforeAfter {

    @Test
    public void test1(){
        driver.get("https://amazon.com");
    }
}
