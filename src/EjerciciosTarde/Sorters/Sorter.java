package EjerciciosTarde.Sorters;

import EjerciciosTarde.Comparators.Comparator;

public interface Sorter<T> {
    public void sort(T[] arr, Comparator<T> c);
}
