package EjerciciosManiana.Ejercicio1;

import EjerciciosManiana.Ejercicio1.Comparators.Comparator;

public class SortUtil {
    public static <T> void ordenar(T[] arr, Comparator<T> c) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-1; j++)
                if (c.compare(arr[j], arr[j+1]) > 0)
                {
                    // swap arr[j+1] and arr[j]
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

    }
}
