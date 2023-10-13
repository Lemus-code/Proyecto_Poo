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
public class ReporteConstrucciones {
    private String descripcion;
    private int numCasa;
    private List<Modificaciones> modificaciones;
    private String faseConstruccion;
    private String estadoActual;

    public ReporteConstrucciones() {
    }

    public ReporteConstrucciones(String descripcion, int numCasa, List<Modificaciones> modificaciones, String faseConstruccion, String estadoActual) {
        this.descripcion = descripcion;
        this.numCasa = numCasa;
        this.modificaciones = modificaciones;
        this.faseConstruccion = faseConstruccion;
        this.estadoActual = estadoActual;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumCasa() {
        return numCasa;
    }

    public List<Modificaciones> getModificaciones() {
        return modificaciones;
    }

    public String getFaseConstruccion() {
        return faseConstruccion;
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNumCasa(int numCasa) {
        this.numCasa = numCasa;
    }

    public void setModificaciones(List<Modificaciones> modificaciones) {
        this.modificaciones = modificaciones;
    }

    public void setFaseConstruccion(String faseConstruccion) {
        this.faseConstruccion = faseConstruccion;
    }

    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }
    
    
    
}
