import java.util.Scanner;

public class PemilihanOperator20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bil1, bil2, hasil = 0;
        char operator;

        System.out.print("Masukkan Angka pertama : ");
        bil1 = sc.nextDouble();
        System.out.print("Masukkan Angka kedua : ");
        bil2 = sc.nextDouble();
        System.out.print("Masukkan Operator (+, -, *, /) : ");
        operator = sc.next().charAt(0); 

        if (operator == '+') {
            hasil = bil1 + bil2;
        } else if (operator == '-') {
            hasil = bil1 - bil2;
        } else if (operator == '*') {
            hasil = bil1 * bil2;
        } else if (operator == '/') {
            hasil = bil1 / bil2;
        } else {
            System.out.println("Operator tidak valid");
        }
        
        System.out.println(bil1 + " " + operator + " " + bil2 + " = " + hasil);
    }
}
