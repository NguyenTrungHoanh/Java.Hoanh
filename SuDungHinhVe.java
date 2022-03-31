
package OOP;
import java.util.Scanner;
public class SuDungHinhVe {
   public static void main(String[] args) {
        HinhTron ht = new HinhTron(12);
        HinhChuNhat hcn = new HinhChuNhat(12,5);
        System.out.println("chu vi hình tròn là : " + ht.tinhChuVi());
        System.out.println("diện tích hình tròn là : " + ht.tinhDienTich());
        System.out.println("chu vi hình chữ nhật là : " + hcn.tinhChuVi());
        System.out.println("diện tích hình chữ nhật là : " + hcn.tinhDienTich());
}}
