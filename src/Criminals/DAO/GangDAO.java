package Criminals.DAO;

import Criminals.Model.Gang;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class GangDAO {
    public void inserir(Gang gang) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("criminal");
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(gang);
        manager.getTransaction().commit();
    }

    public List<Gang> getGangs() {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("criminal");
        EntityManager manager =
                factory.createEntityManager();
        Query query = manager.createQuery("select a from Gang a");
        List<Gang> gangs = query.getResultList();
        factory.close();
        return gangs;
    }

    public Gang getGangById(Long id) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("criminal");
        EntityManager manager =
                factory.createEntityManager();
        Query query = manager.createQuery("select a from Gang a where id=:id");
        query.setParameter("id", id);
        Gang gang = (Gang) query.getSingleResult();
        factory.close();
        return gang;
    }
}
