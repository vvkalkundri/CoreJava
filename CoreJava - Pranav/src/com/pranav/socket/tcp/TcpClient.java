package com.pranav.socket.tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient implements Runnable{
	
	Socket socket;
	public TcpClient(String ip, int port) throws UnknownHostException, IOException {
		socket = new Socket(ip, port);
	}
	
	@Override
	public void run() {
		try {
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			out.writeUTF("open gate");
			System.out.println("Requst sent to server successfully");
			
			DataInputStream in = new DataInputStream(socket.getInputStream());
			String response = in.readUTF();
			System.out.println(response);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void closeClient() throws IOException{
		if(socket != null)
			socket.close();
	}
	
	public static void main(String[] args) {
		try {
			TcpClient client = new TcpClient("127.0.0.1", 6652);
			Thread work = new Thread(client);
			work.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
