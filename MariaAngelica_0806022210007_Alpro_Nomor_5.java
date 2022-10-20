import java.util.Scanner;

public class MariaAngelica_0806022210007_Alpro_Nomor_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String NamaAnda, JenisKelamin, Menikah;
        System.out.println("Nama Anda: ");
        NamaAnda = input.next();
        System.out.println("Jenis Kelamin(L/P):");
        JenisKelamin = input.next();
        System.out.println("Menikah(Y/T):");
        Menikah= input.next();
        if (JenisKelamin.equalsIgnoreCase("L") && Menikah.equalsIgnoreCase("Y")) {
            System.out.println("Hello, Mr. " + NamaAnda);
        } else if (JenisKelamin.equalsIgnoreCase("L") && Menikah.equalsIgnoreCase("T")) {
            System.out.println("Hello, Mr. " + NamaAnda);
        } else if (JenisKelamin.equalsIgnoreCase("P") && Menikah.equalsIgnoreCase("Y")) {
            System.out.println("Hello, Mrs. " + NamaAnda);
        } else if (JenisKelamin.equalsIgnoreCase("P") && Menikah.equalsIgnoreCase("T")) {
            System.out.println("Hello, Ms. " + NamaAnda);
        }
    }
}