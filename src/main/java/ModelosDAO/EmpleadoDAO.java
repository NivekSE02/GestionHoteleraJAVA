/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelosDAO;

import Conexion.CN;
import Modelos.Empleado;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nivek
 */
public class EmpleadoDAO {

    private CN cn;
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    public EmpleadoDAO() {
        this.cn = new CN();
    }

    public List<Empleado> listar() {
        ArrayList<Empleado> lista = new ArrayList<>();
        String sql = "SELECT * FROM EMPLEADOS";

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Empleado e = new Empleado();
                e.setEmpleado_id(rs.getInt("empleado_id"));
                e.setRol_id(rs.getInt("rol_id"));
                e.setNombres(rs.getString("nombres"));
                e.setApellidos(rs.getString("apellidos"));
                e.setDni(rs.getString("dni"));
                e.setTelefono(rs.getString("telefono"));
                e.setEmail(rs.getString("email"));
                e.setFecha_contratacion(rs.getString("fecha_contratacion"));
                e.setActivo(rs.getBoolean("activo"));
                e.setTurno(rs.getString("turno"));

                lista.add(e);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

    public boolean insertar(Empleado e) {
        String sql = "INSERT INTO EMPLEADOS (rol_id, nombres, apellidos, dni, telefono, email, fecha_contratacion, activo, turno) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);

            ps.setInt(1, e.getRol_id());
            ps.setString(2, e.getNombres());
            ps.setString(3, e.getApellidos());
            ps.setString(4, e.getDni());
            ps.setString(5, e.getTelefono());
            ps.setString(6, e.getEmail());
            ps.setString(7, e.getFecha_contratacion());
            ps.setBoolean(8, e.isActivo());
            ps.setString(9, e.getTurno());

            ps.executeUpdate();
            return true;

        } catch (Exception ex) {
            return false;
        }
    }

    public boolean actualizar(Empleado e) {
        String sql = "UPDATE EMPLEADOS SET rol_id=?, nombres=?, apellidos=?, dni=?, telefono=?, email=?, fecha_contratacion=?, activo=?, turno=? WHERE empleado_id=?";

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);

            ps.setInt(1, e.getRol_id());
            ps.setString(2, e.getNombres());
            ps.setString(3, e.getApellidos());
            ps.setString(4, e.getDni());
            ps.setString(5, e.getTelefono());
            ps.setString(6, e.getEmail());
            ps.setString(7, e.getFecha_contratacion());
            ps.setBoolean(8, e.isActivo());
            ps.setString(9, e.getTurno());
            ps.setInt(10, e.getEmpleado_id());

            ps.executeUpdate();
            return true;

        } catch (Exception ex) {
            return false;
        }
    }

    public boolean eliminar(int id) {
        String sql = "DELETE FROM EMPLEADOS WHERE empleado_id=?";

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();
            return true;

        } catch (Exception ex) {
            return false;
        }
    }
}