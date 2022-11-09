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
public class Chambrecontenu {
    private int chambre_id ;
    private int numero ;
    private String etage ;
    private int nb_place ;
    

    public Chambrecontenu(int chambre_id, int numero, String etage, int nb_place) {
        this.chambre_id = chambre_id;
        this.numero = numero;
        this.etage = etage;
        this.nb_place = nb_place;
    }
    
   

    

    public int getChambre_id() {
        return chambre_id;
    }

    public void setChambre_id(int chambre_id) {
        this.chambre_id = chambre_id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEtage() {
        return etage;
    }

    public void setEtage(String etage) {
        this.etage = etage;
    }

    public int getNb_place() {
        return nb_place;
    }

    public void setNb_place(int nb_place) {
        this.nb_place = nb_place;
    }
    
}
