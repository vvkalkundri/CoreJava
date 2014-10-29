package practice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {

	public static void main(String[] args) throws IOException {
		DatagramSocket server = new DatagramSocket(2345);
		
		while (true) {
			byte[] reData = new byte[1024];
			DatagramPacket rePacket = new DatagramPacket(reData, reData.length);
			server.receive(rePacket);
			System.out.println(new String(reData));
			
			byte[] seData = "DOME".getBytes();
			DatagramPacket sePacket = new DatagramPacket(seData, seData.length, rePacket.getAddress(), rePacket.getPort());
			server.send(sePacket);
		}
	}
}
