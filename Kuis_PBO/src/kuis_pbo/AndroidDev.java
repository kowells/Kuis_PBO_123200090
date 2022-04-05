/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_pbo;

/**
 *
 * @author ridwa
 */
public class AndroidDev extends Isi implements HitungNilai{
    
    private double hitungHasil;
    public AndroidDev(String nama, String nik, double nilaiTulis, double nilaiCoding, double nilaiWawancara) {
        super(nama, nik, nilaiTulis, nilaiCoding, nilaiWawancara);
    }

    public double getHitungHasil() {
        return hitungHasil;
    }


    @Override
    public void hitungHasil() {
        this.hitungHasil = ((super.getNilaiTulis() * 0.2) + (super.getNilaiCoding() * 0.50) + (super.getNilaiWawancara() * 0.3));
    }
    
}
