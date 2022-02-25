package Helloworld;
import java.util.Scanner;
public class GiaiPT2 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        try {
        System.out.println("Nhap a: ");
        float a =  nhap.nextFloat();
        System.out.println("Nhap b: ");
        float b =  nhap.nextFloat();
        System.out.println("Nhap c: ");
        float c =  nhap.nextFloat();   
        if (a == 0) {
            if (b == 0) {
                if (c == 0){ System.out.println("Phuong trinh vo so nghiem");}
                else { System.out.println("Phuong trinh vo nghiem.");}
            } else {
                System.out.println("Phuong trinh co mot nghiem: "
                        + "x = " + (-c / b));
            }
            return;
        }
        // tính delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phuong trinh co 2 nghiem la: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phuong trinh co nghiem kep: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phuong trinh vo nghiem.");
        }
    }  
       catch  (ArithmeticException e) {
        System.out.print("Tham so khong hop le! ");} 
    }
}
