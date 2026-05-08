import java.util.ArrayList;
import java.util.Scanner;

record Buku(String kode, String judul, String penulis, int tahun, boolean tersedia) {}

public class perpustakaan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Buku> daftarBuku = new ArrayList<>();

        daftarBuku.add(new Buku("B01", "Laskar Pelangi", "Andrea Hirata", 2005, true));
        daftarBuku.add(new Buku("B02", "Bumi Manusia", "Pramoedya A.T", 1980, false));
        daftarBuku.add(new Buku("B03", "Algoritma", "Rinaldi M", 2010, true));

        int pilihan;

        do {
            System.out.println("\n=== MENU PERPUSTAKAAN ===");
            System.out.println("1. Tambah Buku Baru");
            System.out.println("2. Tampilkan Semua Buku");
            System.out.println("3. Cari Kode Buku");
            System.out.println("4. Tampilkan Buku yang Tersedia");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.print("Kode buku: ");
                    String kode = input.nextLine();

                    System.out.print("Judul buku: ");
                    String judul = input.nextLine();

                    System.out.print("Penulis: ");
                    String penulis = input.nextLine();

                    System.out.print("Tahun: ");
                    int tahun = input.nextInt();

                    System.out.print("Tersedia (true/false): ");
                    boolean tersedia = input.nextBoolean();
                    input.nextLine();

                    daftarBuku.add(new Buku(kode, judul, penulis, tahun, tersedia));
                    System.out.println("Buku berhasil ditambahkan.");
                    break;

                case 2:
                    System.out.println("\nDaftar Buku:");
                    for (Buku d : daftarBuku) {
                        System.out.println(
                                d.kode() + " | " +
                                d.judul() + " | " +
                                d.penulis() + " | " +
                                d.tahun() + " | " +
                                d.tersedia()
                        );
                    }
                    break;

                case 3:
                    System.out.print("Masukkan kode buku: ");
                    String cariKode = input.nextLine();
                    boolean ditemukan = false;

                    for (Buku d : daftarBuku) {
                        if (d.kode().equalsIgnoreCase(cariKode)) {
                            System.out.println("Kode    : " + d.kode());
                            System.out.println("Judul   : " + d.judul());
                            System.out.println("Penulis : " + d.penulis());
                            System.out.println("Tahun   : " + d.tahun());
                            System.out.println("Tersedia: " + d.tersedia());
                            ditemukan = true;
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Buku tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("\nBuku yang tersedia:");
                    for (Buku d : daftarBuku) {
                        if (d.tersedia()) {
                            System.out.println(
                                    d.kode() + " | " +
                                    d.judul() + " | " +
                                    d.penulis() + " | " +
                                    d.tahun()
                            );
                        }
                    }
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 5);

        input.close();
    }
}