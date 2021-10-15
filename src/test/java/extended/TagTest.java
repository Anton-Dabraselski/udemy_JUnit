package extended;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;

public class TagTest {

    @Test
    @DisplayName("Case: prod & dev")
    @Tag("production")
    @Tag("development")
    void testCaseA(TestInfo testInfo){

    }

}
