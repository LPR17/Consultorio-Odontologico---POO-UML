public abstract class Persona {
    //Atributos de Persona
    protected String nombre;
    protected String apellido;
    protected int dni;
    protected int edad;


    public Persona(String nombre, String apellido, int dni,int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad =  edad;
    }

    //Que pueden hacer las personas
    public abstract void mostrarDatos();




    //Getters

    //Setters





}
