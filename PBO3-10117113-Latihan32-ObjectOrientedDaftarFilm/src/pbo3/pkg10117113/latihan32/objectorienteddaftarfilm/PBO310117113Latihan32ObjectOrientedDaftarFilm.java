/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan32.objectorienteddaftarfilm;

/**
 *
 * Nama     : Eka Widyantoro
 * Kelas    : IF-3
 * NIM      : 10117113
 * Deskripsi Program : program ini berisi program untuk menmpilkan daftar film
 * 
 */
public class PBO310117113Latihan32ObjectOrientedDaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("=====DAFTAR FILM YANG SEDANG TAYANG====="+"\n");
        
     DaftarFilm film1 = new DaftarFilm();
     film1.nama = "Venom";
     film1.genre = "Action, Horror, Sci-fi";
     film1.rating = 8.5;
     film1.durasi = 120;
     film1.nowPlaying(film1.nama, film1.genre, film1.rating, film1.durasi);
     
     DaftarFilm film2 = new DaftarFilm();
     film2.nama = "Small Foot";
     film2.genre = "Animation";
     film2.rating = 9.0;
     film2.durasi = 96;
        film2.nowPlaying(film2.nama, film2.genre, film2.rating, film2.durasi);     
        
     DaftarFilm film3 = new DaftarFilm();
     film3.nama = "Crazy Rich Asian";
     film3.genre = "Comedy";
     film3.rating = 7.8;
     film3.durasi = 119;
     film3.nowPlaying(film3.nama, film3.genre, film3.rating, film3.durasi);
        
     DaftarFilm film4 = new DaftarFilm();
     film4.nama = "Asih";
     film4.genre = "Horror";
     film4.rating = 6.0;
     film4.durasi = 100;
     film4.nowPlaying(film4.nama, film4.genre, film4.rating, film4.durasi);
    }
    
}
