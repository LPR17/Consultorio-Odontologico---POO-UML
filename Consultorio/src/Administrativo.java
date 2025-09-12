public class Administrativo extends Persona {
    private String cargo;

    public Administrativo(String nombre, String apellido, int dni, int edad, String cargo) {
        super(nombre, apellido, dni, edad);
        this.cargo = cargo;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Administrativo: " + nombre + " " + apellido + " | Cargo: " + cargo);
    }

    // Getters y setters
    // ...

    public void registrarTurno(){

    }
}
