package yanbing.chen.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

	/**
	 * tcp intenet transform
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket serverSocket =new ServerSocket(8888);
			System.out.println("server starting...");
			Socket socket =null;
			int count =0;
			while(true){
				socket = serverSocket.accept();
				SocketServerThread serverThread = new SocketServerThread(socket);
				serverThread.start();
				count++;
				System.out.println("client count:"+count);
				InetAddress address = socket.getInetAddress();
				System.out.println("current clientId:"+address.getHostAddress());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
