package extended;

import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.fail;

public class AssumeTest_2 {
    @Before
    public void setUp() {
        String versionNUmber = "5"; //get it from configuration
        Assume.assumeTrue(Integer.valueOf(versionNUmber) >= 4); //if this condition is True => will run all tests
    }
    @Test
    public void test(){
        System.out.println("Now we can test a thing...");
        //fail("Not yes implemented");
    }
    @Test
    public void test2(){
        System.out.println("...or two...");
        //fail("Not yes implemented");
    }
}
