import java.util.Scanner;


public class Main{
    public static void main(String[] args){
         int drc;

         Scanner inp = new Scanner(System.in);
         System.out.print("Bir Sıcaklık Giriniz: ");
         drc = inp.nextInt();


         if (drc <= 5){
            System.out.println("Kayak Yapabilirsin!");
         }
         else if (drc > 5 && drc <= 10) {
            System.out.println("Sinemaya Gidebilirsin!");
         }
         else if (drc > 10 && drc <= 15) {
            System.out.println("Sinemaya ya da Pikniğe Gidebilirsin!");
         }
         else if (drc > 15 && drc <= 25) {
            System.out.println("Pikniğe Gidebilirsin!");
         }
         else {
            System.out.println("Yüzmeye Gidebilirsin!");
         }
    }
}