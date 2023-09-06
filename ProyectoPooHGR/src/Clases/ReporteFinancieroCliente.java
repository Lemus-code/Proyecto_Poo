
package Clases;

import java.time.LocalDate;


public class ReporteFinancieroCliente {
    
    private LocalDate fechaGeneracion;
    private String descripcion;
    private float totalPagado;
    private float saldoPendiente;
    private float costoTotalCasa;

    public ReporteFinancieroCliente() {
    }

    public ReporteFinancieroCliente(LocalDate fechaGeneracion, String descripcion, float totalPagado, float saldoPendiente, float costoTotalCasa) {
        this.fechaGeneracion = fechaGeneracion;
        this.descripcion = descripcion;
        this.totalPagado = totalPagado;
        this.saldoPendiente = saldoPendiente;
        this.costoTotalCasa = costoTotalCasa;
    }

    public LocalDate getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(LocalDate fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getTotalPagado() {
        return totalPagado;
    }

    public void setTotalPagado(float totalPagado) {
        this.totalPagado = totalPagado;
    }

    public float getSaldoPendiente() {
        return saldoPendiente;
    }

    public void setSaldoPendiente(float saldoPendiente) {
        this.saldoPendiente = saldoPendiente;
    }

    public float getCostoTotalCasa() {
        return costoTotalCasa;
    }

    public void setCostoTotalCasa(float costoTotalCasa) {
        this.costoTotalCasa = costoTotalCasa;
    }
    
    
    
}
