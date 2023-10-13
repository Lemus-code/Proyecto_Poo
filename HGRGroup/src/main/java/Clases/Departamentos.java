package Clases;


import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego Lemus
 */
public class Departamentos {
    private List<Usuarios> usuarios;
    private String nombDepartamento;

    //Constructores
    public Departamentos() {
    }

    public Departamentos(List<Usuarios> usuarios, String nombDepartamento) {
        this.usuarios = usuarios;
        this.nombDepartamento = nombDepartamento;
    }
    
    //Getters
    public List<Usuarios> getUsuarios() {
        return usuarios;
    }

    public String getNombDepartamento() {
        return nombDepartamento;
    }
    
    //Setter
    public void setUsuarios(List<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }

    public void setNombDepartamento(String nombDepartamento) {
        this.nombDepartamento = nombDepartamento;
    }
}

