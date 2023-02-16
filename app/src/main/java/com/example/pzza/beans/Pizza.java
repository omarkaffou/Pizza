package com.example.pzza.beans;

public class Pizza {

    private  int id;
    private String nom;
    private int nbrIng;
    private int photo;
    private String duree;
    private String detIng;
    private String desc;
    private String prepa;

    private static int comp;

    public Pizza() {
    }

    public Pizza(int id, String nom, int nbrIng, int photo, String duree, String detIng, String desc, String prepa) {
        this.id = ++comp;
        this.nom = nom;
        this.nbrIng = nbrIng;
        this.photo = photo;
        this.duree = duree;
        this.detIng = detIng;
        this.desc = desc;
        this.prepa = prepa;
    }

    public Pizza(String nom, int nbrIng, int photo, String duree, String detIng, String desc, String prepa) {
        this.nom = nom;
        this.nbrIng = nbrIng;
        this.photo = photo;
        this.duree = duree;
        this.detIng = detIng;
        this.desc = desc;
        this.prepa = prepa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getnbrIng() {
        return nbrIng;
    }

    public void setnbrIng(int nbrIng) {
        this.nbrIng = nbrIng;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public int getNbrIng() {
        return nbrIng;
    }

    public void setNbrIng(int nbrIng) {
        this.nbrIng = nbrIng;
    }

    public String getDetIng() {
        return detIng;
    }

    public void setDetIng(String detIng) {
        this.detIng = detIng;
    }

    public String getPrepa() {
        return prepa;
    }

    public void setPrepa(String prepa) {
        this.prepa = prepa;
    }
}
