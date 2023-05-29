package Empresa_Agroalimentaria;
import java.util.Date;
import java.util.GregorianCalendar;
//https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=654:ejercicio-resuelto-ejemplo-de-herencia-simple-extends-y-super-en-java-constructores-con-herencia-cu00687b&catid=68&Itemid=188
public abstract class ProductoAgro {

    private double precioUnit;
    private Date fechaCaducidad;
    private Date fechaEnvasado;
    private String paisOrigen;
    private String numLote;

    public ProductoAgro (double precioUnit, String numLote, int anio, int mes, int dia, String paisOrigen, int caduca ){

        if (precioUnit < 0.0) {  throw new IllegalArgumentException("El precio unitario debe ser >= 0.0$");  }

        if( Integer.parseInt(numLote) < 0){  throw new IllegalArgumentException("El número de lote debe ser un número positivo");  }

        GregorianCalendar fecCaduc = new GregorianCalendar(anio + caduca, mes-1, dia);
        GregorianCalendar fecEnvas = new GregorianCalendar(anio, mes-1, dia);

        this.precioUnit = precioUnit;
        this.numLote = numLote;
        this.fechaCaducidad = fecCaduc.getTime();
        this.fechaEnvasado = fecEnvas.getTime();
        this.paisOrigen = paisOrigen;
    }

    public double getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(double precioUnit) {
        this.precioUnit = precioUnit;
    }


    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(int anio, int mes, int dia) {
        GregorianCalendar fecCaduc = new GregorianCalendar(anio, mes-1, dia);
        this.fechaCaducidad = fecCaduc.getTime();
    }


    public String getNumLote() {
        return numLote;
    }

    public void setNumLote(String numLote) {
        this.numLote = numLote;
    }


    public Date getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(int anio, int mes, int dia) {
        GregorianCalendar fecEnvas = new GregorianCalendar(anio, mes-1, dia);
        this.fechaEnvasado = fecEnvas.getTime();
    }


    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }


    public abstract String descripcionProducto();

}
