package tttt1;
import java.util.Scanner;
public class erapot1{
    public void nama(){
        Scanner baca = new Scanner(System.in);
        System.out.println("N I L A I");
        int a;
        System.out.print("MATEMATIKA :");
        int nilai1 = baca.nextInt();
        if (nilai1 < 101 && nilai1 >= 95) {
            System.out.println("Nilai anda A");
        } else if (nilai1 <= 94 && nilai1 >= 90) {
            System.out.println("Nilai anda B");
        } else if (nilai1 <= 89 && nilai1 >= 85) {
            System.out.println("Nilai anda C");
        } else if (nilai1 <= 84 && nilai1 >= 80) {
            System.out.println("Nilai anda D");
        } else if (nilai1 <= 79 && nilai1 >= 0) {
            System.out.println("Sayang nilai anda D");
        }
         System.out.println("===================================");
        System.out.print("IPA:");
        int nilai2 = baca.nextInt();
         if (nilai2 < 101 && nilai2 >= 95) {
            System.out.println("Nilai anda A");
        } else if (nilai2 <= 94 && nilai2 >= 90) {
            System.out.println("Nilai anda B");
        } else if (nilai2 <= 89 && nilai2 >= 85) {
            System.out.println("Nilai anda C");
        } else if (nilai2 <= 84 && nilai2 >= 80) {
            System.out.println("Nilai anda D");
        } else if (nilai2 <= 79 && nilai2 >= 0) {
            System.out.println("Sayang nilai anda D");
        }
        System.out.println("===================================");
        System.out.print("IPS:");
        int nilai3 = baca.nextInt();
         if (nilai3 < 101 && nilai3 >= 95) {
            System.out.println("Nilai anda A");
        } else if (nilai3 <= 94 && nilai3 >= 90) {
            System.out.println("Nilai anda B");
        } else if (nilai3 <= 89 && nilai3 >= 85) {
            System.out.println("Nilai anda C");
        } else if (nilai3 <= 84 && nilai3 >= 80) {
            System.out.println("Nilai anda D");
        } else if (nilai3 <= 79 && nilai3 >= 0) {
            System.out.println("Sayang nilai anda D");
        }
         System.out.println("===================================");
        System.out.print("PPkn:");
        int nilai4 = baca.nextInt();
        if (nilai4 < 101 && nilai4 >= 95) {
            System.out.println("Nilai anda A");
        } else if (nilai4 <= 94 && nilai4 >= 90) {
            System.out.println("Nilai anda B");
        } else if (nilai4 <= 89 && nilai4 >= 85) {
            System.out.println("Nilai anda C");
        } else if (nilai4 <= 84 && nilai4 >= 80) {
            System.out.println("Nilai anda D");
        } else if (nilai4 <= 79 && nilai4 >= 0) {
            System.out.println("Sayang nilai anda D");
        }
         System.out.println("===================================");
        System.out.print("Biologi:");
        int nilai5 = baca.nextInt();
        if (nilai5 < 101 && nilai5 >= 95) {
            System.out.println("Nilai anda A");
        } else if (nilai5 <= 94 && nilai5 >= 90) {
            System.out.println("Nilai anda B");
        } else if (nilai5 <= 89 && nilai5 >= 85) {
            System.out.println("Nilai anda C");
        } else if (nilai5 <= 84 && nilai5 >= 80) {
            System.out.println("Nilai anda D");
        } else if (nilai5 <= 79 && nilai5 >= 0) {
            System.out.println("Sayang nilai anda D");
        }
        System.out.println("====================================");
        a=(nilai1+nilai2+nilai3+nilai4+nilai5)/5;
        System.out.print("RATA-RATA: "+a);
        if (a < 101 && a >= 95) {
            System.out.println("(LOLOS)");
        } else if (a <= 94 && a >= 90) {
            System.out.println("(LOLOS)");
        } else if (a <= 89 && a >= 85) {
            System.out.println("(LOLOS)");
        } else if (a <= 84 && a >= 80) {
            System.out.println("(LOLOS)");
        } else if (a <= 79 && a >= 0) {
            System.out.println("(Sayang Kamu Tidaq Lulus)");
        }
            }    
}
