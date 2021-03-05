/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_.kevinrodriguez;

import java.util.ArrayList;

/**
 *
 * @author Kevin
 */
public class clientes {
   public String nombre,apellido,nacionalidad,lugartraba,puesto,usuario,contra;
   public int id, dineroactual;
   ArrayList <autos> lista= new ArrayList();

    public clientes(int id, String nombre, String apellido, String nacionalidad, String lugartraba, String puesto, String usuario, String contra, int dineroactual) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.lugartraba = lugartraba;
        this.puesto = puesto;
        this.usuario = usuario;
        this.contra = contra;
        this.dineroactual = dineroactual;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getLugartraba() {
        return lugartraba;
    }

    public void setLugartraba(String lugartraba) {
        this.lugartraba = lugartraba;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getDineroactual() {
        return dineroactual;
    }

    public void setDineroactual(int dineroactual) {
        this.dineroactual = dineroactual;
    }

    public ArrayList<autos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<autos> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return  "nombre=" + nombre;
    }
   
   
    
}
