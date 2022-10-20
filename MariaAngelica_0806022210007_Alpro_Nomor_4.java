import java.util.Scanner;

public class MariaAngelica_0806022210007_Alpro_Nomor_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float totalJamKerja, gajiKotor, pajak, gajiBersih, gajiA;

        System.out.println("Total jam kerja: ");
        totalJamKerja = input.nextFloat();
        if (totalJamKerja > 40) {
            gajiA = totalJamKerja- 40;
            gajiKotor= 40 * 6 + gajiA * 9;
            System.out.println("Gaji Kotor: " + gajiKotor);
        } else {
            gajiKotor = totalJamKerja * 6;
            System.out.println("Gaji Kotor: " + gajiKotor);
        }
        if (gajiKotor >= 250) {
            pajak = (float) (gajiKotor * 0.12); // casting mengubah nilai double ke dalam float
            System.out.println("Pajak: " + pajak);
        } else {
            pajak = (float) (gajiKotor * 0.1);
            System.out.println("Pajak: " + pajak);
        }
        gajiBersih = gajiKotor - pajak;
        System.out.println("Gaji Bersih: " + gajiBersih);
    }
}