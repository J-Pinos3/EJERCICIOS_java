package Empresa_Agroalimentaria;

public class Productos_Refriguerados extends ProductoAgro{

    private String codSupervisionAlimentaria;
    private double temperaturaMantenimiento;

    public Productos_Refriguerados(double precioUnit, String numLote, int anio, int mes, int dia,
           String paisOrigen, int caduca, String codSupervisionAlimentaria, double temperaturaMantenimiento ){

        super(precioUnit, numLote, anio, mes, dia, paisOrigen, caduca);

        this.codSupervisionAlimentaria = codSupervisionAlimentaria;
        this.temperaturaMantenimiento = temperaturaMantenimiento;

    }

    public String getCodSupervisionAlimentaria() {
        return codSupervisionAlimentaria;
    }

    public void setCodSupervisionAlimentaria(String codSupervisionAlimentaria) {
        this.codSupervisionAlimentaria = codSupervisionAlimentaria;
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
                "Código de Supervisión Alimentaria: %s%nTemperatura Óptima: %.3f%n",
                "Producto Refrigerado",getPaisOrigen(), getFechaEnvasado(), getFechaCaducidad(),
                getNumLote(), getPrecioUnit(), getCodSupervisionAlimentaria(), getTemperaturaMantenimiento() );
    }


}
