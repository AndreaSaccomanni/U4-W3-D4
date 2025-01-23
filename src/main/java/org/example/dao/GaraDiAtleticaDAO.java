package org.example.dao;

import org.example.entities.GaraDiAtletica;
import org.example.entities.PartitaDiCalcio;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class GaraDiAtleticaDAO {
    private EntityManager em;

    public GaraDiAtleticaDAO(EntityManager em) {
        this.em = em;
    }

    public void save(GaraDiAtletica garaDiAtletica) {
        try {
            EntityTransaction t = em.getTransaction();
            t.begin();
            em.persist(garaDiAtletica);
            t.commit();
            System.out.println(garaDiAtletica);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
