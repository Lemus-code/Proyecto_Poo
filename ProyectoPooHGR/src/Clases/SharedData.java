/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.List;

/**
 *
 * @author Diego Lemus
 */
public class SharedData {
    private List<Usuarios> usuarios;
    private List<Departamentos> departamentos;

    //Constructores
    
    public SharedData() {
    }

    public SharedData(List<Usuarios> usuarios, List<Departamentos> departamentos) {
        this.usuarios = usuarios;
        this.departamentos = departamentos;
    }
    
    //Getters
    public List<Usuarios> getUsuarios() {
        return usuarios;
    }

    public List<Departamentos> getDepartamentos() {
        return departamentos;
    }
    
    //Setters
    public void setUsuarios(List<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }

    public void setDepartamentos(List<Departamentos> departamentos) {
        this.departamentos = departamentos;
    }
    
    //Métodos
    public void agregarUsuarios(Usuarios user){
        usuarios.add(user);
    };
    
    public void agregarDepartamento(Departamentos depa){
        departamentos.add(depa);
    };
    
    
}
