
package Clases;

import java.time.LocalDate;

public class Notificacion {
    
    private String mensaje;
    private String tipo;
    private LocalDate fecha;
    private int hora;

    public Notificacion() {
    }

    public Notificacion(String mensaje, String tipo, LocalDate fecha, int hora) {
        this.mensaje = mensaje;
        this.tipo = tipo;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    
    
}
