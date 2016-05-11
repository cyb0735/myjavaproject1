package yanbing.chen.entity;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SocketUDPServer {
	public static void main(String args[]) throws IOException{
		DatagramSocket socket = new DatagramSocket(8800);
		System.out.println("USPserver started waiting for UDPClient data...");
		byte[] data = new byte[1024];
		DatagramPacket packet = new DatagramPacket(data,data.length);
		socket.receive(packet);
		String info = new String(data,0,packet.getLength());
		System.out.println("I'm server:"+info);
		
		/*
		 * response
		 * */
		InetAddress address = packet.getAddress();
		int port = packet.getPort();
		byte[] data2 = "welcome".getBytes();
		DatagramPacket packet2 = new DatagramPacket(data2,data2.length,address,port);
		socket.send(packet2);
		socket.close();
		
	}
}
