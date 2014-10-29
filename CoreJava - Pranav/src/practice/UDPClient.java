package practice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

	public static void main(String[] args) throws IOException {
		DatagramSocket client = new DatagramSocket();
		byte[] seData = "DEYAAN".getBytes();
		DatagramPacket sePacket = new DatagramPacket(seData, seData.length, InetAddress.getByName("127.0.0.1"), 2345);
		client.send(sePacket);
		
		byte[] reData = new byte[1024];
		DatagramPacket rePacket = new DatagramPacket(reData, reData.length);
		client.receive(rePacket);
		
		System.out.println(new String(reData));
	}
}
