package Criminals.DAO;

import Criminals.Model.User;
import Criminals.Util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    public boolean verifica(User user){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            conn = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM USUARIO WHERE LOGIN =? AND SENHA=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getLogin());
            ps.setString(2, user.getPassword());
            rs = ps.executeQuery();
            if(rs.next()) {
                return true;
            }
            return false;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionFactory.close(conn);
        }

    }

    public void inserir(User user) {
        Connection conn = null;
        PreparedStatement ps = null;

        if (user == null)
            throw new RuntimeException("O usuario nao pode ser nulo");

        try {
            conn = ConnectionFactory.getConnection();
            String sql = "INSERT INTO USER " + "(ID, CPF, NAME, BIRTH, OFFICE) " + "VALUES (?,?, ?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, (int) user.getId());
            ps.setString(2, user.getCpf());
            ps.setString(3, user.getName());
            ps.setString(4, user.getBirth());
            ps.setString(5, user.getOffice());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> getUser() {
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
                user.setBirth(rs.getString(4));
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
