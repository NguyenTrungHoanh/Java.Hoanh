package Helloworld;
import java.util.Scanner;
public class ChuVi {
	public static void main(String[] args) {
		try 
		{	double c;
			System.out.print("Nhap Ban kinh: ");
			Scanner input = new Scanner(System.in);
			double r = input.nextDouble();
			c = (r+r) * 3.14159;
			System.out.println("Chu vi cua hinh tron co ban kinh " + r + " la " + c); }
		catch (ArithmeticException ex) {
        System.out.print("Ban kinh khong hop le! ");}
	
		}
		}
