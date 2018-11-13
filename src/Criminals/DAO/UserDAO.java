package Criminals.DAO;

import Criminals.Model.User;
import Criminals.Util.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    public void insert(User user) {
        Connection conn = null;
        PreparedStatement ps = null;

        if(user == null)
            throw new
                    RuntimeException("O usuario não pode" +
                    " ser nulo!");
        try {
            conn = ConnectionFactory.getConnection();
            String sql = "INSERT INTO USER " +
                    "(ID, CPF, NAME, BIRTH, OFFICE) " +
                    "VALUES (?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, Math.toIntExact(user.getId()));
            ps.setString(2, user.getCpf());
            ps.setString(3, user.getName());
            ps.setDate(4, (Date) user.getBirth());
            ps.setString(5, user.getOffice());


            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionFactory.close(conn);
        }
    }

    public List<User> getProdutos() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM USER";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            List<User> users =
                    new ArrayList<User>();
            while(rs.next()) {
                User user = new User();
                user.setId(rs.getInt(1));
                user.setCpf(rs.getString(2));
                user.setName(rs.getString(3));
                user.setBirth(rs.getDate(4));
                user.setOffice(rs.getString(2));
                users.add(user);
            }
            return users;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionFactory.close(conn);
        }
    }

}
