package org.example.dao;

import org.example.entities.Concerto;
import org.example.entities.PartitaDiCalcio;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
@Entity
public class ConcertoDAO {
    private EntityManager em;

    public ConcertoDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Concerto concerto) {
        try {
            EntityTransaction t = em.getTransaction();
            t.begin();
            em.persist(concerto);
            t.commit();
            System.out.println(concerto);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
