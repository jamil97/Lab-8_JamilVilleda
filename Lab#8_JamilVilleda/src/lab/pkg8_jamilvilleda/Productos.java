/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8_jamilvilleda;

import java.sql.Date;

/**
 *
 * @author usuario
 */
public class Productos {
    private String nombre;
    private int cantidad;
    private int precio;
    private Date fecha;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + ", fecha=" + fecha + '}';
    }
    
    
    
    
    
}
