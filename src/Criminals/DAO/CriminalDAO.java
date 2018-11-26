package Criminals.DAO;

import Criminals.Model.Criminal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class CriminalDAO {
    public void inserir(Criminal criminal) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("criminal");
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(criminal);
        manager.getTransaction().commit();
    }

    public List<Criminal> getCriminals() {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("criminal");
        EntityManager manager =
                factory.createEntityManager();
        Query query = manager.createQuery("select a from Criminal a");
        List<Criminal> criminals = query.getResultList();
        factory.close();
        return criminals;
    }
}
