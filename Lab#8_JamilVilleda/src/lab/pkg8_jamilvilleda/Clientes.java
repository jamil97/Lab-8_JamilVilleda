/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8_jamilvilleda;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Clientes {
    
    private String nombre;
    private String cuenta;
    private String contra;
    private ArrayList <Productos> productos = new ArrayList();
    private String id;
    private double saldoDisponible;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Productos> productos) {
        this.productos = productos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public String toString() {
        return "Clientes{" + "nombre=" + nombre + ", cuenta=" + cuenta + ", contra=" + contra + ", productos=" + productos + ", id=" + id + ", saldoDisponible=" + saldoDisponible + '}';
    }
    
    
    
    
}
