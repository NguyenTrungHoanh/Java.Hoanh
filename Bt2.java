package Helloworld;
import java.util.Scanner;
public class Bt2 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        try {
        System.out.print("Nhap a");
        byte a =  nhap.nextByte();
        System.out.print("Nhap b");
        byte b =  nhap.nextByte();
        break;}
        catch  (ArithmeticException e) {
        System.out.print("Tham so khong hop le! ");} 
    System.out.println("a+b="+(a+b));
    System.out.println("a-b="+(a-b));
    System.out.println("a*b="+(a*b));
    System.out.println("a/b="+(a/b));
    System.out.println("a%b="+(a%b));
    System.out.println("a^b="+math.pow(a,b));
           
}}
public class Int {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        try {
        System.out.print("Nhap a");
        int a =  nhap.nextInt();
        System.out.print("Nhap b");
        int b =  nhap.nextInt();
        break;}
        catch  (ArithmeticException e) {
        System.out.print("Tham so khong hop le! ");} 
    System.out.println("a+b="+(a+b));
    System.out.println("a-b="+(a-b));
    System.out.println("a*b="+(a*b));
    System.out.println("a/b="+(a/b));
    System.out.println("a%b="+(a%b));
    System.out.println("a^b="+math.pow(a,b));       
}}
public class Double {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        try {
        System.out.print("Nhap a");
        double a =  nhap.nextDouble();
        System.out.print("Nhap b");
        double b =  nhap.nextDouble();
        break;}
        catch  (ArithmeticException e) {
        System.out.print("Tham so khong hop le! ");} 
    System.out.println("a+b="+(a+b));
    System.out.println("a-b="+(a-b));
    System.out.println("a*b="+(a*b));
    System.out.println("a/b="+(a/b));
    System.out.println("a%b="+(a%b));
    System.out.println("a^b="+math.pow(a,b));       
}}

