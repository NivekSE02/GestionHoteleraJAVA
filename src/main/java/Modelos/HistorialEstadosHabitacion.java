/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author nivek
 */
public class HistorialEstadosHabitacion {
    private int historial_id;
    private int habitacion_id;
    private int empleado_id;
    private String estado_anterior;
    private String estado_nuevo;
    private String fecha_cambio;
    private String motivo;

    public int getHistorial_id() {
        return historial_id;
    }

    public void setHistorial_id(int historial_id) {
        this.historial_id = historial_id;
    }

    public int getHabitacion_id() {
        return habitacion_id;
    }

    public void setHabitacion_id(int habitacion_id) {
        this.habitacion_id = habitacion_id;
    }

    public int getEmpleado_id() {
        return empleado_id;
    }

    public void setEmpleado_id(int empleado_id) {
        this.empleado_id = empleado_id;
    }

    public String getEstado_anterior() {
        return estado_anterior;
    }

    public void setEstado_anterior(String estado_anterior) {
        this.estado_anterior = estado_anterior;
    }

    public String getEstado_nuevo() {
        return estado_nuevo;
    }

    public void setEstado_nuevo(String estado_nuevo) {
        this.estado_nuevo = estado_nuevo;
    }

    public String getFecha_cambio() {
        return fecha_cambio;
    }

    public void setFecha_cambio(String fecha_cambio) {
        this.fecha_cambio = fecha_cambio;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}