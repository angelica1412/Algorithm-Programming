import java.util.Scanner;

public class MariaAngelica_0806022210007_Alpro_Nomor_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namaAnda, jenisKelamin, menikah;

        System.out.println("Nama Anda: ");
        namaAnda = input.next();
        System.out.println("Jenis Kelamin(L/P):");
        jenisKelamin = input.next();
        System.out.println("Menikah(Y/T):");
        menikah = input.next();

        if (jenisKelamin.equalsIgnoreCase("L") && menikah.equalsIgnoreCase("Y")) {
            System.out.println("Hello, Mr. " + namaAnda);
        } else if (jenisKelamin.equalsIgnoreCase("L") && menikah.equalsIgnoreCase("T")) {
            System.out.println("Hello, Mr. " + namaAnda);
        } else if (jenisKelamin.equalsIgnoreCase("P") && menikah.equalsIgnoreCase("Y")) {
            System.out.println("Hello, Mrs. " + namaAnda);
        } else if (jenisKelamin.equalsIgnoreCase("P") && menikah.equalsIgnoreCase("T")) {
            System.out.println("Hello, Ms. " + namaAnda);
        }
    }
}