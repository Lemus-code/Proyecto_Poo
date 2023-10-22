/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego Lemus
 */
public class SharedData {
    private List<Usuarios> usuarios;
    private List<Departamentos> departamentos;
    private List<Casas> casas;
    //Constructores
    
    public SharedData() {
        this.usuarios = new ArrayList <>();
        this.departamentos = new ArrayList <>();    
        this.casas = new ArrayList <>();    
    }

    
    
    //Getters
    public List<Usuarios> getUsuarios() {
        return usuarios;
    }

    public List<Departamentos> getDepartamentos() {
        return departamentos;
    }
    
     public List<Casas> getCasas() {
        return casas;
    }
    
    //Setters
    public void setUsuarios(List<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }

    public void setDepartamentos(List<Departamentos> departamentos) {
        this.departamentos = departamentos;
    }
    
    public void setCasas(List<Casas> casas) {
        this.casas = casas;
    }
    
    //Métodos
    public void agregarUsuarios(Usuarios user){
        usuarios.add(user);
    };
    
    public void agregarDepartamento(Departamentos depa){
        departamentos.add(depa);
    };
    
    public void agregarCasa(Casas casa){
        casas.add(casa);
    };
    public boolean autenticarUsuario(String usuario, String contrasena){
        boolean verificacion = false;
        for(int i = 0; i < usuarios.size(); i++){
            if(usuarios.get(i).getUsuario().equals(usuario) && usuarios.get(i).getContrasena().equals(contrasena)){
                verificacion = true;
                
                //Si encuentra coincidencia lo sacamos del bucle
                i = usuarios.size();
            }else{
                verificacion = false;
            };
        };
        
        return verificacion;
    }; 
};
