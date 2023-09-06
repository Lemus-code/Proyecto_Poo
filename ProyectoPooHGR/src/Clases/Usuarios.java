package Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego Lemus
 */
public class Usuarios {
    private String usuario;
    private String contrasena;
    private String nombreUsuario;
    private long dpi;
    private int edad;
    private String cargo;
    private int telefono;
    private String departamento;
    private String email;

    //Constructores
    public Usuarios() {   
        this.usuario = "";
        this.contrasena = "";
        this.nombreUsuario = "";
        this.dpi = 00000000;
        this.edad = 0;
        this.cargo = "";
        this.telefono = 00000000;
        this.departamento = "";
        this.email = "";
    }

    public Usuarios(String usuario, String contrasena, String nombreUsuario, long dpi, int edad, String cargo, int telefono, String departamento, String email) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombreUsuario = nombreUsuario;
        this.dpi = dpi;
        this.edad = edad;
        this.cargo = cargo;
        this.telefono = telefono;
        this.departamento = departamento;
        this.email = email;
    }
    
    //Getters
    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public long getDpi() {
        return dpi;
    }

    public int getEdad() {
        return edad;
    }

    public String getCargo() {
        return cargo;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getEmail() {
        return email;
    }

    //Setters
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setDpi(long dpi) {
        this.dpi = dpi;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setEmail(String email) {
        this.email = email;
    }
};
