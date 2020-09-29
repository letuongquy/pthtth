package tuan1mangjava;

import java.util.Scanner;

public class Bai3 {
public static void main(String[] args) {
	System.out.println("Chuong trinh tinh tong");
	Scanner scn=new Scanner(System.in);
	System.out.println("Nhap vao so a= ");
	int a=scn.nextInt();
	System.out.println("Nhap vao so b= ");
	int b=scn.nextInt();
	int s=a+b;
	System.out.printf("Ket qua la: %d",s);
}
}
