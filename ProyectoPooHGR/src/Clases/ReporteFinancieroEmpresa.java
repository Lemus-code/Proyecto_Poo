
package Clases;

import java.time.LocalDate;

public class ReporteFinancieroEmpresa {
  
    private LocalDate fechaGeneracion;
    private String descripcion;
    private double ingresosTotales;
    private double gastosTotales;
    private double utilidadNeta;

    public ReporteFinancieroEmpresa() {
    }

    public ReporteFinancieroEmpresa(LocalDate fechaGeneracion, String descripcion, double ingresosTotales, double gastosTotales, double utilidadNeta) {
        this.fechaGeneracion = fechaGeneracion;
        this.descripcion = descripcion;
        this.ingresosTotales = ingresosTotales;
        this.gastosTotales = gastosTotales;
        this.utilidadNeta = utilidadNeta;
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

    public double getIngresosTotales() {
        return ingresosTotales;
    }

    public void setIngresosTotales(double ingresosTotales) {
        this.ingresosTotales = ingresosTotales;
    }

    public double getGastosTotales() {
        return gastosTotales;
    }

    public void setGastosTotales(double gastosTotales) {
        this.gastosTotales = gastosTotales;
    }

    public double getUtilidadNeta() {
        return utilidadNeta;
    }

    public void setUtilidadNeta(double utilidadNeta) {
        this.utilidadNeta = utilidadNeta;
    }
    
    
    
}
