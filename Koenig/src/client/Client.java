package client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Client {
	private ClientASCIIScreenControl clientScreen = new ClientASCIIScreenControl();
	
	public void start() {
		Socket serverSocket;
		
//		clientScreen.command("");
		//clientScreen ersetzt Syso
		System.out.println("Bitte geben Sie die Serveradresse ein: ");
		
		
		//String adresse = clientScreen.command("");
		String adresse = Eingabe.get();
		
		try {
			serverSocket = new Socket(adresse, 12345);
			Scanner in = new Scanner(serverSocket.getInputStream());
			PrintWriter out = new PrintWriter(serverSocket.getOutputStream(), true);
			boolean ende = false;
			while(!ende) {
				String steuercode = in.nextLine();
				
				out.println(clientScreen.command(""));
					
				//out.println(Eingabe.get());
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
