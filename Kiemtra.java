package Helloworld;
import java.util.Scanner;
public class Kiemtra {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap username: ");
        String u =  nhap.nextLine();
        System.out.println("Nhap password: ");
        String p =  nhap.nextLine();
        if ((u=="HuyHoang") && (p=="2021"))
        { System.out.println("Nhap dung!");}
        else System.out.println("Nhap sai!");
    }
    
}