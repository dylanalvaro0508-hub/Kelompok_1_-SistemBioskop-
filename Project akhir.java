public class SelectionSortInt {

    public static void main(String[] args) {

        int[] arr = {99, 98, 3, 2, 5, 4, 70, 50};

        int jumlahPerbandingan = 0;
        int jumlahPertukaran = 0;

        long startTime = System.nanoTime();

        for (int i = 0; i < arr.length - 1; i++) {

            int maxIndex = i; // anggap index sekarang adalah yang terbesar

            for (int j = i + 1; j < arr.length; j++) {

                jumlahPerbandingan++;

                // cari yang lebih besar (descending)
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j; // simpan index terbesar
                }
            }

            // tukar hanya sekali setelah ketemu yang terbesar
            if (maxIndex != i) {import java.util.Scanner;

// Struktur Record untuk Film
class Film {
    int id;
    String namaFilm;
    String kategori;
    String statusFilm;
    int tiketTerjual;
    int tiketTersedia;
    boolean aktif;

    public Film(int id, String nama, String kat, String stat, int terjual, int sedia) {
        this.id = id;
        this.namaFilm = nama;
        this.kategori = kat;
        this.statusFilm = stat;
        this.tiketTerjual = terjual;
        this.tiketTersedia = sedia;
        this.aktif = true;
    }
}

public class PemesananTiketBioskop {
    static Scanner input = new Scanner(System.in);
    // Kapasitas array 100 agar ada ruang untuk tambahData()
    static Film[] daftarFilm = new Film[100];
    static int jumlahData = 0;

    public static void main(String[] args) {
        inisialisasi30Data(); // Memasukkan 30 data asli Anda
        int pilih;

        do {
            System.out.println("\n========== SISTEM TIKET BIOSKOP ==========");
            System.out.println("1. Tambah Data Film");
            System.out.println("2. Tampilkan Semua Data");
            System.out.println("3. Edit Data Film");
            System.out.println("4. Hapus Data Film");
            System.out.println("5. Cari Berdasarkan Nama");
            System.out.println("6. Cari Berdasarkan ID");
            System.out.println("7. Cari Berdasarkan Kategori");
            System.out.println("8. Urutkan Berdasarkan ID");
            System.out.println("9. Urutkan Berdasarkan Nama");
            System.out.println("10. Urutkan Berdasarkan Tiket Terjual");
            System.out.println("11. Statistik Film");
            System.out.println("12. Film Akan Tayang");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            
            pilih = input.nextInt();
            input.nextLine(); // Membersihkan sisa enter agar input teks terbaca

            switch (pilih) {
                case 1: tambahData(); break;
                case 2: tampilData(); break;
                case 3: editData(); break;
                case 4: hapusData(); break;
                case 5: cariNama(); break;
                case 6: cariID(); break;
                case 7: cariKategori(); break;
                case 8: bubbleSortID(); System.out.println("Selesai diurutkan berdasarkan ID."); tampilData(); break;
                case 9: selectionSortNama(); System.out.println("Selesai diurutkan berdasarkan Nama."); tampilData(); break;
                case 10: bubbleSortTiket(); System.out.println("Selesai diurutkan berdasarkan Terlaris."); tampilData(); break;
                case 11: statistikFilm(); break;
                case 12: filmAkanTayang(); break;
                case 0: System.out.println("Program Keluar..."); break;
                default: System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);
    }

    // ================= OPERASI DATA =================
    static void tambahData() {
        System.out.print("ID Film: "); int id = input.nextInt(); input.nextLine();
        System.out.print("Nama Film: "); String nama = input.nextLine();
        System.out.print("Kategori: "); String kat = input.nextLine();
        System.out.print("Status: "); String stat = input.nextLine();
        System.out.print("Terjual: "); int terjual = input.nextInt();
        System.out.print("Tersedia: "); int sedia = input.nextInt();

        daftarFilm[jumlahData++] = new Film(id, nama, kat, stat, terjual, sedia);
        System.out.println("Film '" + nama + "' berhasil ditambahkan.");
    }

    static void tampilData() {
        System.out.printf("\n%-4s | %-25s | %-10s | %-15s | %-7s | %-7s\n", 
                          "ID", "NAMA FILM", "KATEGORI", "STATUS", "TERJUAL", "SISA");
        System.out.println("--------------------------------------------------------------------------------------");
        for (int i = 0; i < jumlahData; i++) {
            if (daftarFilm[i].aktif) {
                System.out.printf("%-4d | %-25s | %-10s | %-15s | %-7d | %-7d\n", 
                    daftarFilm[i].id, daftarFilm[i].namaFilm, daftarFilm[i].kategori, 
                    daftarFilm[i].statusFilm, daftarFilm[i].tiketTerjual, daftarFilm[i].tiketTersedia);
            }
        }
    }

    static void editData() {
        System.out.print("ID yang ingin diedit: ");
        int cari = input.nextInt(); input.nextLine();
        for (int i = 0; i < jumlahData; i++) {
            if (daftarFilm[i].id == cari && daftarFilm[i].aktif) {
                System.out.print("Nama Baru: "); daftarFilm[i].namaFilm = input.nextLine();
                System.out.print("Tiket Terjual: "); daftarFilm[i].tiketTerjual = input.nextInt();
                System.out.println("Data diperbarui!");
                return;
            }
        }
        System.out.println("Data tidak ditemukan.");
    }

    static void hapusData() {
        System.out.print("ID yang dihapus: ");
        int cari = input.nextInt();
        for (int i = 0; i < jumlahData; i++) {
            if (daftarFilm[i].id == cari) {
                daftarFilm[i].aktif = false;
                System.out.println("Data berhasil dihapus.");
                return;
            }
        }
    }

    // ================= SEARCHING & SORTING =================
    static void bubbleSortID() {
        for (int i = 0; i < jumlahData - 1; i++) {
            for (int j = 0; j < jumlahData - i - 1; j++) {
                if (daftarFilm[j].id > daftarFilm[j+1].id) {
                    Film temp = daftarFilm[j];
                    daftarFilm[j] = daftarFilm[j+1];
                    daftarFilm[j+1] = temp;
                }
            }
        }
    }

    static void selectionSortNama() {
        for (int i = 0; i < jumlahData - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < jumlahData; j++) {
                if (daftarFilm[j].namaFilm.compareToIgnoreCase(daftarFilm[minIdx].namaFilm) < 0) {
                    minIdx = j;
                }
            }
            Film temp = daftarFilm[minIdx];
            daftarFilm[minIdx] = daftarFilm[i];
            daftarFilm[i] = temp;
        }
    }

    static void bubbleSortTiket() {
        for (int i = 0; i < jumlahData - 1; i++) {
            for (int j = 0; j < jumlahData - i - 1; j++) {
                if (daftarFilm[j].tiketTerjual < daftarFilm[j+1].tiketTerjual) {
                    Film temp = daftarFilm[j];
                    daftarFilm[j] = daftarFilm[j+1];
                    daftarFilm[j+1] = temp;
                }
            }
        }
    }

    static void cariNama() {
        System.out.print("Cari Nama: ");
        String cari = input.nextLine();
        for (int i = 0; i < jumlahData; i++) {
            if (daftarFilm[i].aktif && daftarFilm[i].namaFilm.toLowerCase().contains(cari.toLowerCase())) {
                System.out.println("Ditemukan: " + daftarFilm[i].namaFilm + " [" + daftarFilm[i].statusFilm + "]");
            }
        }
    }

    static void cariID() {
        bubbleSortID();
        System.out.print("Masukkan ID: ");
        int cari = input.nextInt();
        int low = 0, high = jumlahData - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (daftarFilm[mid].id == cari) {
                System.out.println("Ditemukan: " + daftarFilm[mid].namaFilm);
                return;
            } else if (daftarFilm[mid].id < cari) low = mid + 1;
            else high = mid - 1;
        }
        System.out.println("ID tidak ditemukan.");
    }

    static void cariKategori() {
        System.out.print("Cari Kategori: ");
        String cari = input.nextLine();
        for (int i = 0; i < jumlahData; i++) {
            if (daftarFilm[i].aktif && daftarFilm[i].kategori.equalsIgnoreCase(cari)) {
                System.out.println("- " + daftarFilm[i].namaFilm);
            }
        }
    }

    static void statistikFilm() {
        int totalSedia = 0, max = -1, idxMax = -1;
        for (int i = 0; i < jumlahData; i++) {
            if (daftarFilm[i].aktif) {
                totalSedia += daftarFilm[i].tiketTersedia;
                if (daftarFilm[i].tiketTerjual > max) {
                    max = daftarFilm[i].tiketTerjual;
                    idxMax = i;
                }
            }
        }
        System.out.println("Total Tiket Tersedia: " + totalSedia);
        if (idxMax != -1) System.out.println("Film Terlaris: " + daftarFilm[idxMax].namaFilm);
    }

    static void filmAkanTayang() {
        System.out.println("\n--- FILM AKAN TAYANG ---");
        for (int i = 0; i < jumlahData; i++) {
            if (daftarFilm[i].aktif && daftarFilm[i].statusFilm.equalsIgnoreCase("Akan Tayang")) {
                System.out.println("- " + daftarFilm[i].namaFilm);
            }
        }
    }

    // ================= LOAD DATA AWAL =================
    static void inisialisasi30Data() {
        String[] nama = {
            "Avengers Endgame", "Spider Man No Way Home", "The Batman", "Fast Furious 9", "John Wick 4",
            "Insidious", "The Nun", "Annabelle", "Pengabdi Setan", "KKN Desa Penari",
            "Frozen 2", "Toy Story 4", "Minions", "Moana", "Encanto",
            "Interstellar", "Inception", "Oppenheimer", "Top Gun Maverick", "Mission Impossible",
            "Doctor Strange", "Black Panther", "Aquaman", "Transformers", "Joker",
            "Deadpool", "Cars", "Up", "Coco", "Elemental"
        };
        String[] kat = {
            "Action","Action","Action","Action","Action",
            "Horror","Horror","Horror","Horror","Horror",
            "Animasi","Animasi","Animasi","Animasi","Animasi",
            "SciFi","SciFi","SciFi","Action","Action",
            "Action","Action","Action","SciFi","Drama",
            "Comedy","Animasi","Animasi","Animasi","Animasi"
        };
        String[] stat = {
            "Sedang Tayang","Sedang Tayang","Sedang Tayang","Akan Tayang","Sedang Tayang",
            "Sedang Tayang","Akan Tayang","Sedang Tayang","Sedang Tayang","Akan Tayang",
            "Sedang Tayang","Sedang Tayang","Akan Tayang","Sedang Tayang","Akan Tayang",
            "Sedang Tayang","Sedang Tayang","Akan Tayang","Sedang Tayang","Sedang Tayang",
            "Akan Tayang","Sedang Tayang","Sedang Tayang","Akan Tayang","Sedang Tayang",
            "Sedang Tayang","Sedang Tayang","Akan Tayang","Sedang Tayang","Akan Tayang"
        };
        int[] terjual = {95,88,76,65,90,70,50,45,85,92,60,58,40,75,35,80,89,55,93,82,67,91,73,64,78,87,49,52,69,44};
        int[] sedia = {5,12,24,35,10,30,50,55,15,8,40,42,60,25,65,20,11,45,7,18,33,9,27,36,22,13,51,48,31,56};

        for (int i = 0; i < 30; i++) {
            daftarFilm[jumlahData++] = new Film(i + 1, nama[i], kat[i], stat[i], terjual[i], sedia[i]);
        }
    }
}
                int temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;

                jumlahPertukaran++;
            }

            // tampilkan iterasi
            System.out.print("Iterasi ke-" + (i + 1) + ": ");
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }

        long endTime = System.nanoTime();

        // hasil akhir
        System.out.print("Hasil akhir: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Jumlah perbandingan: " + jumlahPerbandingan);
        System.out.println("Jumlah pertukaran: " + jumlahPertukaran);

        double waktuMs = (endTime - startTime) / 1_000_000.0;
        System.out.println("Waktu eksekusi: " + waktuMs + " ms");
    }
}