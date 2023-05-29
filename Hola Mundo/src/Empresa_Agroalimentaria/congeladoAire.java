package Empresa_Agroalimentaria;

public class congeladoAire extends Producto_Congelado{

    private double cantidadNitrogeno;
    private double cantidadOxigeno;
    private double cantidadDioxidoCarbono;
    private double cantidadVaporAgua;


    public congeladoAire(double precioUnit, String numLote, int anio, int mes, int dia,
                         String paisOrigen, int caduca, double temperaturaMantenimiento,
                         double cantidadNitrogeno, double cantidadOxigeno, double cantidadDioxidoCarbono,
                         double cantidadVaporAgua){

        super(precioUnit, numLote, anio, mes, dia, paisOrigen, caduca, temperaturaMantenimiento);

        this.cantidadNitrogeno = cantidadNitrogeno;
        this.cantidadOxigeno = cantidadOxigeno;
        this.cantidadDioxidoCarbono = cantidadDioxidoCarbono;
        this.cantidadVaporAgua = cantidadVaporAgua;
    }



    public double getCantidadNitrogeno() {
        return cantidadNitrogeno;
    }

    public void setCantidadNitrogeno(double cantidadNitrogeno) {
        if(cantidadNitrogeno <= 0.0 || cantidadNitrogeno >= 1.0){
            throw new IllegalArgumentException("%N2 debe ser mayor que 0.0 y menor que 1.0");
        }
        this.cantidadNitrogeno = cantidadNitrogeno;
    }


    public double getCantidadOxigeno() {
        return cantidadOxigeno;
    }

    public void setCantidadOxigeno(double cantidadOxigeno) {
        if(cantidadOxigeno <= 0.0 || cantidadOxigeno >= 1.0){
            throw new IllegalArgumentException("%O2 debe ser mayor que 0.0 y menor que 1.0");
        }
        this.cantidadOxigeno = cantidadOxigeno;
    }


    public double getCantidadDioxidoCarbono() {
        return cantidadDioxidoCarbono;
    }

    public void setCantidadDioxidoCarbono(double cantidadDioxidoCarbono) {
        if(cantidadDioxidoCarbono <= 0.0 || cantidadDioxidoCarbono >= 1.0){
            throw new IllegalArgumentException("%CO2 debe ser mayor que 0.0 y menor que 1.0");
        }
        this.cantidadDioxidoCarbono = cantidadDioxidoCarbono;
    }


    public double getCantidadVaporAgua() {
        return cantidadVaporAgua;
    }

    public void setCantidadVaporAgua(double cantidadVaporAgua) {
        if(cantidadVaporAgua <= 0.0 || cantidadVaporAgua >= 1.0){
            throw new IllegalArgumentException("%H2O debe ser mayor que 0.0 y menor que 1.0");
        }
        this.cantidadVaporAgua = cantidadVaporAgua;
    }


    @Override
    public String composicionCongelado() {
        return String.format("El producto contiene:%n%.2f %s%n"+
               "%.2f %s%n%.2f %s%n%.2f %s%n",
                getCantidadNitrogeno(), "%N2", getCantidadOxigeno(), "%O2", getCantidadDioxidoCarbono(), "%CO2",
                getCantidadVaporAgua(), "%H2O");
    }
}
