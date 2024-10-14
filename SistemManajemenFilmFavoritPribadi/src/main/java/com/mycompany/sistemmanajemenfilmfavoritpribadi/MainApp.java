/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemmanajemenfilmfavoritpribadi;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            FilmManager filmManager = new FilmManager();
            int pilihan;

            do {
                System.out.println("\n===============================");
                System.out.println("Sistem Manajemen Daftar Film Favorit");
                System.out.println("===============================");
                System.out.println("1. Tambah Film Drama");
                System.out.println("2. Tambah Film Action");
                System.out.println("3. Tampilkan Semua Film");
                System.out.println("4. Hapus Film");
                System.out.println("5. Keluar");
                System.out.print("Pilih opsi (1-5): ");
                pilihan = scanner.nextInt();
                scanner.nextLine(); // konsumsi newline

                switch (pilihan) {
                    case 1 -> {
                        // Tambah film Drama
                        System.out.println("\n--- Tambah Film Drama ---");
                        System.out.print("Masukkan judul film: ");
                        String judulDrama = scanner.nextLine();
                        System.out.print("Masukkan tahun rilis: ");
                        int tahunRilisDrama = scanner.nextInt();
                        System.out.print("Masukkan rating film (0.0 - 10.0): ");
                        double ratingDrama = scanner.nextDouble();
                        scanner.nextLine(); // konsumsi newline
                        Film dramaBaru = new DramaFilm(judulDrama, tahunRilisDrama, ratingDrama);
                        filmManager.tambahFilm(dramaBaru);
                    }
                    case 2 -> {
                        // Tambah film Action
                        System.out.println("\n--- Tambah Film Action ---");
                        System.out.print("Masukkan judul film: ");
                        String judulAction = scanner.nextLine();
                        System.out.print("Masukkan tahun rilis: ");
                        int tahunRilisAction = scanner.nextInt();
                        System.out.print("Masukkan rating film (0.0 - 10.0): ");
                        double ratingAction = scanner.nextDouble();
                        scanner.nextLine(); // konsumsi newline
                        Film actionBaru = new ActionFilm(judulAction, tahunRilisAction, ratingAction);
                        filmManager.tambahFilm(actionBaru);
                    }
                    case 3 -> filmManager.tampilkanSemuaFilm();
                    case 4 -> {
                        // Hapus film berdasarkan judul
                        System.out.println("\n--- Hapus Film ---");
                        System.out.print("Masukkan judul film yang akan dihapus: ");
                        String judulHapus = scanner.nextLine();
                        filmManager.hapusFilm(judulHapus);
                    }
                    case 5 -> System.out.println("Keluar dari sistem. Terima kasih!");
                    default -> System.out.println("\nPilihan tidak valid. Silakan coba lagi.");
                }
            } while (pilihan != 5);
        }
    }
}
