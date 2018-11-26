package Criminals.DAO;

import Criminals.Model.Process;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class ProcessDAO {
    public void inserir(Process process) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("criminal");
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(process);
        manager.getTransaction().commit();
    }

    public List<Process> getProcesses() {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("criminal");
        EntityManager manager =
                factory.createEntityManager();
        Query query = manager.createQuery("select a from Process a");
        List<Process> processes = query.getResultList();
        factory.close();
        return processes;
    }

    public void updateProcess(Process process){
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("criminal");
        EntityManager manager =
                factory.createEntityManager();
        manager.getTransaction().begin();
        manager.merge(process);
        manager.getTransaction().commit();
        factory.close();
    }

}
