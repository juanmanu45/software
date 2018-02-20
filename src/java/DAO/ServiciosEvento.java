/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.DbUtil;
import VO.Evento;
import VO.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Juan Manuel
 */
public class ServiciosEvento {

    private Connection connection;

    public ServiciosEvento() {
        connection = DbUtil.getConnection();
    }

    public void agregarPersona(Evento SP) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into Evento(id_evento,id_persona,nombre_eve,nombre_eve,dia,hora_ini,hora_fin) values (?,?,?,?,?,?,? )");
            // Parameters start with 1
            preparedStatement.setInt(1, SP.getId_evento());
            preparedStatement.setInt(2, SP.getId_persona());
            preparedStatement.setString(3, SP.getNombre_eve());
            preparedStatement.setString(4, SP.getDia());
            preparedStatement.setInt(5, SP.getHora_ini());
            preparedStatement.setInt(6, SP.getHora_fin());

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
