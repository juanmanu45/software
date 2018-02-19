package DAO;

import Conexion.DbUtil;
import VO.Persona;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 */
public class ServicioPersona {

    private Connection connection;

    public ServicioPersona() {
        connection = DbUtil.getConnection();
    }

    public void agregarPersona(Persona SP) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into Persona(id,nombre,correo,carrera,telefono,usuario,contrasena) values (?,?,?,?,?,?,? )");
            // Parameters start with 1
            preparedStatement.setInt(1, SP.getId());
            preparedStatement.setString(2, SP.getNombre());
            preparedStatement.setString(3, SP.getCorreo());
            preparedStatement.setString(4, SP.getCarrera());
            preparedStatement.setInt(5, SP.getTelefono());
            preparedStatement.setString(6, SP.getUsuario());
            preparedStatement.setString(7, SP.getContrasena());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Persona> listarP() {
        ArrayList<Persona> persona = new ArrayList<Persona>();
        try {
            System.out.println("LLegue hasta aca");
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select * from Persona");
            while (rs.next()) {
                Persona P = new Persona();

                P.setId(rs.getInt("id"));
                P.setNombre(rs.getString("nombre"));
                P.setCorreo(rs.getString("correo"));
                P.setCarrera(rs.getString("carrera"));
                P.setTelefono(rs.getInt("telefono"));
                P.setUsuario(rs.getString("usuario"));
                P.setContrasena(rs.getString("contrasena"));

                

                persona.add(P);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return persona;
    }

}
