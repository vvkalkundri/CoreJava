package practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(1234);
		while (true) {
			Socket socket = server.accept();
			DataInputStream in = new DataInputStream(socket.getInputStream());
			System.out.println(in.readUTF());

			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			out.writeUTF("Receieved!!");
			socket.close();
		}
	}
}
