package org.example.dao;


import org.example.entities.PartitaDiCalcio;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PartitaDiCalcioDAO {
    private  EntityManager em;

    public PartitaDiCalcioDAO(EntityManager em) {
        this.em = em;
    }

    public  void save(PartitaDiCalcio partitaDiCalcio) {
        try {
            EntityTransaction t = em.getTransaction();
            t.begin();
            em.persist(partitaDiCalcio);
            t.commit();
            System.out.println(partitaDiCalcio);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


