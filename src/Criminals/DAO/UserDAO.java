package Criminals.DAO;

import Criminals.Model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class UserDAO {

    public User login(String login, String password){
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("criminal");
        EntityManager manager =
                factory.createEntityManager();
        Query query = manager.createQuery("select u from User u where u.login = :login and u.password = :password");
        query.setParameter("login", login);
        query.setParameter("password", password);
        User user = (User) query.getSingleResult();
        return user;
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
        List<User> users = query.getResultList();
        factory.close();
        return users;
    }

}
