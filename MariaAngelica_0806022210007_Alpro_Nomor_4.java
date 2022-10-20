import java.util.Scanner;

public class MariaAngelica_0806022210007_Alpro_Nomor_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float TotalJamKerja, GajiKotor = 0, Pajak = 0, GajiBersih, GajiA;
        System.out.println("Total jam kerja: ");
        TotalJamKerja = input.nextFloat();
        if (TotalJamKerja > 40) {
            GajiA = TotalJamKerja - 40;
            GajiKotor = 40 * 6 + GajiA * 9;
            System.out.println("Gaji Kotor: " + GajiKotor);
        } else {
            GajiKotor = TotalJamKerja * 6;
            System.out.println("Gaji Kotor: " + GajiKotor);
        }
        if (GajiKotor >= 250) {
            Pajak = (float) (GajiKotor * 0.12);
            System.out.println("Pajak: " + Pajak);
        } else {
            Pajak = (float) (GajiKotor * 0.1);
            System.out.println("Pajak: " + Pajak);
        }
        GajiBersih = GajiKotor - Pajak;
        System.out.println("Gaji Bersih: " + GajiBersih);
    }
}