package org.example.dao;

import org.example.entities.Evento;
import org.example.entities.Location;

import javax.persistence.EntityManager;

public class LocationDAO {

    private EntityManager em;

    public LocationDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Location e) {
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
    }

    public Location getByID(long id) {
        return em.find(Location.class, id);
    }

    public void delete(Location e) {
        em.getTransaction().begin();
        em.remove(e);
        em.getTransaction().commit();
    }
}