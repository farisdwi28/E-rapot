package tttt1;
import java.util.Scanner;

        class nama extends erapot1{
         private String nama;
         private String kelas;
         public void Setnama (){
             Scanner baca= new Scanner (System.in);
             System.out.print("Nama:");
             nama = baca.nextLine();
             this.nama = nama;
         }
         public void Setkelas (){
             Scanner baca = new Scanner (System.in);
             System.out.print("Kelas:");
             kelas = baca.nextLine();
             this.kelas = kelas;
         }
         public String Getnama(){
             return this.nama;
         }
         public String Getkelas(){
             return this.kelas; 
         }
        }