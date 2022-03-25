
package VongLap;

import java.util.Random;
import java.util.Scanner;

public class VongLap3 {
     public static void Sum1(int n){
        int s=0;
        for(int i=1; i<=n;i++)
        s += 2*i;
        System.out.println("1. S= 2+4+...2N = " + s);
            }
      public static void Sum2(int n){
        int s=0;
        for(int i=1; i<=n;i++)
            if(i%2==1)
                 s += i;
        System.out.println("2. S= 1+3+5...N = " + s);
            }
      public static void Sum3(int n){
        float s=0;
        for(int i=1; i<=n;i++)
        s += 1/i;
        System.out.println("3. S= 1+1/2+1/3+...1/N = " + s);
            }
      public static void Tich1(int n){
        int p=1;
        for(int i=1; i<=n;i++)
              p *= 2*i;
        System.out.println("1. P  = 2x4x6x...xN = " + p);
            }
      public static void Tich2(int n){
        int p=1;
        for(int i=1; i<=n;i++)
        if (i%2==1)
        p += 1*i;
        System.out.println("3. P =1x3x5x7...xN = " + p);
            }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhap N :");
        n = scanner.nextInt()  ;
        Sum1(n);
        Sum2(n);
        Sum3(n);
        Tich1(n);
        Tich2(n);    
        
    }   
}
