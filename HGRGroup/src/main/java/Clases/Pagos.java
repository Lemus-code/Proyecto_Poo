package Clases;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author uriel
 */
public class Pagos {
    private String identificador;
    private double cantidad;
    private LocalDate fechaPago;
    private String estadoPago;
    private String cliente;
    private String metodoPago;

    public Pagos() {
    }

    public Pagos(String identi, double cantidad, LocalDate fechaPago, String estadoPago, String cliente, String metodoPago) {
        this.identificador = identi;
        this.cantidad = cantidad;
        this.fechaPago = fechaPago;
        this.estadoPago = estadoPago;
        this.cliente = cliente;
        this.metodoPago = metodoPago;
    }

    public String getIdentificador(){
        return identificador;
    };
    public double getCantidad() {
        return cantidad;
    }

    public String getFechaPago() {
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // Formatear la fecha según el formato personalizado
        String fechaFormateada = fechaPago.format(formatter);
        return fechaFormateada;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public String getCliente() {
        return cliente;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setIdentificador(String identi){
        this.identificador = identi;
    };
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setFechaPago(String fechaPago) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false); // Desactiva el modo flexible para el análisis de fechas
        Date fechaEntrega = dateFormat.parse(fechaPago);
        LocalDate dateInicio = fechaEntrega.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        this.fechaPago = dateInicio;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    
    
}
