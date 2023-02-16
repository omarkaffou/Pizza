package com.example.pizaaapp.beans;

public class Pizza {

    private  int id;
    private String nom;
    private int nbreIngredients;
    private int photo;
    private String duree;
    private String detaisIngred;
    private String description;
    private String preparation;


    private static int comp;

    public Pizza(){

    }

    public Pizza(String nom, int nbreIngredients, int photo, String duree, String detaisIngred, String description, String preparation) {
        this.id = ++comp;
        this.nom = nom;
        this.nbreIngredients = nbreIngredients;
        this.photo = photo;
        this.duree = duree;
        this.detaisIngred = detaisIngred;
        this.description = description;
        this.preparation = preparation;
    }



    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getNbreIngredients() {
        return nbreIngredients;
    }

    public int getPhoto() {
        return photo;
    }

    public String getDuree() {
        return duree;
    }

    public String getDetaisIngred() {
        return detaisIngred;
    }

    public String getDescription() {
        return description;
    }

    public String getPreparation() {
        return preparation;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbreIngredients(int nbreIngredients) {
        this.nbreIngredients = nbreIngredients;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public void setDetaisIngred(String detaisIngred) {
        this.detaisIngred = detaisIngred;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbreIngredients=" + nbreIngredients +
                ", photo=" + photo +
                ", duree=" + duree +
                ", detaisIngred='" + detaisIngred + '\'' +
                ", description='" + description + '\'' +
                ", preparation='" + preparation + '\'' +
                '}';
    }
}
