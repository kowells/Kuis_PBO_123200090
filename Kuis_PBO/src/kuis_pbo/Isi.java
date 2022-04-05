/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_pbo;

import java.util.Scanner;
/**
 *
 * @author ridwa
 */
public class Isi {
    private String nik, nama;
    private double nilaiTulis, nilaiCoding, nilaiWawancara;

    public Isi(String nama, String nik, double tesTulis, double tesCoding, double tesWawancara) {
        this.nama = nama;
        this.nik = nik;
        this.nilaiTulis = nilaiTulis;
        this.nilaiCoding = nilaiCoding;
        this.nilaiWawancara = nilaiWawancara;
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public double getNilaiTulis() {
        return nilaiTulis;
    }

    public void setNilaiTulis(double nilaiTulis) {
        this.nilaiTulis = nilaiTulis;
    }

    public double getNilaiCoding() {
        return nilaiCoding;
    }

    public void setNilaiCoding(double nilaiCoding) {
        this.nilaiCoding = nilaiCoding;
    }

    public double getNilaiWawancara() {
        return nilaiWawancara;
    }

    public void setNilaiWawancara(double nilaiWawancara) {
        this.nilaiWawancara = nilaiWawancara;
    }

  
    
}

