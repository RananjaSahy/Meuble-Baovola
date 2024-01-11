/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sahy
 */
public class MeubleVolume {
    private int idmeuble;
    private String nommeuble;
    private int idvolume;
    private String nomvolume;
    private double prixfabrication;

    public int getIdmeuble() {
        return idmeuble;
    }

    public void setIdmeuble(int idmeuble) {
        this.idmeuble = idmeuble;
    }

    public String getNommeuble() {
        return nommeuble;
    }

    public void setNommeuble(String nommeuble) {
        this.nommeuble = nommeuble;
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

    public double getPrixfabrication() {
        return prixfabrication;
    }

    public void setPrixfabrication(double prixfabrication) {
        this.prixfabrication = prixfabrication;
    }

    
    public MeubleVolume(int idmeuble, String nommeuble, int idvolume, String nomvolume, double prixfabrication) {
        this.idmeuble = idmeuble;
        this.nommeuble = nommeuble;
        this.idvolume = idvolume;
        this.nomvolume = nomvolume;
        this.prixfabrication = prixfabrication;
    }
    
    public static MeubleVolume[] find(String filtre, Connection co)throws Exception{
        String sql;
        if(filtre!=null){
            sql = "select * from meublevolume "+filtre;
        }else{
            sql = "select * from meublevolume";
        }
        Statement state = co.createStatement();
         
        try{
            ResultSet res = state.executeQuery(sql);
            List<MeubleVolume> valiny = new ArrayList<>();
            while(res.next()){
                int idmeuble = res.getInt("idmeuble");
                String nommeuble = res.getString("nommeuble");
                int idvolume = res.getInt("idvolume");
                String nomvolume = res.getString("nomvolume");
                double prixfabrication = res.getDouble("prixfabrication");
                
                MeubleVolume mb = new MeubleVolume(idmeuble, nommeuble, idvolume, nomvolume, prixfabrication);
                valiny.add(mb);
            }
            res.close();
            return valiny.toArray(new MeubleVolume[valiny.size()]);
        }catch(Exception ex){
            throw ex;
        }finally{
            state.close();
        }
    }
}
