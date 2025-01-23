package org.example.dao;

import org.example.entities.Evento;
import org.example.entities.Partecipazione;

import javax.persistence.EntityManager;

public class PartecipazioneDAO {
    private EntityManager em;

    public PartecipazioneDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Partecipazione e) {
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
    }

    public Partecipazione getByID(long id) {
        return em.find(Partecipazione.class, id);
    }

    public void delete(Partecipazione e) {
        em.getTransaction().begin();
        em.remove(e);
        em.getTransaction().commit();
    }
}