/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author nivek
 */
public class CargoServicio {
    private int cargo_id;
    private int estancia_id;
    private int servicio_id;
    private String fecha_cargo;
    private double monto;
    private int cantidad;
    private String descripcion;

    public int getCargo_id() {
        return cargo_id;
    }

    public void setCargo_id(int cargo_id) {
        this.cargo_id = cargo_id;
    }

    public int getEstancia_id() {
        return estancia_id;
    }

    public void setEstancia_id(int estancia_id) {
        this.estancia_id = estancia_id;
    }

    public int getServicio_id() {
        return servicio_id;
    }

    public void setServicio_id(int servicio_id) {
        this.servicio_id = servicio_id;
    }

    public String getFecha_cargo() {
        return fecha_cargo;
    }

    public void setFecha_cargo(String fecha_cargo) {
        this.fecha_cargo = fecha_cargo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
