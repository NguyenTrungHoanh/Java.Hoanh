
package Mang;
import java.util.Scanner;
public class Bai1 {
  public static void NhapMang(int[] array,int n){
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
        System.out.println("Phan tu thu " + i + ": ");
        array[i] = scanner.nextInt();
  }  System.out.println("Mang vua tao: ");
    for(int i=0;i<n;i++)        
    {
    System.out.println(array[i]);}  
    } 
  public static void TinhTBC(int[] array){
      float sum = 0, avr;
      for(int i=0;i<array.length; i++)
          sum += array[i];
      avr = sum/array.length;
     System.out.println("Trung binh cong la: "+avr);
      }
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("So phan tu cua mang: ");
        n = scanner.nextInt();
     int arr[] = new int[n];
    NhapMang(arr,n);
    TinhTBC(arr);
   
}
  
}
