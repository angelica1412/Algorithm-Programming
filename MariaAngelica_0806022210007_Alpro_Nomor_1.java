import java.util.Scanner;

public class MariaAngelica_0806022210007_Alpro_Nomor_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Float SuhuCelcius, SuhuReamur, SuhuKelvin, SuhuFarenheit;
        String HasilKonversi;
        System.out.println("Suhu Celcius: ");
        SuhuCelcius= input.nextFloat();
        System.out.println("Konversi: ");
        HasilKonversi= input.next();
        if (HasilKonversi.equalsIgnoreCase("R")){
            SuhuReamur=(float) 0.8*SuhuCelcius;
            System.out.println("Suhu Reamur = "+SuhuReamur);
        }else if (HasilKonversi.equalsIgnoreCase("K")){
            SuhuKelvin= SuhuCelcius+273;
            System.out.println("Suhu Kelvin = "+SuhuKelvin);
        }else if (HasilKonversi.equalsIgnoreCase("F")){
            SuhuFarenheit=(float) (1.8*SuhuCelcius)+32;
            System.out.println("Suhu Farenheit = "+SuhuFarenheit);
        }
    }
}












