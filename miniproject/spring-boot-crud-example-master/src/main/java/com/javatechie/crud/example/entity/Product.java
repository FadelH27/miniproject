package com.javatechie.crud.example.entity;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name = "pelanggan")
public class Product {

    @Id

    private int id;
    private String namaPelanggan;
    private String noTeleponpelanggan;
    private String alamatPelanggan;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getNoTeleponpelanggan() {
        return noTeleponpelanggan;
    }

    public void setNoTeleponpelanggan(String noTeleponpelanggan) {
        this.noTeleponpelanggan = noTeleponpelanggan;
    }

    public String getAlamatPelanggan() {
        return alamatPelanggan;
    }

    public void setAlamatPelanggan(String alamatPelanggan) {
        this.alamatPelanggan = alamatPelanggan;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", namaPelanggan='" + namaPelanggan + '\'' +
                ", noTeleponpelanggan='" + noTeleponpelanggan + '\'' +
                ", alamatPelanggan='" + alamatPelanggan + '\'' +
                '}';
    }
}
