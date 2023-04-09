package com.example.dominooriginal.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Pizza {
    @SerializedName("id")
    private Integer id;

    @SerializedName("judulKonten")
    private String judulKonten;

    @SerializedName("isiKonten")
    private String isiKonten;

    @SerializedName("harga")
    private String harga;

    @SerializedName("promo")
    private String promo;

    @SerializedName("imageKonten")
    private String imageKonten;

    public Pizza(Integer id, String isiKonten, String harga, String promo, String imageKonten, String judulKonten) {
        this.id = id;
        this.judulKonten = judulKonten;
        this.isiKonten = isiKonten;
        this.harga = harga;
        this.promo = promo;
        this.imageKonten = imageKonten;
    }

    public String getJudulKonten() {
        return judulKonten;
    }

    public void setJudulKonten(String judulKonten) {
        this.judulKonten = judulKonten;
    }

    public String getImageKonten() {
        return imageKonten;
    }

    public void setImageKonten(String imageKonten) {
        this.imageKonten = imageKonten;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsiKonten() {
        return isiKonten;
    }

    public void setIsiKonten(String isiKonten) {
        this.isiKonten = isiKonten;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getPromo() {
        return promo;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }

}
