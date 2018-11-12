package Criminals.DAO;

import Criminals.Model.Neighborhood;
import Criminals.Util.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class NeighborhoodDAO {
    public void inserir(Neighborhood neigh) {
        Connection conn = null;
        PreparedStatement ps = null;

        if(neigh == null)
            throw new
                    RuntimeException("O bairro não pode" +
                    " ser nulo!");
        try {
            conn = ConnectionFactory.getConnection();
            String sql = "INSERT INTO NEIGHBORHOOD " +
                    "(ID, NAME, CITY) " +
                    "VALUES (?, ?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, Math.toIntExact(neigh.getId()));
            ps.setString(2, neigh.getName());
            ps.setString(3, neigh.getCity());
            ps.setArray(4, (Array) neigh.getList_crime());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionFactory.close(conn);
        }
    }

    public List<Neighborhood> getProdutos() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM NEIGHBORHOOD";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            List<Neighborhood> neighborhoods =
                    new ArrayList<Neighborhood>();
            while(rs.next()) {
                Neighborhood neigh = new Neighborhood();
                neigh.setId(rs.getInt(1));
                neigh.setName(rs.getString(2));
                neigh.setCity(rs.getString(3));
                neighborhoods.add(neigh);
            }
            return neighborhoods;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionFactory.close(conn);
        }
    }

}
