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
public class Clientes {
    private String nombreCliente;
    private String email;
    private int numTelefono;
    private Casas casasAsociada;
    private List<Pagos> pagosRealizados;
    private double saldoPendiente;
    private double pagoTotal;

    public Clientes(String nombreCliente, String email, int numTelefono, Casas casasAsociada, List<Pagos> pagosRealizados, double saldoPendiente, double pagoTotal) {
        this.nombreCliente = nombreCliente;
        this.email = email;
        this.numTelefono = numTelefono;
        this.casasAsociada = casasAsociada;
        this.pagosRealizados = pagosRealizados;
        this.saldoPendiente = saldoPendiente;
        this.pagoTotal = pagoTotal;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getEmail() {
        return email;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public Casas getCasasAsocionadas() {
        return casasAsociada;
    }

    public List<Pagos> getPagosRealizados() {
        return pagosRealizados;
    }
    
    public double getSaldoPendiente(){
        return saldoPendiente;
    };
    public double getPagoTotal() {
        return pagoTotal;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }

    public void setCasasAsocionadas(Casas casasAsocionadas) {
        this.casasAsociada = casasAsocionadas;
    }

    public void setPagosRealizados(List<Pagos> pagosRealizados) {
        this.pagosRealizados = pagosRealizados ;
    }

    public void setSaldoPendiente(double saldoPendiente){
        this.saldoPendiente = saldoPendiente;
    }
    
    public void setPagoTotal(double pagoTotal) {
        this.pagoTotal = pagoTotal;
    }
    
    public String mostarDatos(){
        String info = "";
        return info;
    }
    
    
    
}
