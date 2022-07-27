import java.util.List;
import java.util.stream.Collectors;

public class LargestNumberFinder {
    public String getLargestNumber(List<Integer> numberPool) {
        sortIntList(numberPool);
        return numberPool.stream().map(Object::toString).collect(Collectors.joining());
    }

    /*
    * Faster
    * */
    public String getLargestNumberAlt(List<Integer> numberPool) {
        sortIntList(numberPool);
        StringBuilder sb = new StringBuilder();
        numberPool.forEach(sb::append);
        return sb.toString();
    }

    private void sortIntList(List<Integer> list) {
        list.sort((o1, o2) -> {
            String v1 = "" + o1 + o2;
            String v2 = "" + o2 + o1;
            return v2.compareTo(v1);
        });
    }
}
