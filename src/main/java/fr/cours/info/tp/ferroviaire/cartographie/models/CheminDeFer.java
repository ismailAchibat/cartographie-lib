package fr.cours.info.tp.ferroviaire.cartographie.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CheminDeFer {
    private Integer id_chemin;
    private Float distance;

    public CheminDeFer(Integer id_chemin, Float distance) {
        this.id_chemin = id_chemin;
        this.distance = distance;
    }

    private List<Voie> voies=new ArrayList<Voie>();

    public CheminDeFer(Float distance) {
        this.distance = distance;
    }

    public CheminDeFer() {
    }

    public Integer getId_chemin() {
        return id_chemin;
    }

    public void setId_chemin(Integer id_chemin) {
        this.id_chemin = id_chemin;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public void ajouterVoie(Voie voie ){}

    public void retirerVoie(Voie voie ){}


    public List<Voie> getVoies(){
        return Collections.unmodifiableList(voies);
    }

    @Override
    public String toString() {
        return "CheminDeFer{" +
                "id_chemin=" + id_chemin +
                ", distance=" + distance +
                '}';
    }
}
