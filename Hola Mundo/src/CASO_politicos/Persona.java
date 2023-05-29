package CASO_politicos;

public class Persona {

    private final String nombre;
    private final String apellido;
    private int edad;
    private boolean casado;

    public Persona(String nombre, String apellido, int edad, boolean casado){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.casado = casado;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }


    public String toString(){
        return String.format("nombre: %s%napellido: %s%nedad: %d %nestado civil: %s",
                getNombre(), getApellido(), getEdad(),
                ((casado == true) ? "Si":"No") );
    }





}
