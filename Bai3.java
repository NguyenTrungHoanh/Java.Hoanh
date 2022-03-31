
package Mang;
import java.util.Scanner;
import java.util.Random;

public class Bai3 {
  public static void MangInt(int array[],int n){
    Random random = new Random();
    for(int i=0; i<n;i++)
          array[i] = random.nextInt();   
     System.out.println("Mang vua tao: ");
    for(int i=0;i<n;i++)        
    {
    System.out.println(array[i]);}  
}
  
  public static void MangFl(float array[],int n){
    Random random = new Random();
    for(int i=0; i<n;i++)
          array[i] = random.nextInt();
     System.out.println("Mang vua tao: ");
    for(int i=0;i<n;i++)        
    {
    System.out.println(array[i]);}  
  }
  
  public static void TinhTBTS1(int[] array){
      float sum = 1, avr;
      for(int i=0;i<array.length; i++)
          sum *= array[i];
      avr = sum/array.length;
     System.out.println("Trung binh Trong so Int la: "+avr);
      }
  public static void TinhTBTS2(float[] array){
      float sum = 1, avr;
      for(int i=0;i<array.length; i++)
          sum *= array[i];
      avr = sum/array.length;
     System.out.println("Trung binh Trong so Float la: "+avr);
      }
  
  public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("So phan tu cua mang: ");
        n = scanner.nextInt();
        int arr[] = new int[n];
        float arrs[]= new float[n];
        MangInt(arr,n);
        MangFl(arrs,n);
        TinhTBTS1(arr);
        TinhTBTS2(arrs);    
    }
}
 