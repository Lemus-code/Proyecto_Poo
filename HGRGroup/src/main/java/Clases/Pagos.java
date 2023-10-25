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
public class Pagos {
    private int cantidad;
    private LocalDate fechaPago;
    private String estadoPago;
    private String cliente;
    private String metodoPago;

    public Pagos() {
    }

    public Pagos(int cantidad, LocalDate fechaPago, String estadoPago, String cliente, String metodoPago) {
        this.cantidad = cantidad;
        this.fechaPago = fechaPago;
        this.estadoPago = estadoPago;
        this.cliente = cliente;
        this.metodoPago = metodoPago;
    }

    public int getCantidad() {
        return cantidad;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
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

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
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
