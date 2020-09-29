package tuan1mangjava;

import java.util.Scanner;

public class Bai4 {
public static void main(String[] args) {
	System.out.println("Chuong trinh tim so chan hay le");
	System.out.println("Nhap so vao: ");
	Scanner scn =new Scanner(System.in);
	int a= scn.nextInt();
	if(a%2==0) {
		System.out.println("So vua nhap la so chan "+a);
	}
	else {
		System.out.println("So vua nhap la so le "+a);
}
}
}