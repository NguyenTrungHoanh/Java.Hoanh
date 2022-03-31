
package Mang;
import java.util.Random;
import java.util.Scanner;
public class Bai4 {
  public static void MangInt(int array[],int n){
    Random random = new Random();
    for(int i=0; i<n;i++)
          array[i] = random.nextInt();   
} 
  public static void XuatMang1(int[] array){
    System.out.println("Mang vua tao: ");
    for(int i=0;i<array.length;i++)        
    {
    System.out.printf(array[i]+" ");}  
  }
  public static void XuatMang2(int[] array){
    System.out.println("\nMang vua tao: ");
    int j=array.length-1;
    for(int i=j;i>=0;i--)        
    {
    System.out.printf(array[i]+" ");}  
  }
  public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("So phan tu cua mang: ");
        n = scanner.nextInt();
        int arr[] = new int[n];
        MangInt(arr,n);
        XuatMang1(arr);
        XuatMang2(arr);
     
  }
}
