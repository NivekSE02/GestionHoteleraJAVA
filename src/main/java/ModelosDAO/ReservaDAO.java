/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelosDAO;

import Conexion.CN;
import Modelos.Reserva;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nivek
 */
public class ReservaDAO {

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;


    public List<Reserva> listar() {
        ArrayList<Reserva> lista = new ArrayList<>();
        String sql = "SELECT * FROM RESERVAS";

        try {
            con = CN.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Reserva r = new Reserva();

                r.setReserva_id(rs.getInt("reserva_id"));
                r.setHuesped_id(rs.getInt("huesped_id"));
                r.setEmpleado_id(rs.getInt("empleado_id"));
                r.setHabitacion_id(rs.getInt("habitacion_id"));
                r.setFecha_entrada(rs.getString("fecha_entrada"));
                r.setFecha_salida(rs.getString("fecha_salida"));
                r.setPrecio_total(rs.getDouble("precio_total"));
                r.setEstado(rs.getString("estado"));
                r.setFecha_reserva(rs.getString("fecha_reserva"));
                r.setNumero_adultos(rs.getInt("numero_adultos"));
                r.setNumero_ninos(rs.getInt("numero_ninos"));
                r.setObservaciones(rs.getString("observaciones"));

                lista.add(r);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }


    public boolean insertar(Reserva r) {

        String sql = """
    INSERT INTO RESERVAS 
    (huesped_id, empleado_id, habitacion_id, fecha_entrada, fecha_salida, precio_total, estado, numero_adultos, numero_ninos, observaciones)
    VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
""";

        try {
            con = CN.getConexion();
            ps = con.prepareStatement(sql);

                ps.setInt(1, r.getHuesped_id());
ps.setInt(2, r.getEmpleado_id());
ps.setInt(3, r.getHabitacion_id());
ps.setString(4, r.getFecha_entrada());
ps.setString(5, r.getFecha_salida());
ps.setDouble(6, r.getPrecio_total());
ps.setString(7, r.getEstado());
ps.setInt(8, r.getNumero_adultos());
ps.setInt(9, r.getNumero_ninos());
ps.setString(10, r.getObservaciones());

            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Reserva buscar(int id) {
        Reserva r = null;
        String sql = "SELECT * FROM RESERVAS WHERE reserva_id = ?";

        try {
            con = CN.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                r = new Reserva();

                r.setReserva_id(rs.getInt("reserva_id"));
                r.setHuesped_id(rs.getInt("huesped_id"));
                r.setEmpleado_id(rs.getInt("empleado_id"));
                r.setHabitacion_id(rs.getInt("habitacion_id"));
                r.setFecha_entrada(rs.getString("fecha_entrada"));
                r.setFecha_salida(rs.getString("fecha_salida"));
                r.setPrecio_total(rs.getDouble("precio_total"));
                r.setEstado(rs.getString("estado"));
                r.setFecha_reserva(rs.getString("fecha_reserva"));
                r.setNumero_adultos(rs.getInt("numero_adultos"));
                r.setNumero_ninos(rs.getInt("numero_ninos"));
                r.setObservaciones(rs.getString("observaciones"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return r;
    }

    public boolean actualizar(Reserva r) {

        String sql = """
            UPDATE RESERVAS SET
                huesped_id=?,
                empleado_id=?,
                habitacion_id=?,
                fecha_entrada=?,
                fecha_salida=?,
                precio_total=?,
                estado=?,
                fecha_reserva=?,
                numero_adultos=?,
                numero_ninos=?,
                observaciones=?
            WHERE reserva_id=?
        """;

        try {
            con = CN.getConexion();
            ps = con.prepareStatement(sql);

            ps.setInt(1, r.getHuesped_id());
            ps.setInt(2, r.getEmpleado_id());
            ps.setInt(3, r.getHabitacion_id());
            ps.setString(4, r.getFecha_entrada());
            ps.setString(5, r.getFecha_salida());
            ps.setDouble(6, r.getPrecio_total());
            ps.setString(7, r.getEstado());
            ps.setString(8, r.getFecha_reserva());
            ps.setInt(9, r.getNumero_adultos());
            ps.setInt(10, r.getNumero_ninos());
            ps.setString(11, r.getObservaciones());
            ps.setInt(12, r.getReserva_id());

            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    public boolean eliminar(int id) {

        String sql = "DELETE FROM RESERVAS WHERE reserva_id=?";

        try {
            con = CN.getConexion();
            ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
