package EjerciciosTarde;

import EjerciciosTarde.Comparators.*;
import EjerciciosTarde.Sorters.Sorter;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        MiFactory miFactory = new MiFactory();
        Sorter sorter = (Sorter) miFactory.getInstance(
                "src/EjerciciosTarde/MiFactory.properties",
                "sorter");

        // Array de enteros
        Comparator<Integer> c = new ComparatorIntAscImpl();
        Integer[] arr = {4,2,1,9,7,8,5};
        System.out.println("Array original: " + Arrays.toString(arr));
        sorter.sort(arr, c);
        System.out.println("Array ordenado: " + Arrays.toString(arr));

        // Array de cadenas
        Comparator<String> c2 = new ComparatorStrAscImpl();
        String[] arrStr = {"Juan","Carlos","Pepe","Maria","Beto","Rosa","Graciela"};
        System.out.println("Array original: " + Arrays.toString(arrStr));
        sorter.sort(arrStr, c2);
        System.out.println("Array ordenado: " + Arrays.toString(arrStr));
    }
}
