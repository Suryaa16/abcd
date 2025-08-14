import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Penilaian");

        //meminta input nama//
        System.out.print("Masukkan Nama:");
        String nama = input.nextLine();

        //meminta dan menyimpan nilai//
        System.out.print("Masukkan Nilai Tugas (0-100): ");
        int nilaiTugas = input.nextInt();

        System.out.print("Masukkan Nilai UTS (0-100): ");
        int nilaiUTS = input.nextInt();

        System.out.print("Masukkan Nilai UAS (0-100): ");
        int nilaiUAS = input.nextInt();

        input.close();

        //proses logika//
        double nilaiAkhir = (0.20 * nilaiTugas) + (0.30 * nilaiUTS) + (0.50 * nilaiUAS);

        //menentukan grade//
        char grade;
        if (nilaiAkhir >= 85) {
            grade = 'A';
        } else if (nilaiAkhir >= 75) {
            grade = 'B';
        } else if (nilaiAkhir >= 65) {
            grade = 'C';
        } else if (nilaiAkhir >= 50) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        //menentukan status kelulusan//
        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("Selamat " + nama + ", Anda Lulus dengan Grade: " + grade);
        } else {
            System.out.println("Maaf " + nama + ", Anda Tidak Lulus. Grade: " + grade);
        }

        //output hasil akhir//
        System.out.println("\n-- Hasil Penilaian --");
        System.out.println("Nama: " + nama);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + (grade == 'A' || grade == 'B' || grade == 'C' ? "Lulus" : "Tidak Lulus"));
        System.out.println("-----------------------");  
    }
}