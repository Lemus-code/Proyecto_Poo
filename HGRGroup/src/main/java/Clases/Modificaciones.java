package Clases;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author uriel
 */
public class Modificaciones {
    
    private String nombreModi;
    private String descrip;
    private String estado;
    private String codigo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private float costoAdicional;
    private List<String> nombreCosto;
    private List<Float> desgloseCostos;

    public Modificaciones(String nombreModi, String descrip, String estado, String codigo, LocalDate fechaInicio, LocalDate fechaFin, float costoAdicional, List<String> nombreCosto, List<Float> desgloseCostos) {
        this.nombreModi = nombreModi;
        this.descrip = descrip;
        this.estado = estado;
        this.codigo = codigo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoAdicional = costoAdicional;
        this.nombreCosto = nombreCosto;
        this.desgloseCostos = desgloseCostos;
    }

    public Modificaciones() {
        this.nombreModi = "";
        this.descrip = "";
        this.estado = "";
        this.codigo = "";
        this.fechaInicio = LocalDate.of(0, 0, 0);
        this.fechaFin = LocalDate.of(0, 0, 0);;
        this.costoAdicional = 0.0F;
        this.nombreCosto = new ArrayList<>();
        this.desgloseCostos = new ArrayList<>();
        
    }

    public String getNombreModi() {
        return nombreModi;
    }

    public String getDescrip() {
        return descrip;
    }

    public String getEstado() {
        return estado;
    }

    public String getNumCasa() {
        return codigo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public float getCostoAdicional() {
        return costoAdicional;
    }

    public List<String> getNombreCosto() {
        return nombreCosto;
    }

    public List<Float> getDesgloseCostos() {
        return desgloseCostos;
    }

    public void setNombreModi(String nombreModi) {
        this.nombreModi = nombreModi;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNumCasa(String codigo) {
        this.codigo = codigo;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setCostoAdicional(float costoAdicional) {
        this.costoAdicional = costoAdicional;
    }

    public void setNombreCosto(List<String> nombreCosto) {
        this.nombreCosto = nombreCosto;
    }

    public void setDesgloseCostos(List<Float> desgloseCostos) {
        this.desgloseCostos = desgloseCostos;
    }
    
    public float costoAdicional(){
      float costoAd = 0;
      return costoAd;
             
    }
    public String mostarDatos(){
        String info= "";
        return info;
        
    }
    public void desgloseCostos(){
        
    }
    
    
    
    
}
