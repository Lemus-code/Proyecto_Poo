
package Clases;

import com.toedter.calendar.JDateChooser;

public class Calendario {
    private String evento;
    private JDateChooser fechaEntrega;
    private JDateChooser fechaInicio;
    private String cliente;

    public Calendario() {
    }

    public Calendario(String evento, JDateChooser fechaEntrega, JDateChooser fechaInicio, String cliente) {
        this.evento = evento;
        this.fechaEntrega = fechaEntrega;
        this.fechaInicio = fechaInicio;
        this.cliente = cliente;
    }

    public String getEvento() {
        return evento;
    }

    public String getCliente() {
        return cliente;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public void setFechaEntrega(JDateChooser fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void setFechaInicio(JDateChooser fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    

    // Resto de los métodos getters y setters

    public JDateChooser getFechaInicio() {
        return fechaInicio;
    }

    public JDateChooser getFechaEntrega() {
        return fechaEntrega;
    }
}
