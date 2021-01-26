package EjerciciosTarde.Sorters;

import java.util.Comparator;

public class QuickSortSorterImple <T> implements Sorter<T> {

    private int partition(T[] arr, int begin, int end, Comparator c) {
        Object pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (c.compare(arr[j], pivot) <= 0) {
                i++;

                T swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        T swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }

    public void quickSort(T[] arr, int begin, int end, Comparator c) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end, c);

            quickSort(arr, begin, partitionIndex-1, c);
            quickSort(arr, partitionIndex+1, end, c);
        }
    }

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        int begin = 0;
        int end = arr.length - 1;
        quickSort(arr, begin, end, c);
    }
}
