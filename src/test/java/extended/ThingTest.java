package extended;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import extended.Thing;
import extended.ThingParametersResolver;

@ExtendWith(ThingParametersResolver.class)
class ThingTest {

    @Test
    void testAnswer(Thing thing) {
        assertEquals(42, thing.answer());
    }

}
