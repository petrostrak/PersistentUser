/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author petros_trak
 */
public class UserDaoImpl implements IUserDao {

    private EntityManagerFactory emf;
    private EntityManager em;

    public UserDaoImpl() {
        emf = Persistence.createEntityManagerFactory("PersistentUserPU");
        em = emf.createEntityManager();
    }

    @Override
    public User findById(long id) {
        User user = em.find(User.class, id);
        return user;
    }

    @Override
    public List<User> findAll() {
        return em.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    @Override
    public boolean deleteById(long id) {
        em.getTransaction().begin();
        User user = em.find(User.class, id);
        if (user != null) {
            em.remove(user);
            em.getTransaction().commit();
            return true;
        } else {
            em.getTransaction().commit();
            return false;
        }
    }

    @Override
    public boolean updateAgeById(long id, int age) {
        em.getTransaction().begin();
        User user = em.find(User.class, id);
        if (user != null) {
            user.setAge(age);
            em.getTransaction().commit();
            return true;
        } else {
            em.getTransaction().commit();
            return false;
        }
    }

    @Override
    public boolean updateNameById(long id, String name) {
        em.getTransaction().begin();
        User user = em.find(User.class, id);
        if (user != null) {
            user.setFirst_name(name);
            em.getTransaction().commit();
            return true;
        } else {
            em.getTransaction().commit();
            return false;
        }
    }

    @Override
    public boolean updateSurnameById(long id, String surname) {
        em.getTransaction().begin();
        User user = em.find(User.class, id);
        if (user != null) {
            user.setLast_name(surname);
            em.getTransaction().commit();
            return true;
        } else {
            em.getTransaction().commit();
            return false;
        }
    }

    @Override
    public boolean updateEmailById(long id, String email) {
        em.getTransaction().begin();
        User user = em.find(User.class, id);
        if (user != null) {
            user.setEmail(email);
            em.getTransaction().commit();
            return true;
        } else {
            em.getTransaction().commit();
            return false;
        }
    }
}
