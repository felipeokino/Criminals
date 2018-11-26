package Criminals.DAO;

import Criminals.Model.User;
import Criminals.Util.ConnectionFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("criminal");
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(user);
        manager.getTransaction().commit();
    }

    public List<User> getUsers() {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("criminal");
        EntityManager manager =
                factory.createEntityManager();
        Query query = manager.createQuery("select a from User a");
        List<User> processes = query.getResultList();
        factory.close();
        return processes;
    }

}
