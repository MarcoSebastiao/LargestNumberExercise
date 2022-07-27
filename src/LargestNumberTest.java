import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LargestNumberTest {

    @Test
    public void getLargestNumber() {
        LargestNumberFinder ln = new LargestNumberFinder();
        Assertions.assertEquals("95021", ln.getLargestNumber(new ArrayList<>(List.of(9, 50, 1, 2))));
        Assertions.assertEquals("56550", ln.getLargestNumber(new ArrayList<>(List.of(56, 5, 50))));
        Assertions.assertEquals("42423420", ln.getLargestNumber(new ArrayList<>(List.of(42, 423, 420))));
    }
}