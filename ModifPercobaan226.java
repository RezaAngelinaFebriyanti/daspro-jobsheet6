import java.util.Scanner;

public class ModifPercobaan226 {
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
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            } else if ((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60)) {
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            } else if ((sudut1 == sudut2) || (sudut1 == sudut3) || (sudut2 == sudut3)) {
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            } else {
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
            }
        } else {
            System.out.println("Bukan Segitiga");
        }
    }
}