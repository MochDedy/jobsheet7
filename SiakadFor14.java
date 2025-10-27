import java.util.Scanner;

public class SiakadFor14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lulus = 0, tdkLulus = 0;
        double nilai, tertinggi = 0, terendah = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                lulus++;
            } else {
                tdkLulus++;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Banyak mahasiswa yang lulus: " + lulus);
        System.out.println("Banyak mahasiswa yang tidak lulus: " + tdkLulus);

    }

}
