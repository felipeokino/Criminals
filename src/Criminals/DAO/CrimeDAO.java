package Criminals.DAO;

import Criminals.Model.Crime;
import Criminals.Util.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CrimeDAO {
    public void inserir(Crime crime) {
        Connection conn = null;
        PreparedStatement ps = null;

        if(crime == null)
            throw new
                    RuntimeException("O crime não pode" +
                    " ser nulo!");
        try {
            conn = ConnectionFactory.getConnection();
            String sql = "INSERT INTO Crime " +
                    "(id, description, date) " +
                    "VALUES (?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, Math.toIntExact(crime.getId()));
            ps.setString(2, crime.getDescription());
            ps.setDate(3, (Date) crime.getDate());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionFactory.close(conn);
        }
    }

    public List<Crime> getCrimes() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM CRIMES";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            List<Crime> crimes =
                    new ArrayList<Crime>();
            while(rs.next()) {
                Crime crime = new Crime();
                crime.setId(rs.getInt(1));
                crime.setDescription(rs.getString(2));
                crime.setDate(rs.getDate(3));
                crimes.add(crime);
            }
            return crimes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionFactory.close(conn);
        }
    }

}
