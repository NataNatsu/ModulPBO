import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);
        String jenisKelaminLengkap = (jenisKelamin == 'P' || jenisKelamin == 'p') ? "Perempuan" : "Laki-laki";

        System.out.print("Masukkan tanggal lahir (YYYY-MM-DD): ");
        String tanggalLahirStr = scanner.next();

        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);
        String formattedTanggalLahir = tanggalLahir.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        LocalDate sekarang = LocalDate.now();
        int umur = Period.between(tanggalLahir, sekarang).getYears();

        System.out.println("\n=== Data Diri ===");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminLengkap);
        System.out.println("Tanggal Lahir: " + formattedTanggalLahir);
        System.out.println("Umur: " + umur + " tahun");

        // Menutup scanner
        scanner.close();
    }
}
