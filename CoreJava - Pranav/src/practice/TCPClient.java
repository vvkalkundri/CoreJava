package practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client = new Socket("127.0.0.1", 1234);
		
		DataOutputStream out = new DataOutputStream(client.getOutputStream());
		out.writeUTF("DEYAAN WANTS TO PLAY");
		
		DataInputStream in = new DataInputStream(client.getInputStream());
		System.out.println(in.readUTF());
	}
}
