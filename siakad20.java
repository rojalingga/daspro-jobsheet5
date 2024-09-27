import java.util.Scanner;

public class siakad20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim, kelas, nilaiHuruf, kualifikasi;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiAkhir, nilaiUAS;

        System.out.print("Masukkan nama : ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM : ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen : ");
        absen = sc.nextByte();

        System.out.println("");
        
        System.out.print("Masukkan nilai kuis : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS : ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS : ");
        nilaiUAS = sc.nextDouble();

        nilaiAkhir = ((nilaiKuis*20/100)+(nilaiTugas*15/100)+(nilaiUTS*30/100)+(nilaiUAS*35/100));


        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir > 40 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }

        System.out.print("Mahasiswa dengan nama " + nama + " (NIM " + nim + ") ");
        System.out.println("kelas : " + kelas + " nomor absen : " + absen);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai huruf : " + nilaiHuruf);
        System.out.println("Kualifikasi : " + kualifikasi);
        
    }
}