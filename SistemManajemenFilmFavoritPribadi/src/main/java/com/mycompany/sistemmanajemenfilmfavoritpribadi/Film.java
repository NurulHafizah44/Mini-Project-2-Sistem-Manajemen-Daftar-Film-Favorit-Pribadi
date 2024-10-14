/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemmanajemenfilmfavoritpribadi;

public abstract class Film {
    private final String judul;
    private final String genre;
    private final int tahunRilis;
    private final double rating;

    public Film(String judul, String genre, int tahunRilis, double rating) {
        this.judul = judul;
        this.genre = genre;
        this.tahunRilis = tahunRilis;
        this.rating = rating;
    }

    public String getJudul() {
        return judul;
    }

    public String getGenre() {
        return genre;
    }

    public int getTahunRilis() {
        return tahunRilis;
    }

    public double getRating() {
        return rating;
    }

    public void tampilkanDetail() {
        System.out.printf("%-20s %-15s %-10s %-6s\n", judul, genre, tahunRilis, rating);
    }
}

