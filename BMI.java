
package Helloworld;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        try {
        System.out.println("Nhap Weight: ");
        float weight = nhap.nextFloat();
        System.out.println("Nhap Height: ");
        float height = nhap.nextFloat();
        float bmi = weight/(height*height);
        if((bmi>0)&&(bmi<18.5))
        { System.out.print("Underweight");}
        else if (bmi<25) 
        { System.out.print("Normal");}
        else if (bmi<30) 
        { System.out.print("Overweight");}
        else { System.out.print("Obese");}
    }
      catch  (ArithmeticException e) {
        System.out.print("Tham so khong hop le! ");} 
        
}}
