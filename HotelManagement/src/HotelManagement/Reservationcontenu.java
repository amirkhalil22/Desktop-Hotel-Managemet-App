package HotelManagement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chaker
 */
public class Reservationcontenu {
    private int client_id ;
    private String nom ;
    private int chambre_id ;
    private String telephone ;
    private String date_arrive ;
    private String date_sortie ;
    
    public Reservationcontenu(int client_id,String nom,int chambre_id,String telephone,String date_arrive,String date_sortie){
        this.client_id=client_id ;
        this.nom=nom;
        this.chambre_id=chambre_id;
        this.telephone=telephone;
        this.date_arrive=date_arrive;
        this.date_sortie=date_sortie;
        
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getChambre_id() {
        return chambre_id;
    }

    public void setChambre_id(int chambre_id) {
        this.chambre_id = chambre_id;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDate_arrive() {
        return date_arrive;
    }

    public void setDate_arrive(String date_arrive) {
        this.date_arrive = date_arrive;
    }

    public String getDate_sortie() {
        return date_sortie;
    }

    public void setDate_sortie(String date_sortie) {
        this.date_sortie = date_sortie;
    }
    
    
    
    
    
    
}
