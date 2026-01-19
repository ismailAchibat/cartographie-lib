package fr.cours.info.tp.ferroviaire.cartographie.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente une gare du réseau ferroviaire.
 * @author hend zormati
 * @version 1.0
 */
public class Gare {
    private Integer id_gare;
    private String nom_gare;
    private String ville;
    private Integer nb_quai;
    private Reseau reseau;
    private final List<CheminDeFer> cheminDeFers = new ArrayList<CheminDeFer>();


    public Gare() {
    }

    public Gare(Integer id_gare, String nom_gare, String ville, Integer nb_quai) {
        this.id_gare = id_gare;
        this.nom_gare = nom_gare;
        this.ville = ville;
        this.nb_quai = nb_quai;
    }


    public Gare(String nom_gare, String ville, Integer nb_quai) {
        this.nom_gare = nom_gare;
        this.ville = ville;
        this.nb_quai = nb_quai;
    }

  

    public Gare(Integer id_gare, String nom_gare, String ville, Integer nb_quai, Reseau reseau) {
        this.id_gare = id_gare;
        this.nom_gare = nom_gare;
        this.ville = ville;
        this.nb_quai = nb_quai;
        this.reseau = reseau;
    }


    public Integer getId_gare() {
        return id_gare;
    }

    public void setId_gare(Integer id_gare) {
        this.id_gare = id_gare;
    }

    public String getNom_gare() {
        return nom_gare;
    }

    public void setNom_gare(String nom_gare) {
        this.nom_gare = nom_gare;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Integer getNb_quai() {
        return nb_quai;
    }

    public void setNb_quai(Integer nb_quai) {
        this.nb_quai = nb_quai;
    }

    public Reseau getReseau() {
        return reseau;
    }

    public void setReseau(Reseau reseau) {
        this.reseau = reseau;
    }

    @Override
    public String toString() {
        return "Gare{" +
                "id_gare=" + id_gare +
                ", nom_gare='" + nom_gare + '\'' +
                ", ville='" + ville + '\'' +
                ", nb_quai=" + nb_quai +
                ", reseau=" + reseau +
                '}';
    }
}
