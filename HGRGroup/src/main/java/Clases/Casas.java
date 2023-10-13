

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;


public class Casas {
    private String nombreCliente;
    private int numCasa;
    private String faseConstru;
    private float costo;
    private List<Modificaciones> modificaciones;
    private List<Modificaciones> reporteModificaciones;
    private LocalDate fechaEntrega;
    private List<Cotizacion> reporteCotizacion;

    public Casas() {
        this.nombreCliente = "";
        this.numCasa = 0;
        this.faseConstru = "";
        this.costo = 0.0F;
        this.modificaciones = new ArrayList<>();
        this.reporteModificaciones = new ArrayList<>();
        this.fechaEntrega = LocalDate.of(0, 0, 0);
        this.reporteCotizacion = new ArrayList<>();
    }

    public Casas(String nombreCliente, int numCasa, String faseConstru, float costo, List<Modificaciones> modificaciones, List<Modificaciones> reporteModificaciones, LocalDate fechaEntrega, List<Cotizacion> reporteCotizacion) {
        this.nombreCliente = nombreCliente;
        this.numCasa = numCasa;
        this.faseConstru = faseConstru;
        this.costo = costo;
        this.modificaciones = modificaciones;
        this.reporteModificaciones = reporteModificaciones;
        this.fechaEntrega = fechaEntrega;
        this.reporteCotizacion = reporteCotizacion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getNumCasa() {
        return numCasa;
    }

    public String getFaseConstru() {
        return faseConstru;
    }

    public float getCosto() {
        return costo;
    }

    public List<Modificaciones> getModificaciones() {
        return modificaciones;
    }

    public List<Modificaciones> getReporteModificaciones() {
        return reporteModificaciones;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public List<Cotizacion> getReporteCotizacion() {
        return reporteCotizacion;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setNumCasa(int numCasa) {
        this.numCasa = numCasa;
    }

    public void setFaseConstru(String faseConstru) {
        this.faseConstru = faseConstru;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public void setModificaciones(List<Modificaciones> modificaciones) {
        this.modificaciones = modificaciones;
    }

    public void setReporteModificaciones(List<Modificaciones> reporteModificaciones) {
        this.reporteModificaciones = reporteModificaciones;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void setReporteCotizacion(List<Cotizacion> reporteCotizacion) {
        this.reporteCotizacion = reporteCotizacion;
    }
    public String mostrarDatos(){
        String info= "";
        return info;
    }
    
    
    
    
}
