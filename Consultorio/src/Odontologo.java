public class Odontologo extends Persona {
    private String especialidad;

    public Odontologo(String nombre, String apellido, int dni, int edad, String especialidad) {
        super(nombre, apellido, dni, edad);
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Odontólogo: " + nombre + " " + apellido + " | Especialidad: " + especialidad);
    }

    // Getters y setters
    // ...



}
