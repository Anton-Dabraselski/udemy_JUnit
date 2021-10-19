package extended.BlackWhiteBox;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertEquals;

public class WhiteBoxTest {

    @ParameterizedTest
    @ValueSource(ints = {-1,1,0})
    void testFuncOdd(int ints){
        assertEquals(ints, WhiteBox.func(ints));
    }

    @ParameterizedTest
    @ValueSource(ints = {-12,2,0})
    void testFuncEven(int ints){
        assertEquals(ints/2, WhiteBox.func(ints));
    }

}
