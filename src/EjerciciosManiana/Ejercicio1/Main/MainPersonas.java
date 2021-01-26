package EjerciciosManiana.Ejercicio1.Main;

import EjerciciosManiana.Ejercicio1.Comparators.ComparatorPersonaAscImpl;
import EjerciciosManiana.Ejercicio1.Persona;
import EjerciciosManiana.Ejercicio1.SortUtil;

public class MainPersonas {
    public static void main(String[] args) {
        Persona persona1 = new Persona(6);
        Persona persona2 = new Persona(2);
        Persona persona3 = new Persona(3);
        Persona persona4 = new Persona(8);
        Persona persona5 = new Persona(1);

        Persona[] arr = {persona1, persona2, persona3, persona4, persona5};

        System.out.println("\n Array original: ");

        for(Persona p : arr) {
            System.out.print(p.getDni() + ", ");
        }

        SortUtil.ordenar(arr, new ComparatorPersonaAscImpl());

        System.out.println("\n Array ordenado: ");

        for(Persona p : arr) {
            System.out.print(p.getDni()+ ", ");
        }
    }
}
