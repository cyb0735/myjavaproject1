package yanbing.chen.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * 
 * 
 * */
public class SocketServerThread extends Thread {
	Socket socket = null;
	public SocketServerThread(Socket socket){
		this.socket = socket;
	}
	
	public void run(){
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStream os = null;
		PrintWriter pw = null;
		
		try {
			is = socket.getInputStream();
		
		 isr = new InputStreamReader(is);
		 br = new BufferedReader(isr);
		String info = null;
		while((info = br.readLine()) != null){
			System.out.println("serve:  client's" +info);
		}
		socket.shutdownInput();
		
		 os = socket.getOutputStream();
		 pw =new PrintWriter(os);
		pw.write("welcome!!!");
		pw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
	try{
		if(pw != null){
		pw.close();}
		if(os != null){
		os.close();}
		if(br != null){
		br.close();}
		if (isr != null){
		isr.close();}
		if (is != null){
		is.close();}
		if (socket != null){
		socket.close();}
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
