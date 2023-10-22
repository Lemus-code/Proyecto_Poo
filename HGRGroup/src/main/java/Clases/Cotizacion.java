package Clases;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author uriel
 */
public class Cotizacion {
    private String descripcion;
    private List<Modificaciones> nombreCostos;
    private List<Modificaciones> costosModi;
    private LocalDate fechaCreacion;
    private float costoTotal;
    private int numeroCasa;
    private float costoCasa;
    private List<Modificaciones> costosAdicionales;

    public Cotizacion() {
    }

    public Cotizacion(String descripcion, List<Modificaciones> nombreCostos, List<Modificaciones> costosModi, LocalDate fechaCreacion, float costoTotal, int numeroCasa, float costoCasa, List<Modificaciones> costosAdicionales) {
        this.descripcion = descripcion;
        this.nombreCostos = nombreCostos;
        this.costosModi = costosModi;
        this.fechaCreacion = fechaCreacion;
        this.costoTotal = costoTotal;
        this.numeroCasa = numeroCasa;
        this.costoCasa = costoCasa;
        this.costosAdicionales = costosAdicionales;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Modificaciones> getNombreCostos() {
        return nombreCostos;
    }

    public List<Modificaciones> getCostosModi() {
        return costosModi;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public float getCostoTotal() {
        return costoTotal;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public float getCostoCasa() {
        return costoCasa;
    }

    public List<Modificaciones> getCostosAdicionales() {
        return costosAdicionales;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombreCostos(List<Modificaciones> nombreCostos) {
        this.nombreCostos = nombreCostos;
    }

    public void setCostosModi(List<Modificaciones> costosModi) {
        this.costosModi = costosModi;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setCostoTotal(float costoTotal) {
        this.costoTotal = costoTotal;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public void setCostoCasa(float costoCasa) {
        this.costoCasa = costoCasa;
    }

    public void setCostosAdicionales(List<Modificaciones> costosAdicionales) {
        this.costosAdicionales = costosAdicionales;
    }
    
    
    
}
