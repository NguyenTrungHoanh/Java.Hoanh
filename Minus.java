package Helloworld;
import java.util.Random ;
import java.util.Scanner;
public class Minus {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        Random genarator = new Random();
        int a = genarator.nextInt(10);
        int b = genarator.nextInt(10);
        int c;
        if (a>b) 
        { System.out.println(a + "-" + b + "= ?");
                c= a-b;                      }
        else { System.out.println(b + "-" + a + "= ?");
                c=b-a;           }
        System.out.println("Nhap ket qua:");
        int x = nhap.nextInt();
        if (x==c) { System.out.println("Ket qua dung!");}
        else { System.out.println("Ket qua sai!");}
    }
        
}
