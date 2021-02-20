/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if2.pkg10119065.fachriansyahmuhnuri.pkg4;

import java.util.Scanner;

/**
 *
 * NIM : 10119065
 * NAMA : FACHRIANSYAH MUH NUR I
 * Tanggal : 20-02-2021
 * KELAS : IF2
 * NOMOR SOAL : 4
 */
public class UASIF210119065FACHRIANSYAHMUHNURI4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in);
          String nama,kwn, tujuan;
          
          System.out.println("APLIKASI PENDATAAN WISATAWAN");
          System.out.println("============================");
          System.out.print("Nama : ");
          nama = sc.nextLine();
          
          System.out.print("Kewarganegaranan : ");
          kwn = sc.nextLine();
          
          System.out.print("Tujuan Wisata : ");
          tujuan = sc.nextLine();
          
          System.out.println();
          System.out.println("HASIL DATA APLIKASI PENDATAAN WISATAWAN");
          System.out.println("============================");
          System.out.println("Nama             : " + nama);
          System.out.println("Kewarganegaranan : " + kwn);
          System.out.println("Tujuan Wisata    : " + tujuan);
    }
    
}
