package fr.cours.info.tp.ferroviaire.cartographie.models;

import java.util.List;

public class Reseau {
    private Integer id_reseau;
    private String nom_reseau;
    private List<Gare> gares;
    private List<CheminDeFer> cheminsDeFer;

    public Reseau(Integer id_reseau, String nom_reseau, List<Gare> gare, List<CheminDeFer> cheminsDeFer) {
        this.id_reseau = id_reseau;
        this.nom_reseau = nom_reseau;
        this.gares = gare;
        this.cheminsDeFer = cheminsDeFer;
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

    public List<Gare> getGares() {
        return gares;
    }

    public void setGares(List<Gare> gares) {
        this.gares = gares;
    }

    public List<CheminDeFer> getCheminsDeFer() {
        return cheminsDeFer;
    }

    public void setCheminsDeFer(List<CheminDeFer> cheminsDeFer) {
        this.cheminsDeFer = cheminsDeFer;
    }

    @Override
    public String toString() {
        return "Reseau{" +
                "id_reseau=" + id_reseau +
                ", nom_reseau='" + nom_reseau + '\'' +
                ", gardes=" + gares +
                ", cheminsDeFer=" + cheminsDeFer +
                '}';
    }
    public List<Gare> ajouterGare(Gare gare)
    {
        gares.add(gare);
        return gares;
    }
    public List<Gare> remplacerGare(Gare oldGare, Gare newGare)
    {
        gares.add(gares.indexOf(oldGare), newGare);
        return gares;
    }
    public void supprimerGare(Gare gare)
    {
    gares.remove(gare);
    }
    public List<CheminDeFer> ajouterChemin(CheminDeFer chemin)
    {
        cheminsDeFer.add(chemin);
        return cheminsDeFer;
    }
    public List<CheminDeFer> remplacerChemin(CheminDeFer oldChemin, CheminDeFer newChemin)
    {
        cheminsDeFer.add(cheminsDeFer.indexOf(oldChemin), newChemin );
        return cheminsDeFer;
    }
    public void supprimerChemin(CheminDeFer chemin)
    {
        cheminsDeFer.remove(chemin);
    }
    public void listerGares()
    {
        for(Gare gare : gares)
        {
            System.out.println(gare);
        }
    }
    public void listerChemins()
    {
        for(CheminDeFer chemin : cheminsDeFer)
        {
            System.out.println(chemin);
        }
    }
}
