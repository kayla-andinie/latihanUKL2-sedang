import java.util.Scanner;

public class VolumeTabung {

    // Fungsi untuk menghitung volume tabung (menggunakan parameter jari-jari dan tinggi)
    public static double hitungVolume(double r, double t) {
        double phi = 3.14;
        return phi * r * r * t;  // rumus volume tabung = π × r² × t
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung (cm): ");
        double jariJari = input.nextDouble();

        System.out.print("Masukkan tinggi tabung (cm): ");
        double tinggi = input.nextDouble();

        // Memanggil fungsi hitungVolume dengan parameter jariJari dan tinggi
        double volume = hitungVolume(jariJari, tinggi);

        System.out.println("Volume tabung adalah: " + volume + " cm³");
    }
}
