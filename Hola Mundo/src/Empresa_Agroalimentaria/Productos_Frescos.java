package Empresa_Agroalimentaria;

public class Productos_Frescos  extends ProductoAgro{

    public Productos_Frescos(double precioUnit, String numLote, int anio, int mes, int dia, String paisOrigen, int caduca ){
        super(precioUnit, numLote, anio, mes, dia, paisOrigen, caduca);
    }

    @Override
    public String descripcionProducto(){
        return String.format("Tipo: %s%nPaís de Origen: %s%nFecha de Envasamiento: %s%n"+
                             "Fecha de Caducidad: %s%nNúmero de Lote: %s%nPrecio Unitario: %.2f%n",
                            "Producto Fresco",getPaisOrigen(), getFechaEnvasado(), getFechaCaducidad(),
                            getNumLote(), getPrecioUnit() );
    }


}
