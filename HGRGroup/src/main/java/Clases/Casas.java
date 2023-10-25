
package Clases;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;


public class Casas {
    private String nombreCliente;
    private String codigo;
    private String faseConstru;
    private double costoBase;
    private double costoAdons;
    private double costoModificaciones;
    private double costoFinal;
    private List<Modificaciones> modificaciones;
    private List<Addons> adons;
    private LocalDate fechaEntrega;
   // private List<Cotizacion> reporteCotizacion;

    public Casas() {
        this.nombreCliente = "";
        this.codigo = "";
        this.faseConstru = "";
        this.costoBase = 0.0;
        this.costoAdons = 0.0;
        this.costoModificaciones = 0.0;
        this.costoFinal = 0.0;
        this.modificaciones = new ArrayList<>();
        this.fechaEntrega = LocalDate.of(0, 0, 0);
        //this.reporteCotizacion = new ArrayList<>();
    }

    public Casas(String nombreCliente, String numCasa, String faseConstru, java.lang.Double costoBase, java.lang.Double costoAdons, java.lang.Double costoModificaciones, java.lang.Double costoFinal, List<Modificaciones> modificaciones, List<Addons> adons, LocalDate fechaEntrega) {
        this.nombreCliente = nombreCliente;
        this.codigo = numCasa;
        this.faseConstru = faseConstru;
        this.costoBase = costoBase;
        this.costoAdons = costoAdons;
        this.adons = adons;
        this.costoModificaciones = costoModificaciones;
        this.costoFinal = costoFinal;
        this.modificaciones = modificaciones;
        this.fechaEntrega = fechaEntrega;
        //this.reporteCotizacion = reporteCotizacion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getFaseConstru() {
        return faseConstru;
    }

    public double getCostoBase() {
        return costoBase;
    }
    
    public double getCostoAdons() {
        return costoAdons;
    }

    public List<Addons> getAddons(){
        return adons;
    };
    public double getCostoModificaciones(){
        return costoModificaciones;
    }
    
    public double getCostoFinal(){
        return costoFinal;
    }
    
    public List<Modificaciones> getModificaciones() {
        return modificaciones;
    }

    public String getFechaEntrega() {
        //Establecemos formato de retorno
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // Formatear la fecha según el formato personalizado
        String fechaFormateada = fechaEntrega.format(formatter);
        return fechaFormateada;
    }

    /*public List<Cotizacion> getReporteCotizacion() {
        return reporteCotizacion;
    }*/

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setCodigo(String code) {
        this.codigo = code;
    }

    public void setFaseConstru(String faseConstru) {
        this.faseConstru = faseConstru;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }
    
    public void setCostoAddons(double costoAdons){
        this.costoAdons = costoAdons;
    }
    
    public void setAddons(List<Addons> adons){
        this.adons = adons;
    }
    public void setCostoModificaciones(double costoModi){
        this.costoModificaciones = costoModi;
    }
    
    public void setCostoFinal(double costoFinal) {
        this.costoFinal = costoFinal;
    }
    
    public void setModificaciones(List<Modificaciones> modificaciones) {
        this.modificaciones = modificaciones;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    /*public void setReporteCotizacion(List<Cotizacion> reporteCotizacion) {
        this.reporteCotizacion = reporteCotizacion;
    }*/
    
    public void calcularCostoFinal(){
        double costoFinal = 0;
        costoFinal = getCostoBase() + getCostoModificaciones() + getCostoAdons();
        setCostoFinal(costoFinal);
    }
    
    
    
    
}
