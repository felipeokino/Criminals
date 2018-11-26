package Criminals.DAO;

import Criminals.Model.Crime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class CrimeDAO {
    public void inserir(Crime crime) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("criminal");
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(crime);
        manager.getTransaction().commit();
    }

    public List<Crime> getCrimes() {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("criminal");
        EntityManager manager =
                factory.createEntityManager();
        Query query = manager.createQuery("select a from Crime a");
        List<Crime> crimes = query.getResultList();
        factory.close();
        return crimes;
    }

}
