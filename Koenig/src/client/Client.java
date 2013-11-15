package client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Client {
	public void start() {
		Socket serverSocket;
		
		System.out.println("Bitte geben Sie die Serveradresse ein: ");
		
		String adresse = Eingabe.get();
		
		try {
			serverSocket = new Socket(adresse, 12345);
			Scanner in = new Scanner(serverSocket.getInputStream());
			PrintWriter out = new PrintWriter(serverSocket.getOutputStream(), true);
			boolean ende = false;
			while(!ende) {
				String steuercode = in.nextLine();
				if(steuercode.equals("in")) {
					out.println(Eingabe.get());
				} else if(steuercode.equals("out")) {
					System.out.println(in.nextLine());
				}
			}
			serverSocket.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
	}
}
