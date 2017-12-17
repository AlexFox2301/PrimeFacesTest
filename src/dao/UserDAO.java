package dao;

import tables.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class UserDAO {
    @PersistenceContext
    EntityManager em;

    //unchecked/
    public List<User> findAll(){
        return em.createQuery("select u from User u").getResultList();
    }
}
