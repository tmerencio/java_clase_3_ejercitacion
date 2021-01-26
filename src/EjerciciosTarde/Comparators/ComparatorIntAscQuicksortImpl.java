package EjerciciosTarde.Comparators;

public class ComparatorIntAscQuicksortImpl implements Comparator<Integer>{
    @Override
    public boolean compare(Integer a, Integer b) {
        return a <= b;
    }
}
