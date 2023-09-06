/*
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
    private List<Casas> casasAsocionadas;
    private List<Casas> saldoPendiente;
    private float pagoTotal;

    public Clientes() {
        this.nombreCliente = "";
        this.email = "";
        this.numTelefono = 00000000;
        this.casasAsocionadas = new ArrayList<>();
        this.saldoPendiente = new ArrayList<>();
        this.pagoTotal = 0.0F;
    }

    public Clientes(String nombreCliente, String email, int numTelefono, List<Casas> casasAsocionadas, List<Casas> saldoPendiente, float pagoTotal) {
        this.nombreCliente = nombreCliente;
        this.email = email;
        this.numTelefono = numTelefono;
        this.casasAsocionadas = casasAsocionadas;
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

    public List<Casas> getCasasAsocionadas() {
        return casasAsocionadas;
    }

    public List<Casas> getSaldoPendiente() {
        return saldoPendiente;
    }

    public float getPagoTotal() {
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

    public void setCasasAsocionadas(List<Casas> casasAsocionadas) {
        this.casasAsocionadas = casasAsocionadas;
    }

    public void setSaldoPendiente(List<Casas> saldoPendiente) {
        this.saldoPendiente = saldoPendiente;
    }

    public void setPagoTotal(float pagoTotal) {
        this.pagoTotal = pagoTotal;
    }
    
    public String mostarDatos(){
        String info = "";
        return info;
    }
    
    
    
}
