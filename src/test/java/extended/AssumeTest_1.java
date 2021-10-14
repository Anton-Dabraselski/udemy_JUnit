package extended;

import org.junit.Assume;
import org.junit.Test;

public class AssumeTest_1 {
    @Test
    public void testIfVersionGreaterThan4(){
        String versionNUmber = "3"; //get it from configuration
        Assume.assumeTrue(Integer.valueOf(versionNUmber) >= 4);
        System.out.println("Test executed.");
    }
}
