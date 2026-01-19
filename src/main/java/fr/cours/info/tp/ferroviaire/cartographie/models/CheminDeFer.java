package fr.cours.info.tp.ferroviaire.cartographie.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CheminDeFer {
    private Integer id_chemin;
    private Float distance;
    private List<Voie> voies=new ArrayList<Voie>();
    private Gare gareDepart;
    private Gare gareArrivee;
    private CheminDeFer cheminPrecedent;
    private CheminDeFer cheminSuivant;
    private Reseau reseau;

    public CheminDeFer(Integer id_chemin, Float distance, List<Voie> voies, Gare gareDepart, Gare gareArrivee, CheminDeFer cheminPrecedent, CheminDeFer cheminSuivant, Reseau reseau) {
        this.id_chemin = id_chemin;
        this.distance = distance;
        this.voies = voies;
        this.gareDepart = gareDepart;
        this.gareArrivee = gareArrivee;
        this.cheminPrecedent = cheminPrecedent;
        this.cheminSuivant = cheminSuivant;
        this.reseau = reseau;
    }

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

    public void ajouterVoie(Voie voie ){
        if(!voies.contains(voie)){
            voies.add(voie);
            voie.setCheminDeFer(this);
        }
    }

    public void retirerVoie(Voie voie ){
        if(voie==null)return;
        if(voies.remove(voie)){
            voie.setCheminDeFer(null);
        }
    }


    public List<Voie> getVoies(){
        return Collections.unmodifiableList(voies);
    }

    public Gare getGareDepart() {return gareDepart;}
    public void setGareDepart(Gare gareDepart) { this.gareDepart = gareDepart;}
    public Gare getGareArrivee() {return gareArrivee;}
    public void setGareArrivee(Gare gareArrivee) {this.gareArrivee = gareArrivee;}

    public Reseau getReseau() {
        return reseau;
    }

    public void setVoies(List<Voie> voies) {
        this.voies = voies;
    }

    public CheminDeFer getCheminPrecedent() {
        return cheminPrecedent;
    }

    public void setCheminPrecedent(CheminDeFer cheminPrecedent) {
        this.cheminPrecedent = cheminPrecedent;
    }

    public CheminDeFer getCheminSuivant() {
        return cheminSuivant;
    }

    public void setCheminSuivant(CheminDeFer cheminSuivant) {
        this.cheminSuivant = cheminSuivant;
    }

    public void setReseau(Reseau reseau) {
        this.reseau = reseau;
    }

    @Override
    public String toString() {
        return "CheminDeFer{" +
                "id_chemin=" + id_chemin +
                ", distance=" + distance +
                ", voies=" + voies.size() +
                ", depart=" + (gareDepart != null ? gareDepart.getNom_gare() : "null") +
                ", arrivee=" + (gareArrivee != null ? gareArrivee.getNom_gare() : "null") +
                ", reseau=" + reseau +
                '}';
    }
}
