package com.pranav.socket.tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class TcpServer implements Runnable {

	private ServerSocket serverSocket;
	
	public TcpServer(int port) throws IOException {
		this.serverSocket = new ServerSocket(port);
	}
	@Override
	public void run() {
		while (true) {
			System.out.println("Waitning for client on port " + serverSocket.getLocalPort());
			try {
				Socket socket = serverSocket.accept();
				DataInputStream in = new DataInputStream(socket.getInputStream());
				String data = in.readUTF();
				System.out.println("Received request to " + data);
				
				DataOutputStream out = new DataOutputStream(socket.getOutputStream());
				out.writeUTF("Request to " + data + "served successfully");
				socket.close();
				
				System.out.println("Request served!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		TcpServer tcpServer;
		try {
			tcpServer = new TcpServer(6652);
			ExecutorService service = Executors.newFixedThreadPool(2);
			service.execute(tcpServer);
			service.shutdown();
			service.awaitTermination(1, TimeUnit.MILLISECONDS);
		} catch (IOException e) {
			System.out.println("Unable to server you because of " + e.getMessage());
		} catch (InterruptedException e) {
			System.out.println("Unable to server you because of " + e.getMessage());
		}
	}

}
