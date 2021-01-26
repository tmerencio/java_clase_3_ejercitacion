package EjerciciosTarde.Sorters;

import java.util.Comparator;

public class BubbleSortSorterImple implements Sorter{
    @Override
    public void sort(Object[] arr, Comparator c) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-1; j++)
                if (c.compare(arr[j], arr[j+1]) > 0)
                {
                    // swap arr[j+1] and arr[j]
                    Object temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

    }
}

