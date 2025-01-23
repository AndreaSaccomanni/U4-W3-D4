package org.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
@Entity
@Table(name = "partite_di_calcio")
public class PartitaDiCalcio extends Event{

    @Column(nullable = false)
    private String squadraDiCasa;
    @Column(nullable = false)
    private String squadraOspite;
    private String squadraVincente;
    private int golSquadraCasa;
    private int golSquadraOspite;

    public PartitaDiCalcio(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location, String squadraDiCasa, String squadraOspite, String squadraVincente, int golSquadraCasa, int golSquadraOspite) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.squadraDiCasa = squadraDiCasa;
        this.squadraOspite = squadraOspite;
        this.squadraVincente = squadraVincente;
        this.golSquadraCasa = golSquadraCasa;
        this.golSquadraOspite = golSquadraOspite;
    }

    public PartitaDiCalcio() {}

    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        this.squadraDiCasa = squadraDiCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    public int getGolSquadraCasa() {
        return golSquadraCasa;
    }

    public void setGolSquadraCasa(int golSquadraCasa) {
        this.golSquadraCasa = golSquadraCasa;
    }

    public int getGolSquadraOspite() {
        return golSquadraOspite;
    }

    public void setGolSquadraOspite(int golSquadraOspite) {
        this.golSquadraOspite = golSquadraOspite;
    }



    @Override
    public String toString() {
        return super.toString() + "PartitaDiCalcio{" +
                "squadraDiCasa='" + squadraDiCasa + '\'' +
                ", squadraOspite='" + squadraOspite + '\'' +
                ", squadraVincente='" + squadraVincente + '\'' +
                ", golSquadraCasa=" + golSquadraCasa +
                ", golSquadraOspite=" + golSquadraOspite +
                '}';
    }
}
