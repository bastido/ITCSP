package client;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eingabe {
	public static String get() {
		InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);	    
	    try {
			String eingabe = br.readLine();
			return eingabe;
		} catch (IOException e) {			
			e.printStackTrace();
			return null;
		}	    
	}
}
