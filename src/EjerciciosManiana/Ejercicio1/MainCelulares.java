package EjerciciosManiana.Ejercicio1;

public class MainCelulares {
    public static void main(String[] args) {
        Celular celular1 = new Celular(6);
        Celular celular2 = new Celular(3);
        Celular celular3 = new Celular(2);
        Celular celular4 = new Celular(1);
        Celular celular5 = new Celular(5);

        Celular[] arr = {celular1, celular2, celular3, celular4, celular5};

        for(Celular c : arr) {
            System.out.print(c.getNumero() + ", ");
        }

        Celular[] arrayOrdenado = SortUtil.ordenar(arr);

        System.out.println("\n Array ordenado: ");

        for(Celular c : arrayOrdenado) {
            System.out.print(c.getNumero()+ ", ");
        }
    }
}
