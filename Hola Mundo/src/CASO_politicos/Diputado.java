package CASO_politicos;

public class Diputado extends Legislador{
    private int asientoCamaraBaja;

    public Diputado(String nombre, String apellido, int edad, boolean casado,
                    String provinviaQueRepresenta, String partidoPolitico, int numDespacho,
                    int asientoCamaraBaja){

        super(nombre, apellido, edad, casado, provinviaQueRepresenta, partidoPolitico, numDespacho);
        this.asientoCamaraBaja = asientoCamaraBaja;
    }


    public int getAsientoCamaraBaja() {
        return asientoCamaraBaja;
    }

    public void setAsientoCamaraBaja(int asientoCamaraBaja) {
        this.asientoCamaraBaja = asientoCamaraBaja;
    }

    @Override
    public String toString(){
        return String.format("%s %n%nSu asiento en la cámara es: %s",
                super.toString(), getAsientoCamaraBaja() );
    }


    public String getCamaraenQueTrabaja(){
        return "Diputado";
    }

}
