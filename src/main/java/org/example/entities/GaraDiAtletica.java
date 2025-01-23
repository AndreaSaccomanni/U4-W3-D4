package org.example.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.util.List;
@Entity
public class GaraDiAtletica extends Event{
    @ManyToMany
    private List<Person> atelti;
    @OneToOne
    private Person vincitore;

    public GaraDiAtletica(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location, List<Person> atelti, Person vincitore) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.atelti = atelti;
        this.vincitore = vincitore;
    }

    public GaraDiAtletica() {
    }

    public List<Person> getAtelti() {
        return atelti;
    }

    public void setAtelti(List<Person> atelti) {
        this.atelti = atelti;
    }

    public Person getVincitore() {
        return vincitore;
    }

    public void setVincitore(Person vincitore) {
        this.vincitore = vincitore;
    }

    @Override
    public String toString() {
        return super.toString() + "GaraDiAtletica{" +
                "atelti=" + atelti +
                ", vincitore=" + vincitore +
                '}';
    }
}
