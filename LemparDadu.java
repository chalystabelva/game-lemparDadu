/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lempardadu;

/**
 *
 * @author IDEAPAD
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LemparDadu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        int inputPemain;

        ArrayList<Integer> riwayatKomputer = new ArrayList<>();
        ArrayList<Integer> riwayatPemain = new ArrayList<>();

        int menangKomputer = 0;
        int menangPemain = 0;

        System.out.print("Ingin main berapa ronde? ");
        int totalRonde = input.nextInt();
        input.nextLine(); // clear buffer

        System.out.println();

        for (int ronde = 1; ronde <= totalRonde; ronde++){
            System.out.print("Tekan tombol apa saja untuk melempar dadu...");
            input.nextLine(); 

            int daduKomputer = rand.nextInt(6) + 1; 
            int daduPemain = rand.nextInt(6) + 1;

            riwayatKomputer.add(daduKomputer);
            riwayatPemain.add(daduPemain);

            System.out.println("Komputer melempar dadu: " + daduKomputer);
            System.out.println("Pemain melempar dadu: " + daduPemain);
            

            if (daduKomputer > daduPemain) {
                System.out.println("Komputer menang di ronde ini!");
                menangKomputer++;
            } else if (daduPemain > daduKomputer) {
                System.out.println("Pemain menang di ronde ini!");
                menangPemain++;
            } else {
                System.out.println("Seri!");
            }

            System.out.println("Skor sementara -> Pemain: " + menangPemain 
                + " | Komputer: " + menangKomputer);
        }

            System.out.println("\n === Permainan Selesai ===");
            if (menangPemain == 5) {
                System.out.println("Pemenangnya adalah PEMAIN!");
            } else {
                System.out.println("Pemenangnya adalah KOMPUTER!");
            }

            System.out.println("\nRiwayat Lemparan Komputer:");
            System.out.println(riwayatKomputer);

            System.out.println("Riwayat Lemparan Pemain:");
            System.out.println(riwayatPemain);

            System.out.println("Total Kemenangan:");
            System.out.println("Pemain   : " + menangPemain);
            System.out.println("Komputer : " + menangKomputer);
        }
    }

        //while (menangKomputer < 5 && menangPemain < 5) {

           