package extended;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BranchCoverageTest {

    @ParameterizedTest
    @CsvSource({"1,2,3", "1,1,1"})
    void testSumAllNumbers(String start, String end, String sum){
        int exp = Integer.parseInt(sum);
        int act = BranchCoverage.sumAllNumbers(Integer.parseInt(start), Integer.parseInt(end));
        assertEquals(exp, act);
    }
}
