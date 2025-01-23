package org.example.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity


@Table(name = "gare_di_atletica")
public class GaraDiAtletica extends Evento {

    @ManyToMany

    @JoinTable(name="gare_atletica_persona",
    joinColumns = @JoinColumn(name = "gare_id"),
    inverseJoinColumns = @JoinColumn(name = "atleta_id"))

    private Set<Persona> atelti;

    @ManyToOne
    @JoinColumn(name = "vincitore")
    private Persona vincitore;

    public GaraDiAtletica(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location, Set<Persona> atelti, Persona vincitore) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.atelti = atelti;
        this.vincitore = vincitore;
    }

    public GaraDiAtletica() {
    }

    public Set<Persona> getAtelti() {
        return atelti;
    }

    public void setAtelti(Set<Persona> atelti) {
        this.atelti = atelti;
    }

    public Persona getVincitore() {
        return vincitore;
    }

    public void setVincitore(Persona vincitore) {
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
