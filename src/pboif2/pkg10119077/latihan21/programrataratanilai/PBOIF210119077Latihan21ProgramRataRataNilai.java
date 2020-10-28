/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan21.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author RAF
 * Nama     : Ridhwan Anwar Fauzan
 * NIM      : 10119077
 * Kelas    : IF-2
 * Deskripsi: Program Rata-Rata Nilai Mahasiswa
 */
public class PBOIF210119077Latihan21ProgramRataRataNilai {
    public static double hitungRataRata(double jumlah, int n){
        double rata = jumlah / n;
        return rata;
    }
    
    public static void main(String[] args) {
        int n;
        double rata,jumlah,nilai;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n = input.nextInt();
        jumlah = 0;
        for (int i=1; i <= n; i++){
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            nilai = input.nextInt();
            jumlah += nilai;
        }
        rata = jumlah / n;
        System.out.println("Maka, Rata-rata Nilainya adalah : "+ hitungRataRata(jumlah,n));
        System.out.println("(Developed by : Ridhwan Anwar Fauzan)");
    }
    
}
