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
public class DaftarFilm {
    public  String nama;
    public  String genre;
    public  Double rating;
    public  int durasi;
    public void nowPlaying (String nama,String genre,Double rating,int 
                            durasi){
    System.out.println("");   
    System.out.println("Judul Film\t: "+nama);
    System.out.println("Genre Film\t: "+genre);
    System.out.println("Rating Film\t: "+rating);
    System.out.println("Durasi Film\t: "+durasi+" Menit");
    }
}
