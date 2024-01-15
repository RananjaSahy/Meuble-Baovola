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
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author RdjcMada
 */
@Table(nom = "mouvementstock")
public class Mouvementstock extends BDDObject {
    @PrimaryKey
    @Column(name = "idmouvementstock")
    int idmouvementstock;
    @Column(name = "idmatiere")
    int idmatiere;
    @Column(name = "date")
    java.sql.Date date;
    @Column(name = "quantite")
    double quantite;
    @Column(name = "typemouvement")
    int typemouvement;

    ///Constucteur
    public Mouvementstock(int idMouvementStock, int idMatiere, Date dateStock, double quantite, int typeMouvement) {
        this.idmouvementstock = idMouvementStock;
        this.idmatiere = idMatiere;
        this.date = dateStock;
        this.quantite = quantite;
        this.typemouvement = typeMouvement;
    }
    
     public Mouvementstock(int idMouvementStock, int idMatiere, String dateStock, double quantite, int typeMouvement) {
         try{
             this.idmouvementstock = idMouvementStock;
            this.idmatiere = idMatiere;
            this.setDate(dateStock);
            this.quantite = quantite;
            this.typemouvement = typeMouvement;
        }
        catch(Exception e){
             e.printStackTrace();
        }
        
    }

    ///Getter and setter
    public int getIdmouvementstock() {
        return idmouvementstock;
    }

    public void setIdmouvementstock(int idMouvementStock) throws Exception {
        if(idMouvementStock >0){
            this.idmouvementstock = idMouvementStock;
        }
        else{
            throw new Exception(" idMouvementStock negative");
        }
    }

    public int getIdmatiere() {
        return idmatiere;
    }

    public void setIdmatiere(int idMatiere) throws Exception {
        if(idMatiere > 0){
            this.idmatiere = idMatiere;
        }
        else{
            throw new Exception(" idMatiere negative");
        }   
    }

    public Date getDate() {
        return date;
    }

    public void setDate(String dateStock) throws Exception{
        try{
               // Utilisez SimpleDateFormat pour parser la chaîne en java.util.Date
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date utilDate = dateFormat.parse(dateStock);
                   
                // Convertissez java.util.Date en java.sql.Date
                Date sqlDate = new Date(utilDate.getTime());
                this.setDate(sqlDate);
        }
        catch(Exception e){
            
        }
    }
    public void setDate(Date dateStock) throws Exception {
        if(dateStock == null){
            this.date = dateStock;
        }
        else{
            throw new Exception(" dateStock null");
        }  
        
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) throws Exception {
        if(quantite > 0){
            this.quantite = quantite;
        }
        else{
            throw new Exception(" quantite negative");
        }  
    }

    public int getTypemouvement() {
        return typemouvement;
    }

    public void setTypemouvement(int typeMouvement) throws Exception {
        if(typeMouvement > 0 || typeMouvement > 2 ){
            this.typemouvement = typeMouvement;
        }
        else{
            throw new Exception(" typeMouvement different de 1 et de 2");
        }  
    }
}
