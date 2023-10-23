package Clases;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
    private List<String> descrip;
    private String estado;
    private String codigo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double costoAdicional;
 
    public Modificaciones(String nombreModi, List<String> descrip, String estado, String codigo, LocalDate fechaInicio, LocalDate fechaFin, double costoAdicional) {
        this.nombreModi = nombreModi;
        this.descrip = descrip;
        this.estado = estado;
        this.codigo = codigo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoAdicional = costoAdicional;
    }

    public Modificaciones() {
        this.nombreModi = "";
        this.descrip = new ArrayList<>();
        this.estado = "";
        this.codigo = "";
        this.fechaInicio = LocalDate.of(0, 0, 0);
        this.fechaFin = LocalDate.of(0, 0, 0);;
        this.costoAdicional = 0.0F;
        
    }

    public String getNombreModi() {
        return nombreModi;
    }

    public List<String> getDescrip() {
        return descrip;
    }

    public String getEstado() {
        return estado;
    }

    public String getNumCasa() {
        return codigo;
    }

    public String getFechaInicio() {
        //Establecemos formato de retorno
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // Formatear la fecha según el formato personalizado
        String fechaFormateada = fechaInicio.format(formatter);
        return fechaFormateada;
    }

    public String getFechaFin() {
        //Establecemos formato de retorno
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // Formatear la fecha según el formato personalizado
        String fechaFormateada = fechaFin.format(formatter);
        return fechaFormateada;
    }
    
    public double getCostoAdicional(){
        return costoAdicional;
    };



    public void setNombreModi(String nombreModi) {
        this.nombreModi = nombreModi;
    }

    public void setDescrip(List<String>descrip) {
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

    public void setCostoAdicional(double costoAdicional) {
        this.costoAdicional = costoAdicional;
    }


    


    
    
    
    
}
