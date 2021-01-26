package EjerciciosTarde;

import EjerciciosTarde.Comparators.Comparator;
import EjerciciosTarde.Comparators.ComparatorIntAscBubblesortImpl;
import EjerciciosTarde.Comparators.ComparatorIntAscHeapsortImpl;
import EjerciciosTarde.Comparators.ComparatorIntAscQuicksortImpl;
import EjerciciosTarde.Sorters.Sorter;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        MiFactory miFactory = new MiFactory();
        Sorter sorter = (Sorter) miFactory.getInstance(
                "src/EjerciciosTarde/MiFactory.properties",
                "sorter");
        Comparator<Integer> c = new ComparatorIntAscBubblesortImpl();
        Integer[] arr = {4,2,1,9,7,8,5};
        System.out.println("Array original: " + Arrays.toString(arr));
        sorter.sort(arr, c);
        System.out.println("Array ordenado: " + Arrays.toString(arr));
    }
}
