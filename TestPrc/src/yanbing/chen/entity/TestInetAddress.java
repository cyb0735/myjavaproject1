/**
 * 
 */
package yanbing.chen.entity;

import java.net.InetAddress;
import java.net.UnknownHostException;
public class TestInetAddress {
	public static void main(String args[]) throws UnknownHostException{
		//get local InetAdress
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("computer name:" + address.getHostName());
		System.out.println("local address:" + address.getHostAddress());
		
		//
		
	}
}
