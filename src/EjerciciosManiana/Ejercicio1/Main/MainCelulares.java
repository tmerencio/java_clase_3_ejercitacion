package EjerciciosManiana.Ejercicio1.Main;

import EjerciciosManiana.Ejercicio1.Celular;
import EjerciciosManiana.Ejercicio1.Comparators.Comparator;
import EjerciciosManiana.Ejercicio1.SortUtil;

public class MainCelulares {
    public static void main(String[] args) {
        Celular celular1 = new Celular(6);
        Celular celular2 = new Celular(3);
        Celular celular3 = new Celular(2);
        Celular celular4 = new Celular(1);
        Celular celular5 = new Celular(5);

        Celular[] arr = {celular1, celular2, celular3, celular4, celular5};

        System.out.println("\nArray original: ");

        for(Celular c : arr) {
            System.out.print(c.getNumero() + ", ");
        }

        Comparator<Celular> c1 = (a, b) -> a.getNumero() - b.getNumero();

        SortUtil.ordenar(arr, c1);

        System.out.println("\nArray ordenado: ");

        for(Celular c : arr) {
            System.out.print(c.getNumero() + ", ");
        }
    }
}
