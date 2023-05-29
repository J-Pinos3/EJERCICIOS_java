package Empresa_Agroalimentaria;

public class congeladoAgua extends Producto_Congelado{

    private double salLitroAgua;

    public congeladoAgua(double precioUnit, String numLote, int anio, int mes, int dia,
                                 String paisOrigen, int caduca, double temperaturaMantenimiento, double salLitroAgua){

        super(precioUnit, numLote, anio, mes, dia, paisOrigen, caduca, temperaturaMantenimiento);

        this.salLitroAgua = salLitroAgua;

    }

    public double getSalLitroAgua() {
        return salLitroAgua;
    }

    public void setSalLitroAgua(double salLitroAgua) {
        if(salLitroAgua < 0.0){
            throw new IllegalArgumentException("g(NaCl)/L(H2O) debe ser >= 0.0");
        }
        this.salLitroAgua = salLitroAgua;
    }


    @Override
    public String composicionCongelado(){
        return String.format("El producto contiene: %n%.2f %s%n",
               getSalLitroAgua(), "g(NaCl)/L(H2O)" );
    }


}
