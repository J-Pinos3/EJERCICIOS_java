package Empresa_Agroalimentaria;

public class congeladoNitrogeno extends Producto_Congelado{
    private String metodoCongelado;
    private int tiempoCongelacion;

    public congeladoNitrogeno(double precioUnit, String numLote, int anio, int mes, int dia,
           String paisOrigen, int caduca, double temperaturaMantenimiento,
           String metodoCongelado, int tiempoCongelacion){

        super(precioUnit, numLote, anio, mes, dia, paisOrigen, caduca, temperaturaMantenimiento);

        this.metodoCongelado = metodoCongelado;
        this.tiempoCongelacion = tiempoCongelacion;
    }


    public String getMetodoCongelado() {
        return metodoCongelado;
    }

    public void setMetodoCongelado(String metodoCongelado) {
        this.metodoCongelado = metodoCongelado;
    }


    public int getTiempoCongelacion() {
        return tiempoCongelacion;
    }

    public void setTiempoCongelacion(int tiempoCongelacion) {
        if (tiempoCongelacion < 0){
            throw new IllegalArgumentException("El tiempo de congelación debe ser > 0s");
        }
        this.tiempoCongelacion = tiempoCongelacion;
    }

    @Override
    public String composicionCongelado(){
        return String.format("El producto fue congelado por nitrógeno de la siguiente forma: %s%n"+
               "El tiempo de congelación es de %d segundos",
                getMetodoCongelado(), getTiempoCongelacion() );
    }


}
