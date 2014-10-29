package com.pranav.socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpClient implements Runnable {

	DatagramSocket client;

	public UdpClient() throws SocketException, UnknownHostException {
		client = new DatagramSocket();
	}

	@Override
	public void run() {
		try {
			byte[] sendData = "PRANAV".getBytes();
			DatagramPacket sendPackat = new DatagramPacket(sendData, sendData.length, InetAddress.getByName("127.0.0.1"),6654);
			client.send(sendPackat);
			
			byte[] receiveData = new byte[1024];
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			client.receive(receivePacket);
			
			System.out.println(new String(receivePacket.getData()));
		} catch (IOException e) {
			System.out.println("Connection error: " + e.getCause());
		}
	}

	public void closeDatagram(){
		if(client != null){
			client.close();
		}
	}
	
	public static void main(String[] args) {
		UdpClient client = null;
		try {
			client = new UdpClient();
			Thread talk = new Thread(client);
			talk.start();
		} catch (SocketException e) {
			System.out.println("Connection error: " + e.getCause());
		} catch (UnknownHostException e) {
			System.out.println("Connection error: " + e.getCause());
		}
	}
}
