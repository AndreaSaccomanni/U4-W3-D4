package org.example;

import com.github.javafaker.Faker;
import org.example.dao.*;
import org.example.entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Random;

public class Main {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("ereditarieta");
    private static EntityManager em = emf.createEntityManager();
    public static void main(String[] args) {



        Faker faker = new Faker(Locale.ITALY);
        EventsDAO eventsDAO = new EventsDAO(em);
        LocationsDAO locationsDAO = new LocationsDAO(em);
        PeopleDAO peopleDAO = new PeopleDAO(em);
        AttendancesDAO attendancesDAO = new AttendancesDAO(em);
        PartitaDiCalcioDAO partitaDiCalcioDAO = new PartitaDiCalcioDAO(em);
        ConcertoDAO concertoDAO = new ConcertoDAO(em);
        Random rndm = new Random();

        // ******************** SALVATAGGIO LOCATIONS, UTENTI E EVENTI ************************


        Location location1 = new Location(faker.address().city(), faker.address().cityName());
        //locationsDAO.save(location1);

        Location location2 = new Location(faker.address().city(), faker.address().cityName());
        //locationsDAO.save(location2);

        Person persona1 = new Person(faker.name().firstName(), faker.name().lastName(), faker.internet().emailAddress(), LocalDate.now(), rndm.nextInt(0, 2) == 0 ? 'M' : 'F');
        //peopleDAO.save(persona1);


        PartitaDiCalcio partita1 = new PartitaDiCalcio("Inter vs Milan", LocalDate.of(2025, 1, 20), "derby", TipoEvento.PUBBLICO, 20000, location2, "Inter", "Milan", "Inter", 2, 0);
        PartitaDiCalcio partita2 = new PartitaDiCalcio("Roma vs Lazio", LocalDate.of(2025, 2, 10), "derby", TipoEvento.PUBBLICO, 20000, location1, "Roma", "Lazio", "Roma", 2, 0);

        System.out.println(partita1);

        save(partita1);
        save(partita2);


        // ******************** PARTECIPAZIONE AD UN EVENTO ************************

        //Person person = peopleDAO.findById(23);
        //Event event = eventsDAO.findById(24);

        //Attendance partecipazione = new Attendance(person, event);
        // attendancesDAO.save(partecipazione);

        // Stampo eventi a cui partecipa la persona 23
        //person.getListaPartecipazioni().forEach(System.out::println);

        // Stampo elenco partecipanti evento 24
        //event.getListaPartecipazioni().forEach(System.out::println);

        // ******************** CASCADING ************************

        // Eliminando un evento dovrebbe eliminare anche le partecipazioni ad esso collegate
        //eventsDAO.findByIdAndDelete(24);


        em.close();
        emf.close();
    }
    public static void save(Event e){
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();

    }
}
