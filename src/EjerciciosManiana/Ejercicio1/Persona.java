package EjerciciosManiana.Ejercicio1;

public class Persona implements Precedable<Persona>{
    private String nombre;
    private int dni;

    public Persona(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public int precedeA(Persona persona) {
        return this.getDni() - persona.getDni();
    }
}
