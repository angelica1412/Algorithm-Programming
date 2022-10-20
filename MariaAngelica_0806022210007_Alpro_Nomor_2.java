import java.util.Scanner;

public class MariaAngelica_0806022210007_Alpro_Nomor_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float nilaiUlangan;

        System.out.println("Masukkan Nilai Ulangan");
        nilaiUlangan = input.nextFloat();

        if (nilaiUlangan >= 75 && nilaiUlangan <= 100) {
            System.out.println("Lulus");
        } else if (nilaiUlangan < 75 && nilaiUlangan >= 0) {
            System.out.println("Tidak Lulus");
        } else {
            System.out.println("Nilai Tidak Valid");
        }
    }
}
