/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
@Table(nom = "quantitematiere")
public class Quantitematiere extends BDDObject {

    @PrimaryKey
    @Column(name = "idquantitematiere")
    private int idquantitematiere;
    @Column(name = "idmeuble")
    private int idmeuble;
    private String nommeuble;
    @Column(name = "idvolume")
    private int idvolume;
    private String nomvolume;
    @Column(name = "idmatiere")
    private int idmatiere;
    private String nommatiere;
    @Column(name = "quantite")
    private double quantite;

    public int getIdquantitematiere() {
        return idquantitematiere;
    }

    public void setIdquantitematiere(int idquantitematiere) {
        this.idquantitematiere = idquantitematiere;
    }

    public int getIdmeuble() {
        return idmeuble;
    }

    public void setIdmeuble(int idmeuble) {
        this.idmeuble = idmeuble;
    }

    public void setNommeuble(String nommeuble) {
        this.nommeuble = nommeuble;
    }

    public String getNommeuble() {
        return nommeuble;
    }

    public int getIdvolume() {
        return idvolume;
    }

    public void setIdvolume(int idvolume) {
        this.idvolume = idvolume;
    }

    public String getNomvolume() {
        return nomvolume;
    }

    public void setNomvolume(String nomvolume) {
        this.nomvolume = nomvolume;
    }

    public int getIdmatiere() {
        return idmatiere;
    }

    public void setIdmatiere(int idmatiere) {
        this.idmatiere = idmatiere;
    }

    public String getNommatiere() {
        return nommatiere;
    }

    public void setNommatiere(String nommatiere) {
        this.nommatiere = nommatiere;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) throws Exception{
        if(quantite<=0){
            throw new Exception("setQuantite negative");
        }
        this.quantite = quantite;
    }

    public Quantitematiere() {
    }

    public Quantitematiere(int idquantitematiere, int idmeuble, int idvolume, int idmatiere, double quantite) throws Exception{
        this.setIdquantitematiere(idquantitematiere);
        this.setIdmeuble(idmeuble);
        this.setIdvolume(idvolume);
        this.setIdmatiere(idmatiere);
        this.setQuantite(quantite);
    }

    public Quantitematiere(int idquantitematiere, int idmeuble,String nommeuble, int idvolume, String nomvolume, int idmatiere, String nommatiere, double quantite) throws Exception{
        this.setIdquantitematiere(idquantitematiere);
        this.setIdmeuble(idmeuble);
        this.setNommeuble(nommeuble);
        this.setIdvolume(idvolume);
        this.setNomvolume(nomvolume);
        this.setIdmatiere(idmatiere);
        this.setNommatiere(nommatiere);
        this.setQuantite(quantite);
    }

    public Quantitematiere[] find(String filtre, Connection co) throws Exception {
        Statement state = co.createStatement();
        List<Quantitematiere> valiny = new ArrayList<>();
        try {
            String sql = "select * from v_quantitematiere where " + filtre;
            System.out.println(sql);
            ResultSet res = state.executeQuery(sql);
            while (res.next()) {

                int idquantitematiere = res.getInt("idquantitematiere");
                int idmeuble = res.getInt("idmeuble");
                String nommeuble = res.getString("nommeuble");
                int idvolume = res.getInt("idvolume");
                String nomvolume= res.getString("nomvolume");
                int idmatiere = res.getInt("idmatiere");
                String nommatiere = res.getString("nommatiere");
                double quantite =res.getDouble("quantite");

                Quantitematiere qm = new Quantitematiere(idquantitematiere, idmeuble, nommeuble, idvolume, nomvolume, idmatiere, nommatiere, quantite);
                valiny.add(qm);
            }
            return valiny.toArray(new Quantitematiere[valiny.size()]);
        } catch (Exception ex) {
            throw ex;
        } finally {
            state.close();
        }
    }

    public static Quantitematiere[] findByIdMatiere(int idmatiere,Connection co)throws Exception{
        return new Quantitematiere().find("idmatiere="+idmatiere,co);
    }
    
    public static Quantitematiere findById(int idquantitematiere,Connection co)throws Exception{
        Quantitematiere[] liste = new Quantitematiere().find("idquantitematiere="+idquantitematiere,co);
        if(liste.length == 0){
            throw new Exception("Quantitematiere innexistante");
        }
        return liste[0];
    }
    
    
    
    public static Quantitematiere findByIdmeubleIdvolumeIdmatiere(int idmeuble, int idvolume, int idmatiere, Connection co)throws Exception{
        Quantitematiere[] liste = new Quantitematiere().find("idmeuble="+idmeuble+" and idvolume="+idvolume+" and idmatiere="+idmatiere, co);
        if(liste.length==0){
            return null;
        }
        return liste[0];
    }
    
    public void isInserable(Connection co)throws Exception{
        if(Quantitematiere.findByIdmeubleIdvolumeIdmatiere(this.getIdmeuble(),this.getIdvolume(),this.getIdmatiere(), co)!=null){
            throw new Exception("Quantitematiere deja existant");
        }
    }
    
    @Override
    public void insert(Connection co)throws Exception{
        this.isInserable(co);
        super.insert(co);
    }
}