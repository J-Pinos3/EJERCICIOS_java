package Empresa_Agroalimentaria;

public abstract class Producto_Congelado extends ProductoAgro{

    private double temperaturaMantenimiento;

    public Producto_Congelado(double precioUnit, String numLote, int anio, int mes, int dia,
                                   String paisOrigen, int caduca, double temperaturaMantenimiento ){

        super(precioUnit, numLote, anio, mes, dia, paisOrigen, caduca);

        this.temperaturaMantenimiento = temperaturaMantenimiento;

    }

    public double getTemperaturaMantenimiento() {
        return temperaturaMantenimiento;
    }

    public void setTemperaturaMantenimiento(double temperaturaMantenimiento) {
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    @Override
    public String descripcionProducto(){
        return String.format("Tipo: %s%nPaís de Origen: %s%nFecha de Envasamiento: %s%n"+
                        "Fecha de Caducidad: %s%nNúmero de Lote: %s%nPrecio Unitario: %.2f%n" +
                        "Temperatura Óptima: %.3f%n",
                "Producto Congelado",getPaisOrigen(), getFechaEnvasado(), getFechaCaducidad(),
                getNumLote(), getPrecioUnit(), getTemperaturaMantenimiento() );
    }


    public abstract String composicionCongelado();

}
