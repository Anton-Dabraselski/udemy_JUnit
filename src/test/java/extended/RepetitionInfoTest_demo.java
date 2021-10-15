package extended;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

import static org.junit.Assert.assertEquals;

public class RepetitionInfoTest_demo {
    @RepeatedTest(3)
    void testWithRepetitionInfo(RepetitionInfo repetitionInfo, TestReporter reporter){
        reporter.publishEntry("Repetition #" + repetitionInfo.getCurrentRepetition());
        assertEquals(3, repetitionInfo.getTotalRepetitions());
    }
}
