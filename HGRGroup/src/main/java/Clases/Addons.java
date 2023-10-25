/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Diego Lemus
 */
public class Addons extends Modificaciones{
    public Addons (String nombreAddon, List<String> descrip, String estado, LocalDate fechaInicio, LocalDate fechaFin, double costoAdicional) {
        super(nombreAddon, descrip, estado, fechaInicio, fechaFin, costoAdicional);
    };
}
