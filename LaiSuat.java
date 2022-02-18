package Helloworld;
import java.util.Scanner;
public class LaiSuat {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so tien");
        try { int sotien = (int) nhap.nextDouble();}
        catch  (ArithmeticException e) {
        System.out.print("So tien khong hop le! ");}
        
        System.out.print("Nhap lai suat");
        try { float laisuat = (float) nhap.nextDouble();}
        catch  (ArithmeticException e) {
        System.out.print("Lai suat khong hop le! ");}
        
        System.out.print("Nhap so nam");
        try { int sonam= (int) nhap.nextDouble();}
        catch  (ArithmeticException e) {
        System.out.print("So nam khong hop le! ");}
        float laithang ;
        laithang=sotien*laisuat/(1-(1/(math.pow(1+laisuat,sonam*12))));
        tongiten=sotien+12*sonam*laithang;
        System.out.println("Tien tra theo thang la: "+laithang);
        System.out.println("Tong so tien tra la: "+tongtien);
        }
    }

