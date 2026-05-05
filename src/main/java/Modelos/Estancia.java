/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author nivek
 */
public class Estancia {
    private int estancia_id;
    private int reserva_id;
    private int habitacion_id;
    private int empleado_checkin;
    private String fecha_checkin;
    private String hora_checkin;
    private String fecha_checkout;
    private String hora_checkout;
    private double monto_total;
    private String estado;

    public int getEstancia_id() {
        return estancia_id;
    }

    public void setEstancia_id(int estancia_id) {
        this.estancia_id = estancia_id;
    }

    public int getReserva_id() {
        return reserva_id;
    }

    public void setReserva_id(int reserva_id) {
        this.reserva_id = reserva_id;
    }

    public int getHabitacion_id() {
        return habitacion_id;
    }

    public void setHabitacion_id(int habitacion_id) {
        this.habitacion_id = habitacion_id;
    }

    public int getEmpleado_checkin() {
        return empleado_checkin;
    }

    public void setEmpleado_checkin(int empleado_checkin) {
        this.empleado_checkin = empleado_checkin;
    }

    public String getFecha_checkin() {
        return fecha_checkin;
    }

    public void setFecha_checkin(String fecha_checkin) {
        this.fecha_checkin = fecha_checkin;
    }

    public String getHora_checkin() {
        return hora_checkin;
    }

    public void setHora_checkin(String hora_checkin) {
        this.hora_checkin = hora_checkin;
    }

    public String getFecha_checkout() {
        return fecha_checkout;
    }

    public void setFecha_checkout(String fecha_checkout) {
        this.fecha_checkout = fecha_checkout;
    }

    public String getHora_checkout() {
        return hora_checkout;
    }

    public void setHora_checkout(String hora_checkout) {
        this.hora_checkout = hora_checkout;
    }

    public double getMonto_total() {
        return monto_total;
    }

    public void setMonto_total(double monto_total) {
        this.monto_total = monto_total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}