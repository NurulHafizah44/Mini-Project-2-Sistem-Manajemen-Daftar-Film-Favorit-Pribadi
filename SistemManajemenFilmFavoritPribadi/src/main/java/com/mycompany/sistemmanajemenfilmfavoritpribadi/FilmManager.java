/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemmanajemenfilmfavoritpribadi;

import java.util.ArrayList;

public class FilmManager {
    private static final ArrayList<Film> daftarFilm = new ArrayList<>();

    public void tambahFilm(Film film) {
        daftarFilm.add(film);
        System.out.println("\nFilm berhasil ditambahkan: " + film.getJudul());
        System.out.println("------------------------------------------");
    }

    public void tampilkanSemuaFilm() {
        System.out.println("\n============= Daftar Film Favorit =============");
        if (daftarFilm.isEmpty()) {
            System.out.println("Belum ada film yang ditambahkan.");
        } else {
            System.out.printf("%-20s %-15s %-10s %-6s\n", "Judul", "Genre", "Tahun", "Rating");
            System.out.println("------------------------------------------------");
            for (Film film : daftarFilm) {
                film.tampilkanDetail();
            }
        }
        System.out.println("===============================================");
    }

    public void hapusFilm(String judul) {
        boolean ditemukan = false;
        for (Film film : daftarFilm) {
            if (film.getJudul().equalsIgnoreCase(judul)) {
                daftarFilm.remove(film);
                System.out.println("\nFilm berhasil dihapus: " + judul);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("\nFilm dengan judul '" + judul + "' tidak ditemukan.");
        }
        System.out.println("------------------------------------------");
    }
}

