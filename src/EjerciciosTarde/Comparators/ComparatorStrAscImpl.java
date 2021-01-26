package EjerciciosTarde.Comparators;

import java.util.Comparator;

public class ComparatorStrAscImpl implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return a.compareTo(b);
    }
}
