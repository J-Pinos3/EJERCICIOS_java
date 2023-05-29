package CASO_politicos;

public class Senador extends Legislador{

    private int asientoCamaraAlta;

    public Senador(String nombre, String apellido, int edad, boolean casado,
                    String provinviaQueRepresenta, String partidoPolitico, int numDespacho,
                    int asientoCamaraAlta){

        super(nombre, apellido, edad, casado, provinviaQueRepresenta, partidoPolitico, numDespacho);
        this.asientoCamaraAlta = asientoCamaraAlta;
    }

    public int getAsientoCamaraAlta() {
        return asientoCamaraAlta;
    }

    public void setAsientoCamaraAlta(int asientoCamaraAlta) {
        this.asientoCamaraAlta = asientoCamaraAlta;
    }

    @Override
    public String toString(){
        return String.format("%s %n%nSu asiento en la cámara es: %s",
                super.toString(), getAsientoCamaraAlta() );
    }


    public String getCamaraenQueTrabaja(){
        return "Senador";
    }


}
