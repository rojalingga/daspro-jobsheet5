import java.util.Scanner;

public class kategoriusia20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan usia Anda: ");
        int usia = input.nextInt();

        if (usia < 0) {
            System.out.println("Usia tidak boleh negatif.");
            System.out.println("Input tidak valid.");
        } else if (usia <= 12) {
            System.out.println("Usia anda : " + usia);
            System.out.println("Anda termasuk kategori Anak-anak.");
        } else if (usia <= 19) {
            System.out.println("Usia anda : " + usia);
            System.out.println("Anda termasuk kategori Remaja.");
        } else if (usia <= 64) {
            System.out.println("Usia anda : " + usia);
            System.out.println("Anda termasuk kategori Dewasa.");
        } else if (usia > 65) {
            System.out.println("Usia anda : " + usia);
            System.out.println("Anda termasuk kategori Lansia.");
        }
    }
}