package Clases;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Date;

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
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double costoAdicional;
 
    public Modificaciones(String nombreModi, List<String> descrip, String estado, LocalDate fechaInicio, LocalDate fechaFin, double costoAdicional) {
        this.nombreModi = nombreModi;
        this.descrip = descrip;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoAdicional = costoAdicional;
    }

    public Modificaciones() {
        this.nombreModi = "";
        this.descrip = new ArrayList<>();
        this.estado = "";
        this.fechaInicio = LocalDate.of(0, 0, 0);
        this.fechaFin = LocalDate.of(0, 0, 0);;
        this.costoAdicional = 0.0F;
        
    }

    public String getNombreModi() {
        return nombreModi;
    }

    public String getDescrip() {
        String descripcionesConcatenadas = String.join("", descrip);
        return descripcionesConcatenadas;
    }

    public String getEstado() {
        return estado;
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

    public void setFechaInicio(String fechaInicio) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false); // Desactiva el modo flexible para el análisis de fechas
        Date fechaEntrega = dateFormat.parse(fechaInicio);
        LocalDate dateInicio = fechaEntrega.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        this.fechaInicio = dateInicio;
    }

    public void setFechaFin(String fechaFin)throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false); // Desactiva el modo flexible para el análisis de fechas
        Date fechaEntrega = dateFormat.parse(fechaFin);
        LocalDate dateFin = fechaEntrega.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        this.fechaFin = dateFin;
    }

    public void setCostoAdicional(double costoAdicional) {
        this.costoAdicional = costoAdicional;
    }


    


    
    
    
    
}
