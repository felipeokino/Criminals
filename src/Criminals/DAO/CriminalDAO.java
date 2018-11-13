package Criminals.DAO;

import Criminals.Model.Criminal;
import Criminals.Util.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CriminalDAO {
    public void inserir(Criminal criminal) {
        Connection conn = null;
        PreparedStatement ps = null;

        if(criminal == null)
            throw new
                    RuntimeException("O criminoso não pode" +
                    " ser nulo!");
        try {
            conn = ConnectionFactory.getConnection();
            String sql = "INSERT INTO CRIMINAL " +
                    "(ID, CPF, FIRSTNAME, LASTNAME, BIRTH) " +
                    "VALUES (?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, Math.toIntExact(criminal.getId()));
            ps.setString(2, criminal.getCpf());
            ps.setString(3, criminal.getFirst_name());
            ps.setString(4, criminal.getLast_name());
            ps.setString(5, criminal.getBirth_date());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionFactory.close(conn);
        }
    }

    public List<Criminal> getCriminals() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM CRIMINAL";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            List<Criminal> criminals =
                    new ArrayList<Criminal>();
            while(rs.next()) {
                Criminal criminal = new Criminal();
                criminal.setId(rs.getInt(1));
                criminal.setFirst_name(rs.getString(2));
                criminal.setLast_name(rs.getString(3));
                criminals.add(criminal);
            }
            return criminals;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionFactory.close(conn);
        }
    }

}
