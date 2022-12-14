package com.example.collectionx.dao;

import com.example.collectionx.metier.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProduitDAO extends DAO<Produit,Produit> {

    private static final Connection connexion = CollectionConnect.getInstance();

    protected ProduitDAO(Connection connexion) {
        super(connexion);
    }

    @Override
    public Produit getByID(int id) {
        return null;
    }

    @Override
    public ArrayList<Produit> getAll() {
        ResultSet rs;
        ArrayList<Produit> listeProduits = new ArrayList<>();

        try (PreparedStatement cStmt = connexion.prepareStatement("select Objet.id_objet, description,\n" +
                "type.id_type, libelle_type, caracteristique.id_caracteristique, libelle_caracteristique,\n" +
                "caracteristique_objet.valeur, caracteristique_objet.texte,\n" +
                "referenciel.id_referenciel, libelle_referenciel from caracteristique_objet\n" +
                "left join Objet on Objet.id_objet = caracteristique_objet.id_objet\n" +
                "left join type on type.id_type = Objet.id_type\n" +
                "left join caracteristique on caracteristique_objet.id_caracteristique = caracteristique.id_caracteristique\n" +
                "left join referenciel on caracteristique_objet.id_referenciel = referenciel.id_referenciel\n" +
                "order by id_objet")){

            cStmt.execute();
            rs = cStmt.getResultSet();
int lastId=-1;
List<Caracteristique> listeCaracteristiques = new ArrayList<Caracteristique>();
List<Referenciel> listeReferentiel = new ArrayList<Referenciel>();
Boolean CaracteristiqueExiste = false;
Boolean ReferentielExiste = false;
int indexCaracteristique=-1;
int indexReferentiel = -1;
Double valeurNum;
String valeurTexte;
            while (rs.next()) {

                valeurNum = 0.0;
                valeurTexte = null;

                if(lastId==-1 || lastId != rs.getInt(1)){
                    lastId = rs.getInt(1);
                    Produit newProduit = new Produit();
                    newProduit.setId_produit(rs.getInt(1));
                    newProduit.setDescription(rs.getString(2));
                    newProduit.setType(new Type());
                    newProduit.getType().setId(rs.getInt(3));
                    newProduit.getType().setLibelle_type(rs.getString(4));
                    newProduit.setListproduitCaracteristiques(new ArrayList<ProduitCaracteristique>());
                    listeProduits.add(newProduit);
                }

                if(rs.getObject(9)!=null) { //Il y a un referenciel
                    ReferentielExiste = false;
                    for (int j = 0; j < listeReferentiel.size(); j++) {
                        if (listeReferentiel.get(j).getId_referenciel() == rs.getInt(9)) {
                            ReferentielExiste = true;
                            indexReferentiel = j;
                        }
                    }

                    if (!ReferentielExiste) {
                        Referenciel newReferentiel = new Referenciel();
                        newReferentiel.setId_referenciel(rs.getInt(9));
                        newReferentiel.setLibelle_referenciel(rs.getString(10));

                        listeReferentiel.add(newReferentiel);
                        indexReferentiel = listeReferentiel.size() - 1;
                    }
                }
                else {
                    indexReferentiel=-1;
                }

                CaracteristiqueExiste = false;
                for(int j=0;j<listeCaracteristiques.size();j++){
                    if(listeCaracteristiques.get(j).getId_caracteristique()==rs.getInt(5)){
                        CaracteristiqueExiste = true;
                        indexCaracteristique=j;
                    }
                }

                if(!CaracteristiqueExiste){
                    Caracteristique newCaracteristique = new Caracteristique();
                    newCaracteristique.setId_caracteristique(rs.getInt(5));
                    newCaracteristique.setLibelle_caracteristique(rs.getString(6));
                    if(indexReferentiel!=-1){ //il y a un referenciel
                        newCaracteristique.setNum(false);
                        newCaracteristique.setTexte(false);
                        newCaracteristique.setListe(true);
                    }
                    else if(rs.getObject(7)!=null){ //c'est un num
                        newCaracteristique.setNum(true);
                        newCaracteristique.setTexte(false);
                        newCaracteristique.setListe(false);
                        valeurNum=rs.getDouble(7);
                    }
                    else{ //c'est un simple texte
                        newCaracteristique.setNum(false);
                        newCaracteristique.setTexte(true);
                        newCaracteristique.setListe(false);
                        valeurTexte=rs.getString(8);
                    }
                    listeCaracteristiques.add(newCaracteristique);
                    indexCaracteristique=listeCaracteristiques.size()-1;
                }


                ProduitCaracteristique newProduitCaracteristique = new ProduitCaracteristique();
                newProduitCaracteristique.setId_produit(rs.getInt(1));
                newProduitCaracteristique.setCaracteristique(listeCaracteristiques.get(indexCaracteristique));
                if(indexReferentiel!=-1) {
                    newProduitCaracteristique.setReferentiel(listeReferentiel.get(indexReferentiel));
                }
                newProduitCaracteristique.setValeur(valeurNum);
                newProduitCaracteristique.setTexte(valeurTexte);


                    listeProduits.get(lastId-1).getListproduitCaracteristiques().add(newProduitCaracteristique);


            }
            rs.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(listeProduits);
        return listeProduits;


    }

    @Override
    public ArrayList<Produit> getLike(Produit objet) {
        return null;
    }

    @Override
    public boolean insert(Produit objet) {
        return false;
    }

    @Override
    public boolean update(Produit object) {
        return false;
    }

    @Override
    public boolean delete(Produit object) {
        return false;
    }
}
