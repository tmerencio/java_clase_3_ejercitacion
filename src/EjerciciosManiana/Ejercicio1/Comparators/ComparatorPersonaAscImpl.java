package EjerciciosManiana.Ejercicio1.Comparators;

import EjerciciosManiana.Ejercicio1.Persona;

public class ComparatorPersonaAscImpl implements Comparator<Persona> {
    @Override
    public int compare(Persona a, Persona b) {
        return a.getDni() - b.getDni();
    }
}
