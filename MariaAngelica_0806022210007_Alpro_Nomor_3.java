import java.util.Scanner;

public class MariaAngelica_0806022210007_Alpro_Nomor_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        System.out.println("Angka: ");
        angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Bilangan genap");
        } else {
            System.out.println("Bilangan ganjil");
        }
    }
}
