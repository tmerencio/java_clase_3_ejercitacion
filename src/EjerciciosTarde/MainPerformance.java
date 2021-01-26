package EjerciciosTarde;

import EjerciciosTarde.Comparators.ComparatorIntAscImpl;
import EjerciciosTarde.Sorters.Sorter;

import java.io.IOException;
import java.util.Comparator;

public class MainPerformance {
    public static void main(String[] args) throws IOException {
        Time time = new Time();

        MiFactory miFactory = new MiFactory();
        Sorter sorter = (Sorter) miFactory.getInstance(
                "src/EjerciciosTarde/MiFactory.properties",
                "sorter");

        Comparator<Integer> c = new ComparatorIntAscImpl();

        Integer[] arr = new Integer[100000];
        for (int i = 99999; i >= 0; i--) {
            arr[i] = i+1;
        }

        time.start();

        sorter.sort(arr, c);

        time.stop();

        System.out.println("Tiempo transcurrido: " + time.elapsedTime());

    }
}
