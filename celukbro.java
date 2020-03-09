/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tttt1;
import java.util.Scanner;
/**
 *
 * @author faris
 */
public class celukbro {
    public static void main(String[] args) {
        Scanner baca = new Scanner (System.in);
        boolean run =true;
        int jawab;
        while (run){
        raport a = new raport();
        raport b = new raport1();
        raport c = new raport2();
        a.home();
        System.out.print("Masukan Pilihan anda:");
        jawab = baca.nextInt();
        switch (jawab){
            case 1:
                b.home();
                c.home();
            case 2:
                System.out.println("Matur Tengkyu");
                run = false;
        }
        
    }
}
}
