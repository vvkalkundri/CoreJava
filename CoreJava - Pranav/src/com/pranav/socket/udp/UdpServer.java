package com.pranav.socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpServer implements Runnable {

	DatagramSocket datagramSocket;

	public UdpServer() throws SocketException {
		datagramSocket = new DatagramSocket(6654);
	}

	@Override
	public void run() {
		while (true) {
			System.out.println("Waiting for the UdpClient to connect on port " + datagramSocket.getLocalPort());
			try {
				byte[] receivedData = new byte[1024];
				DatagramPacket receivedPacket = new DatagramPacket(receivedData, receivedData.length);
				datagramSocket.receive(receivedPacket);
				String data = new String(receivedData);
				System.out.println("Server: " + data);
				
				byte[] sentData = ("PROCESSED-" +data).getBytes() ;
				DatagramPacket sentPacket = new DatagramPacket(sentData, sentData.length, receivedPacket.getAddress(), receivedPacket.getPort());
				datagramSocket.send(sentPacket);
			} catch (IOException e) {
				System.out.println("Exception: " + e.getCause());
			}
		}
	}

	public static void main(String[] args) {
		try {
			UdpServer udpServer = new UdpServer();
			Thread server = new Thread(udpServer);
			server.start();
		} catch (SocketException e) {
		}
		
	}
}
