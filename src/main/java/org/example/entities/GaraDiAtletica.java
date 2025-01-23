package org.example.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;
import java.util.Set;

@Entity


@Table(name = "gare_di_atletica")
public class GaraDiAtletica extends Event{

    @ManyToMany

    @JoinTable(name="gare_atletica_persona",
    joinColumns = @JoinColumn(name = "gare_id"),
    inverseJoinColumns = @JoinColumn(name = "atleta_id"))

    private Set<Person> atelti;

    @ManyToOne
    @JoinColumn(name = "vincitore")
    private Person vincitore;

    public GaraDiAtletica(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location, Set<Person> atelti, Person vincitore) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.atelti = atelti;
        this.vincitore = vincitore;
    }

    public GaraDiAtletica() {
    }

    public Set<Person> getAtelti() {
        return atelti;
    }

    public void setAtelti(Set<Person> atelti) {
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
