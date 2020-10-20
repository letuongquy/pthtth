package baitap;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class TongServerSK {
public static void main(String[] args) {
	System.out.println("Day la Server!!!");
	try {
		ServerSocket server =new ServerSocket(9999);
		
		Socket socket=server.accept();
		System.out.println("Ket noi thanh cong");
		
		DataOutputStream dataOutputStream=new DataOutputStream
				(socket.getOutputStream());
		DataInputStream dataInputStream =new DataInputStream
				(socket.getInputStream());
		
		double so1=dataInputStream.readDouble();
		double so2=dataInputStream.readDouble();
		double tong=so1+so2;
		//System.out.println("ket qua la: ");
		dataOutputStream.writeDouble(tong);
		dataOutputStream.flush();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
