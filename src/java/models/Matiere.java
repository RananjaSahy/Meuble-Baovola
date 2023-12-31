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
import java.util.Arrays;

/**
 *
 * @author Sahy
 */
@Table(nom = "matiere")
public class Matiere extends BDDObject{
    
    @PrimaryKey
    @Column(name = "idmatiere")
    private int idmatiere;
    @Column(name = "nom")
    private String nom;

    public int getIdmatiere() {
        return idmatiere;
    }
    
    public void setIdmatiere(int idmatiere) throws Exception{
        if(idmatiere < 0){
            throw new Exception("setIdmatiere : valeur negative");
        }
        this.idmatiere = idmatiere;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) throws Exception{
        if(nom.equals("")){
            throw new Exception("setNom Matiere vide");
        }
        this.nom = nom;
    }
    
    public Matiere(){
        
    }

    public Matiere(int idmatiere, String nom) throws Exception{
        this.setIdmatiere(idmatiere);
        this.setNom(nom);
    }
    
    public Matiere(String nom)throws Exception{
        this.setIdmatiere(0);
        this.setNom(nom);
    }
    
    @Override
    public Matiere[] find(String filtre, Connection co)throws Exception{
        Object[] obj = super.find(filtre, co);
        return Arrays.copyOf(obj,obj.length,Matiere[].class);
    }
    
    public static Matiere findById(int id, Connection co)throws Exception{
        Matiere[] matieres = new Matiere().find("idmatiere="+id, co);
        if(matieres.length == 0){
            throw new Exception("Style innexistant");
        }
        return matieres[0];
    }
    
    
}
