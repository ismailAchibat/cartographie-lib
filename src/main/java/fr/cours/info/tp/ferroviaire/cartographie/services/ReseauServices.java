package fr.cours.info.tp.ferroviaire.cartographie.services;

import fr.cours.info.tp.ferroviaire.cartographie.models.CheminDeFer;
import fr.cours.info.tp.ferroviaire.cartographie.models.Gare;
import fr.cours.info.tp.ferroviaire.cartographie.models.Reseau;

import java.util.*;

public class ReseauServices {
    private HashMap<Integer, Reseau> reseaux = new HashMap<Integer, Reseau>();
    private HashMap<Integer, CheminDeFer> cheminDefers = new HashMap<Integer, CheminDeFer>();
    private HashMap<Integer, Gare> gares = new HashMap<Integer, Gare>();

    private int nextReseauId = 1;
    private int nextCheminDeferId = 1;
    private int nextGareId = 1;

    //---------Création-----------

    public Reseau creerReseau(String nomReseau) {
        Reseau reseau = new Reseau(nomReseau);
        reseau.setId_reseau(nextReseauId++);
        reseau.setGares(new ArrayList<Gare>());
        reseaux.put(reseau.getId_reseau(),reseau);
        return reseau;
    }

    public Gare creerGare(String nomGare,String ville,Integer nbQuai) {
        Gare gare = new Gare(nextReseauId++,nomGare,ville,nbQuai);
        gares.put(gare.getId_gare(), gare);
        return gare;
    }

    public CheminDeFer creerChemin(Float distance, Gare depart,Gare arrivee) {
        CheminDeFer chemin = new CheminDeFer(distance);
        chemin.setId_chemin(nextCheminDeferId++);
        chemin.setGareDepart(depart);
        chemin.setGareArrivee(arrivee);
        cheminDefers.put(chemin.getId_chemin(), chemin);
        return chemin;
    }

    public Reseau rechercherReseau(Integer idReseau) {
        Reseau r=reseaux.get(idReseau);
        return r;
    }
    public Gare rechercherGare(Integer idGare) {
        Gare g=gares.get(idGare);
        return g;
    }
    public CheminDeFer rechercherChemin(Integer idChemin) {
        CheminDeFer c=cheminDefers.get(idChemin);
        return c;
    }


    //-------------Associer/ dissocier ----------------

    public void associerGareReseau(Integer idReseau ,Integer idGare){
        Reseau reseau=rechercherReseau(idReseau);
        Gare gare=rechercherGare(idGare);

        if(reseau.getGares()==null) reseau.setGares(new ArrayList<Gare>());
        if(!reseau.getGares().contains(gare)) {
            reseau.ajouterGare(gare);
        }
    }
    public void dissocierGareReseau(Integer idReseau,Integer idGare){
        Reseau reseau=rechercherReseau(idReseau);
        Gare gare=rechercherGare(idGare);

        if(reseau.getGares()!=null) {
            reseau.supprimerGare(gare);
        }
    }
    public void associerCheminReseau(Integer idReseau,Integer idCheminDefer){
        Reseau reseau = rechercherReseau(idReseau);
        CheminDeFer cheminDeFer=rechercherChemin(idCheminDefer);

        if(reseau.getCheminsDeFer()==null) reseau.setCheminsDeFer(new ArrayList<CheminDeFer>());
        if(!reseau.getCheminsDeFer().contains(cheminDeFer)) {
            reseau.ajouterChemin(cheminDeFer);
        }
        cheminDeFer.setReseau(reseau);
    }

    public void dissocierCheminDuReseau(Integer idReseau,Integer idCheminDefer){
        Reseau reseau = rechercherReseau(idReseau);
        CheminDeFer cheminDeFer=rechercherChemin(idCheminDefer);

        if(reseau.getCheminsDeFer()!=null) {
            reseau.supprimerChemin(cheminDeFer);
        }

        if(cheminDeFer.getReseau()==reseau){
            cheminDeFer.setReseau(null);
        }
    }

    //----------lier/ delier gares sur un chemin ----------------------

    public void relierGaresParChemin(Integer idCheminDefer,Integer idGareDepart,Integer idGareArrive){
        CheminDeFer chemin =rechercherChemin(idCheminDefer);
        Gare depart=rechercherGare(idGareDepart);
        Gare arrive=rechercherGare(idGareArrive);

        chemin.setGareDepart(depart);
        chemin.setGareArrivee(arrive);
    }

    public void delierGaresDuChemin(Integer idCheminDefer){
        CheminDeFer chemin =rechercherChemin(idCheminDefer);
        chemin.setGareDepart(null);
        chemin.setGareArrivee(null);
    }

    public void lierChemins(Integer idCheminPrecedent,Integer idCheminSuivant){
        CheminDeFer precedent =rechercherChemin(idCheminPrecedent);
        CheminDeFer suivant= rechercherChemin(idCheminSuivant);

        precedent.setCheminSuivant(suivant);
        suivant.setCheminPrecedent(precedent);
    }
    public void delierChemins(Integer idChemin){

        CheminDeFer chemin =rechercherChemin(idChemin);
        CheminDeFer precedent=chemin.getCheminPrecedent();
        CheminDeFer suivant = chemin.getCheminSuivant();

        if(precedent !=null) precedent.setCheminSuivant(null);
        if(suivant !=null) suivant.setCheminSuivant(null);

        chemin.setCheminPrecedent(null);
        chemin.setCheminSuivant(null);
    }

    public List<Gare> listerGares() {
        return new ArrayList<Gare>(gares.values());
    }
    public List<CheminDeFer> listerChemins() {
        return new ArrayList<CheminDeFer>(cheminDefers.values());
    }
}
