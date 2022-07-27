import java.util.List;
import java.util.stream.Collectors;

public class LargestNumberFinder {
    public String getLargestNumber(List<Integer> numberPool) {
        numberPool.sort((o1, o2) -> {
            String v1 = "" + o1 + o2;
            String v2 = "" + o2 + o1;
            return v2.compareTo(v1);
        });
        return numberPool.stream().map(Object::toString).collect(Collectors.joining());
    }
}
