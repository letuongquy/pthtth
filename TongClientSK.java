package baitap;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class TongClientSK {
  public static void main(String[] args) {
	try {
		System.out.println("Day la client!!!!!");
		Socket socket=new Socket("localhost",9999);
		System.out.println("Dang cho ket noi");
		
		DataOutputStream dataOutputStream=new DataOutputStream
				(socket.getOutputStream());
		DataInputStream dataInputStream =new DataInputStream
				(socket.getInputStream());
		
		System.out.println("Nhap so a: ");
		dataOutputStream.writeDouble(new Scanner(System.in).nextDouble());
		dataOutputStream.flush();
		System.out.println("Nhap so b: ");
		dataOutputStream.writeDouble(new Scanner(System.in).nextDouble());
		dataOutputStream.flush();
		
		double tong = dataInputStream.readDouble();
		System.out.println("Ket qua la: "+tong);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
