
package Clases;

import java.time.LocalDate;


public class Calendario {
    
    private String evento;
    private LocalDate fechaEntrega;

    public Calendario() {
    }

    public Calendario(String evento, LocalDate fechaEntrega) {
        this.evento = evento;
        this.fechaEntrega = fechaEntrega;
    }
    
    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
   
    
}
