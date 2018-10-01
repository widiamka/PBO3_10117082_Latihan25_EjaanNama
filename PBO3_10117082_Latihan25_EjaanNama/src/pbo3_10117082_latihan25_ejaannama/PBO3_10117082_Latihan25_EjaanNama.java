/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan25_ejaannama;

import java.util.Scanner;
/**
 *
 *  Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan ejaan nama
* dan inputannya berasal dari user
 */
public class PBO3_10117082_Latihan25_EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nama;
        int panjang;
        char huruf;
        
        
        Scanner scn = new Scanner (System.in);
        System.out.println("Masukkan Nama Depan Anda Untuk di-eja\t: ");
        nama = scn.next();
        panjang = nama.length();
        
        System.out.println("Ejaan untuk "+nama+ " adalah");
        
        for (int i = 0; i< panjang; i++){
            System.out.println("Huruf Ke-"+(i+1)+" : "+nama.charAt(i));
        }
    
    
    
    }
    
}
