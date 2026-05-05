/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author nivek
 */
public class Reserva {
    private int reserva_id;
    private int huesped_id;
    private int empleado_id;
    private int habitacion_id;
    private String fecha_entrada;
    private String fecha_salida;
    private double precio_total;
    private String estado;
    private String fecha_reserva;
    private int numero_adultos;
    private int numero_ninos;
    private String observaciones;

    public int getReserva_id() {
        return reserva_id;
    }

    public void setReserva_id(int reserva_id) {
        this.reserva_id = reserva_id;
    }

    public int getHuesped_id() {
        return huesped_id;
    }

    public void setHuesped_id(int huesped_id) {
        this.huesped_id = huesped_id;
    }

    public int getEmpleado_id() {
        return empleado_id;
    }

    public void setEmpleado_id(int empleado_id) {
        this.empleado_id = empleado_id;
    }

    public int getHabitacion_id() {
        return habitacion_id;
    }

    public void setHabitacion_id(int habitacion_id) {
        this.habitacion_id = habitacion_id;
    }

    public String getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(String fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(String fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    public int getNumero_adultos() {
        return numero_adultos;
    }

    public void setNumero_adultos(int numero_adultos) {
        this.numero_adultos = numero_adultos;
    }

    public int getNumero_ninos() {
        return numero_ninos;
    }

    public void setNumero_ninos(int numero_ninos) {
        this.numero_ninos = numero_ninos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

   
}
