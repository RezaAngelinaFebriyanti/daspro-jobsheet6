import java.util.Scanner;
public class Pemilihan2Percobaan226 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        System.out.print("Masukkan sudut pertama: ");
        double sudut1 = input26.nextDouble();
        System.out.print("Masukkan sudut kedua: ");
        double sudut2 = input26.nextDouble();
        System.out.print("Masukkan sudut ketiga: ");
        double sudut3 = input26.nextDouble();

        int totalSudut = (int) (sudut1 + sudut2 + sudut3);
        
        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
            System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else
            System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
        } else
        System.out.println("Bukan Segitiga");

    }
}