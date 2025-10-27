import java.util.Scanner;

public class Tugas1jobsheet7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket, totTiket = 0, totPenjualan = 0;
        double hargaTiket = 50000, totHarga;
        String lanjut;

        do {
            System.out.print("Masukkan tiket yang dibeli: " );
            jumlahTiket = sc.nextInt();

            if (jumlahTiket <= 0) {
                System.out.println("Input tidak valid. Masukkan ulang jumlah tiket!");
                continue;
            }
            totHarga = jumlahTiket * hargaTiket;
            if (jumlahTiket > 10) {
                totHarga = totHarga - (totHarga * 0.15);
            } else if (jumlahTiket > 4) {
                totHarga = totHarga - (totHarga * 0.1);
            } else {
            }

            totTiket += jumlahTiket;
            totPenjualan += totHarga;

            System.out.println("Total harga pembelian ini:: Rp " + totHarga);
            sc.nextLine();
            System.out.println("Apakah masih ada pelanggan? (Ya/Tidak) ");
            lanjut = sc.nextLine();

            if (lanjut.equalsIgnoreCase("Tidak")) {
                break;
            }
        } while (true);
    
        System.out.println("\nTotal tiket terjual: " +totTiket);
        System.out.println("Total penjualan: Rp" +totPenjualan);
    }
}
