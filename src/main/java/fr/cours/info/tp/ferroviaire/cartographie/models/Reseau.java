package fr.cours.info.tp.ferroviaire.cartographie.models;

public class Reseau {
    private Integer id_reseau;
    private String nom_reseau;

    public Reseau(Integer id_reseau, String nom_reseau) {
        this.id_reseau = id_reseau;
        this.nom_reseau = nom_reseau;
    }

    public Reseau() {
    }

    public Reseau(String nom_reseau) {
        this.nom_reseau = nom_reseau;
    }

    public Integer getId_reseau() {
        return id_reseau;
    }

    public void setId_reseau(Integer id_reseau) {
        this.id_reseau = id_reseau;
    }

    public String getNom_reseau() {
        return nom_reseau;
    }

    public void setNom_reseau(String nom_reseau) {
        this.nom_reseau = nom_reseau;
    }

    @Override
    public String toString() {
        return "Reseau{" +
                "id_reseau=" + id_reseau +
                ", nom_reseau='" + nom_reseau + '\'' +
                '}';
    }
}
