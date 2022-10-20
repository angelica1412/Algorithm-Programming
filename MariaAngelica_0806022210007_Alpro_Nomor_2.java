import java.util.Scanner;

public class MariaAngelica_0806022210007_Alpro_Nomor_2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        float NilaiUlangan;
        System.out.println("Masukkan Nilai Ulangan");
        NilaiUlangan= input.nextFloat();
        if (NilaiUlangan>=75 && NilaiUlangan<=100){
            System.out.println("Lulus");
        }else if (NilaiUlangan<=75){
            System.out.println("Tidak Lulus");
        }
    }
}
