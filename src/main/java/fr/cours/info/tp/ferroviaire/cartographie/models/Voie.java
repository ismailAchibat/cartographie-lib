package fr.cours.info.tp.ferroviaire.cartographie.models;

public class Voie {
    private Integer id_voie;
    private String sens;
    private Integer vitesse_max;

    public Voie(Integer id_voie, String sens, Integer vitesse_max) {
        this.id_voie = id_voie;
        this.sens = sens;
        this.vitesse_max = vitesse_max;
    }

    public Voie(String sens, Integer vitesse_max) {
        this.sens = sens;
        this.vitesse_max = vitesse_max;
    }

    public Voie() {
    }

    public Integer getId_voie() {
        return id_voie;
    }

    public void setId_voie(Integer id_voie) {
        this.id_voie = id_voie;
    }

    public String getSens() {
        return sens;
    }

    public void setSens(String sens) {
        this.sens = sens;
    }

    public Integer getVitesse_max() {
        return vitesse_max;
    }

    public void setVitesse_max(Integer vitesse_max) {
        this.vitesse_max = vitesse_max;
    }

    @Override
    public String toString() {
        return "Voie{" +
                "id_voie=" + id_voie +
                ", sens='" + sens + '\'' +
                ", vitesse_max=" + vitesse_max +
                '}';
    }
}
