import java.util.Scanner;

public class Tugas2Jobsheet7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
            System.out.println("Masukan Jenis Kendaraan (1.Mobil = Rp.3000 2.Motor = Rp.2000 0 = keluar)");
            jenis = sc.nextInt();

            if (jenis == 0) {
                break;
            }

            if (jenis != 1 && jenis != 2) {
                System.out.println("Jenis kendaraan tidak valid! Coba lagi.");
                continue;
            }

            System.out.println("Masukan Durasi Parkir: ");
            durasi = sc.nextInt();

            if (durasi <= 0) {
                System.out.println("Durasi tidak valid! Coba lagi.");
                continue;
            }
            if (durasi > 5) {
                total += 12500;
            } else if (jenis == 1) {
                total += durasi * 3000;
            } else {
                total += durasi * 2000;
            }
        } while (true);
        System.out.println("Total Pendapatan Parkir Hari Ini: Rp " + total);
    }
}