import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LargestNumberFinderTest {

    private LargestNumberFinder ln;
    private HashMap<String, List> dataSet;
    private List<String> keys;

    @BeforeEach
    public void init() {
        ln = new LargestNumberFinder();
        dataSet = new HashMap<>();
        dataSet.put("95021", new ArrayList<>(List.of(9, 50, 1, 2)));
        dataSet.put("56550", new ArrayList<>(List.of(56, 5, 50)));
        dataSet.put("42423420", new ArrayList<>(List.of(42, 423, 420)));
        dataSet.put("97585", new ArrayList<>(List.of(9, 5, 58, 7)));
        keys = new ArrayList<>(dataSet.keySet());
    }

    @RepeatedTest(15000)
    public void getLargestNumber() {
        for (String key : keys) {
            Assertions.assertEquals(key, ln.getLargestNumber(dataSet.get(key)));
        }
    }

    @RepeatedTest(15000)
    public void getLargestNumberAlt() {
        for (String key : keys) {
            Assertions.assertEquals(key, ln.getLargestNumberAlt(dataSet.get(key)));
        }
    }
}