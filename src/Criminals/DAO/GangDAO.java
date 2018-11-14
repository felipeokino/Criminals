package Criminals.DAO;

import Criminals.Model.Criminal;
import Criminals.Model.Gang;
import Criminals.Util.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GangDAO {
    public void inserir(Gang gang) {
        Connection conn = null;
        PreparedStatement ps = null;

        if(gang == null)
            throw new
                    RuntimeException("A quadrilha não pode" +
                    " ser nulo!");
        try {
            conn = ConnectionFactory.getConnection();
            String sql = "INSERT INTO gang " +
                    "(id, name, criminals) " +
                    "VALUES (?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, Math.toIntExact(gang.getId()));
            ps.setString(2, gang.getName());
            ps.setArray(3, (Array) gang.getCriminals());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionFactory.close(conn);
        }
    }

    public List<Gang> getGang() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM GANG";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            List<Gang> gangs =
                    new ArrayList<Gang>();
            while(rs.next()) {
                Gang gang = new Gang();
                gang.setId(rs.getInt(1));
                gang.setName(rs.getString(2));
                gang.setCriminals((List<Criminal>) rs.getArray(3));
                gangs.add(gang);
            }
            return gangs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionFactory.close(conn);
        }
    }

}
