/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import kuis_pbo.AndroidDev;
import kuis_pbo.WebDev;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu;
        
        Scanner input = new Scanner(System.in); 
        Scanner inputString = new Scanner(System.in);
        
        System.out.println("FORM PENDAFTARAN PT.UDIN");
        System.out.println("1. Android Development");
        System.out.println("2. Web Develompent");
        System.out.print("Pilih Jenis Form : ");
        menu = input.nextInt();
        
        System.out.println("\nFORM PENDAFTARAN\n");
        System.out.print("Input NIK : ");
        String nik = inputString.nextLine();
        
        System.out.print("Input Nama : ");
        String nama = inputString.nextLine();
        
        System.out.print("Input Nilai Tes Tulis : ");
        double hitungTulis = input.nextDouble();
        
        System.out.print("Input Nilai Tes Coding : ");
        double hitungCoding = input.nextDouble();
        
        System.out.print("Input Nilai Tes Wawancara : ");
        double hitungWawancara = input.nextDouble();
        if(menu == 1){
            AndroidDev Andro = new AndroidDev(nama, nik, hitungTulis, hitungCoding, hitungWawancara);
            while(true){
                Andro.hitungHasil();
                System.out.println("\nMenu");
                System.out.println("1. Edit");
                System.out.println("2. Tampil");
                System.out.println("3. Exit");
                System.out.print("Pilih : ");
                int pilih = input.nextInt();
                switch(pilih){
                    case 1 : 
                        System.out.println("\nFORM EDIT");
                        System.out.print("Input Nilai Tes Tulis : ");
                        hitungTulis = input.nextDouble();
                        Andro.setNilaiTulis(hitungTulis);
                        
                        System.out.print("Input Nilai Tes Coding : ");
                        hitungCoding = input.nextDouble();
                        Andro.setNilaiCoding(hitungCoding);

                        System.out.print("Input Nilai Tes Wawancara : ");
                        hitungWawancara = input.nextDouble();
                        Andro.setNilaiWawancara(hitungWawancara);
                        
                        break;
                    case 2 :
                        System.out.println("Nilai Akhir : "+Andro.getHitungHasil());
                        if(Andro.getHitungHasil() >= 85){
                            System.out.println("KETERANGAN : LOLOS");
                            System.out.println("Selamat kepada "+Andro.getNama()+" telah diterima sebagai Android");
                        }else{
                            System.out.println("KETERANGAN : GAGAL");
                            System.out.println("Mohon maaf kepada "+Andro.getNama()+" telah ditolak sebagai Android");
                        }
                        break;
                    case 3 :
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia");
                }
            }
        }else if(menu == 2){
            WebDev Web = new WebDev(nama, nik, hitungTulis, hitungCoding,hitungWawancara);
             while(true){
                Web.hitungHasil();
                System.out.println("\nMenu");
                System.out.println("1. Edit");
                System.out.println("2. Tampil");
                System.out.println("3. Exit");
                System.out.print("Pilih : ");
                int pilih = input.nextInt();
                switch(pilih){
                    case 1 : 
                        System.out.println("\nFORM EDIT");
                        System.out.print("Input Nilai Tes Tulis : ");
                        hitungTulis = input.nextDouble();
                        Web.setNilaiTulis(hitungTulis);
                        
                        System.out.print("Input Nilai Tes Coding : ");
                        hitungCoding = input.nextDouble();
                        Web.setNilaiCoding(hitungCoding);

                        System.out.print("Input Nilai Tes Wawancara : ");
                        hitungWawancara = input.nextDouble();
                        Web.setNilaiWawancara(hitungWawancara);
                        
                        break;
                    case 2 :
                        System.out.println("Nilai Akhir : "+Web.getHitungHasil());
                        if(Web.getHitungHasil() >= 85){
                            System.out.println("KETERANGAN : LOLOS");
                            System.out.println("Selamat kepada "+Web.getNama()+" telah diterima sebagai Web");
                        }else{
                            System.out.println("KETERANGAN : GAGAL");
                            System.out.println("Mohon maaf kepada "+Web.getNama()+" telah ditolak sebagai Web");
                        }
                        break;
                    case 3 :
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia");
                }
            }
        }       
    }   
}
