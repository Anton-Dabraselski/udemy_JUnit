package extended;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class ReporterTest_demo {

    @Test
    void testKeyValuePair(TestReporter testReporter){
        testReporter.publishEntry("my key", "my value");
    }

    @Test
    void testMultipleKeyValuePairs(TestReporter testReporter){
        Map<String, String> values = new HashMap<>();
        values.put("name", "Kolya");
        values.put("handle", "Vasia");
        testReporter.publishEntry(values);
    }

}
