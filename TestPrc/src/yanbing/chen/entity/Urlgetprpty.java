package yanbing.chen.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
public class Urlgetprpty {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// create URL entity through 
			URL url = new URL("http://www.baidu.com");
			// get URL's InoutSteam byte throw URL's openStream function
			InputStream is = url.openStream();
			// transform InputStream into InputStreamReader
			InputStreamReader isr = new InputStreamReader(is,"utf-8");
			//
			BufferedReader br = new BufferedReader(isr);
			String data = br.readLine();
			while(data != null){
				System.out.println(data);
				data = br.readLine();
			}
			br.close();
			isr.close();
			is.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
