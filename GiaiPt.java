package Helloworld;
import java.util.Scanner;
public class GiaiPt {
   public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        try {
        System.out.print("Nhap a");
         float a =  nhap.nextFloat();
        System.out.print("Nhap b");
        float b =  nhap.nextFloat();
        break;}
        catch  (ArithmeticException e) {
        System.out.print("Tham so khong hop le! ");} 
   if(a==0) {
       if(b==0){System.out.printf("Pt vo so nghiem");}
       else { System.out.printf("Pt vo nghiem");}
   } else {   System.out.printf("Pt co nghiem la: " + (-b/a));}
   } 
   }
       
