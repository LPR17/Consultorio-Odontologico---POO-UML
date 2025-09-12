public class Paciente extends Persona {
    private boolean obraSocial;
    private int idHistorial;
    private HistorialClinico historialClinico;


    public Paciente(String nombre, String apellido, int dni, int edad, boolean obraSocial, int idHistoriaClinica) {
        super(nombre, apellido, dni, edad);
        this.obraSocial = obraSocial;
        this.idHistorial = nroHistoriaClinica;
        this.historialClinico = new HistorialClinico(this);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Paciente: " + nombre + " " + apellido + " | DNI: "+ dni + " | Obra social: " + obraSocial);
    }

    // Getters y setters
    // ...


    public void solicitarTurno(){

    }

    public verTurnos(){


    }

    public consultarHistorialMedico(){


    }
}