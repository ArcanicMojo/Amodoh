/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Pierre
 */
@Stateless
public class HelloDAO implements HelloDAOLocal {
    @PersistenceContext(unitName="Hello-ejbpu")
    private EntityManager em;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Override
    public void save(HelloEntity h) {
        h = em.merge(h);
        em.persist(h);
    }

    @Override
    public void update(HelloEntity h) {
        em.merge(h);
    }

    @Override
    public void remove(HelloEntity h) {
        h = em.merge(h);
        em.remove(h);
    }

    @Override
    public List<HelloEntity> findAll() {
        Query q = em.createQuery("SELECT h FROM HelloENtity");
        return q.getResultList();
    }
}
