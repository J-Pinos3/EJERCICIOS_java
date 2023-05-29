package CASO_politicos;

public abstract class Legislador extends Persona{
    private String provinviaQueRepresenta;
    private String partidoPolitico;
    private int numDespacho;

    public Legislador(String nombre, String apellido, int edad, boolean casado,
                      String provinviaQueRepresenta, String partidoPolitico, int numDespacho){

        super(nombre, apellido, edad,casado);
        this.provinviaQueRepresenta = provinviaQueRepresenta;
        this.partidoPolitico = partidoPolitico;
        this.numDespacho = numDespacho;

    }

    public String getProvinviaQueRepresenta() {
        return provinviaQueRepresenta;
    }

    public void setProvinviaQueRepresenta(String provinviaQueRepresenta) {
        this.provinviaQueRepresenta = provinviaQueRepresenta;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }


    @Override
    public String toString(){
        return String.format("%s %n%nRepresenta a la provincia de: %s %nPertenece al partido político:%s ",
                super.toString(),getProvinviaQueRepresenta(), getPartidoPolitico() );
    }


    public abstract String getCamaraenQueTrabaja();


}
