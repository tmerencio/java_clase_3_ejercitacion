package EjerciciosManiana.Ejercicio1.Comparators;

import EjerciciosManiana.Ejercicio1.Celular;

public class ComparatorCelularAscImpl implements Comparator<Celular> {
    @Override
    public int compare(Celular a, Celular b) {
        return a.getNumero() - b.getNumero();
    }
}
