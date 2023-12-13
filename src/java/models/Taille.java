/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import generalbdd.BDDObject;
import generalbdd.annotation.Column;
import generalbdd.annotation.PrimaryKey;
import generalbdd.annotation.Table;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sahy
 */
@Table(nom = "taille")
public class Taille extends BDDObject{
    @PrimaryKey
    @Column(name = "idtaille")
    private int idtaille;
    @Column(name = "idcategorie")
    private int idcategorie;
    @Column(name = "nom")
    private String nom;
    @Column(name = "valeur")
    private double valeur;

    Categorie categorie;
    
    public int getIdtaille() {
        return idtaille;
    }

    public void setIdtaille(int idtaille) {
        this.idtaille = idtaille;
    }

    public int getIdcategorie() {
        return idcategorie;
    }
    
    public void setIdcategorieString(String idcategorie, Connection co)throws Exception {
        int id = Integer.parseInt(idcategorie);
        this.setIdcategorie(id, co);
    }

    public void setIdcategorie(int idcategorie, Connection co)throws Exception {
        this.idcategorie = idcategorie;
        
    }

    public void refreshCategorie(Connection co)throws Exception{
        this.categorie = Categorie.findById(this.getIdcategorie(), co);
    }
    
    public Categorie getCategorie(){
        return this.categorie;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) throws Exception{
        if(nom.equals("")){
            throw new Exception("setNom taille vide");
        }
        this.nom = nom;
    }

    public double getValeur() {
        return valeur;
    }

    public void setValeurString(String valeur)throws Exception{
        this.setValeur(Double.parseDouble(valeur));
    }
    
    public void setValeur(double valeur) {
        this.valeur = valeur;
    }
    
    
    
    public Taille(){
        
    }
    
    public Taille(String idcategorie, String nom, String valeur, Connection co)throws Exception{
        this.setIdtaille(0);
        this.setIdcategorieString(idcategorie, co);
        this.setNom(nom);
        this.setValeurString(valeur);
        
    }

    public Taille(int idtaille, int idcategorie, String nom, double valeur, Connection co)throws Exception {
        this.setIdtaille(idtaille);
        this.setIdcategorie(idcategorie,co);
        this.setNom(nom);
        this.setValeur(valeur);
    }
    
    @Override
    public Taille[] find(String filtre, Connection co)throws Exception{
        Statement state = co.createStatement();
        List<Taille> valiny = new ArrayList<>();
        try{
            String sql = "select * taille where "+filtre;
            ResultSet res = state.executeQuery(sql);
            while(res.next()){
                int idtaille = res.getInt("idtaille");
                int idcategorie = res.getInt("idcategorie");
                String nom = res.getString("nom");
                double valeur = res.getDouble("valeur");
                
                Taille taille = new Taille(idtaille, idcategorie, nom, valeur, co);
                valiny.add(taille);
            }
            return valiny.toArray(new Taille[valiny.size()]);
        }catch(Exception ex){
            throw ex;
        }finally{
            state.close();
        }
        
    }
    
    public static Taille[] findByIdCategorie(int idcategorie, Connection co)throws Exception{
        return new Taille().find("idcategorie="+idcategorie, co);
    }
    
}
