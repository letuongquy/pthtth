package tuan1mangjava;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
		System.out.println("Chuong trinh nhap vao thang trong nam");
		System.out.println("Nhap vao thang trong nam: ");
		Scanner scn=new Scanner(System.in);
		int so=scn.nextInt();
		while(so>0) {
			switch(so){
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;
			case 3:
				System.out.println("March");
			}
		}
	}
}
