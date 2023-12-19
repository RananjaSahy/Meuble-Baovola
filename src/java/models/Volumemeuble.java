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
@Table(nom = "volumemeuble")
public class Volumemeuble extends BDDObject{
    @PrimaryKey
    @Column(name = "idvolumemeuble")
    private int idvolumemeuble;
    @Column(name = "idcategorie")
    private int idcategorie;
    @Column(name = "nom")
    private String nom;
    @Column(name = "valeur")
    private double valeur;

    Categorie categorie;
    
    public int getIdvolumemeuble() {
        return idvolumemeuble;
    }

    public void setIdvolumemeuble(int idvolumemeuble) {
        this.idvolumemeuble = idvolumemeuble;
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
            throw new Exception("setNom volumemeuble vide");
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
    
    
    
    public Volumemeuble(){
        
    }
    
    public Volumemeuble(String idcategorie, String nom, String valeur, Connection co)throws Exception{
        this.setIdvolumemeuble(0);
        this.setIdcategorieString(idcategorie, co);
        this.setNom(nom);
        this.setValeurString(valeur);
        
    }

    public Volumemeuble(int idvolumemeuble, int idcategorie, String nom, double valeur, Connection co)throws Exception {
        this.setIdvolumemeuble(idvolumemeuble);
        this.setIdcategorie(idcategorie,co);
        this.setNom(nom);
        this.setValeur(valeur);
    }
    
    @Override
    public Volumemeuble[] find(String filtre, Connection co)throws Exception{
        Statement state = co.createStatement();
        List<Volumemeuble> valiny = new ArrayList<>();
        try{
            String sql = "select * volumemeuble where "+filtre;
            ResultSet res = state.executeQuery(sql);
            while(res.next()){
                int idvolumemeuble = res.getInt("idvolumemeuble");
                int idcategorie = res.getInt("idcategorie");
                String nom = res.getString("nom");
                double valeur = res.getDouble("valeur");
                
                Volumemeuble volumemeuble = new Volumemeuble(idvolumemeuble, idcategorie, nom, valeur, co);
                valiny.add(volumemeuble);
            }
            return valiny.toArray(new Volumemeuble[valiny.size()]);
        }catch(Exception ex){
            throw ex;
        }finally{
            state.close();
        }
        
    }
    
    public static Volumemeuble[] findByIdCategorie(int idcategorie, Connection co)throws Exception{
        return new Volumemeuble().find("idcategorie="+idcategorie, co);
    }
    
}
