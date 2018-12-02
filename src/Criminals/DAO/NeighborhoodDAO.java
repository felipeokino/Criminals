package Criminals.DAO;

import Criminals.Model.Neighborhood;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
public class NeighborhoodDAO {
    public void inserir(Neighborhood neighborhood) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("criminal");
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(neighborhood);
        manager.getTransaction().commit();
    }

    public List<Neighborhood> getNeighs() {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("criminal");
        EntityManager manager =
                factory.createEntityManager();
        Query query = manager.createQuery("select a from Neighborhood a");
        List<Neighborhood> neighborhoods = query.getResultList();
        factory.close();
        return neighborhoods;
    }

    public Neighborhood getNeighById(long id) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("criminal");
        EntityManager manager =
                factory.createEntityManager();
        Query query = manager.createQuery("select a from Neighborhood a where id=:id");
        query.setParameter("id", id);
        Neighborhood neighborhood = (Neighborhood) query.getSingleResult();
        factory.close();
        return neighborhood;
    }
}
