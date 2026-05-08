Timport java.util.ArrayList;
import java.util.Scanner;

record Buku(String kode, String judul, String penulis, int tahun, boolean tersedia) {}

public class perpustakaan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Buku> daftarBuku = new ArrayList<>();

      daftarBuku.add(new Buku("B01", "Laskar Pelangi", "Andrea Hirata", 2005, true));
      daftarBuku.add(new Buku("B02", "Bumi Manusia", "Pramoedya Ananta Toer, 1980, false"));
      daftarBuku.add(new Buku("B03", "Algoritma", "Rinaldi M", 2010, true))

      int pilihan;

      do {
        System.out.println("=== MENU PERPUSTAKAAN ===");
        System.out.println("1. Tambah buku baru");
        System.out.println("2. "ta)
      }