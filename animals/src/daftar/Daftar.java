/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftar;

import java.util.Scanner;

/**
 *
 * @author City
 */
public class Daftar {
    
    public void pendaftaran(){
        
        Scanner nama = new Scanner(System.in);
        System.out.print("Nama Pemilik : ");
        String namaa = nama.nextLine();
        
        Scanner crew = new Scanner(System.in);
        System.out.print("Nama Petugas : ");
        String creww = crew.nextLine();
        
        Scanner jenis = new Scanner(System.in);
        System.out.print("Kode jenis hewan : ");
        int jeniss = jenis.nextInt();
        
        Scanner care = new Scanner(System.in);
        System.out.print("Kode jenis pemeliharaan : ");
        int caree = care.nextInt();
        
        Scanner lama = new Scanner(System.in);
        System.out.print("Lama penitipan (@hari) : ");
        int lamaa = lama.nextInt();
        
        System.out.println("--------------------------------------------");
        System.out.println("TOTAL BIAYA PEMELIHARAAN : ");
        Bayar biaya= new Bayar();
        biaya.pembayaran(jeniss,caree,lamaa);
        
    }
    
    
}
