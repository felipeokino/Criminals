package Criminals.Repositorio;


import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import Criminals.Model.User;

public class UserRepos {
    private EntityManager manager;

    public UserRepos(EntityManager manager) {
        this.manager = manager;
    }

    public void adiciona(User user) {
        manager.persist(user);
    }

    public boolean verifica(User user) {
        String consulta = "select u from User u" +
                " where u.login = ?1 and u.password = ?2";
        Query query = manager.createQuery(consulta);
        query.setParameter(1, user.getLogin());
        query.setParameter(2, user.getPassword());
        try {
            query.getSingleResult();
            return true;
        } catch (NoResultException e) {
            return false;
        }
    }
}
