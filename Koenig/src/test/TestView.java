package test;

import java.util.ArrayList;
import java.util.Map;

import view.*;
import model.Spiel;
import model.Spieler;

/**
 * 
 */

/**
 * @author Timo Schroeder
 *
 */
public class TestView {

	/**
	 * @param args
	 */
	public static void main( String[] args ) {
		Spiel spiel = new Spiel();
		Spieler spieler = new Spieler("Bauer", "Von der Mauer");
		
		View view = new MenuView(spiel);
		
		show(view, 0, null);
		
		
		
		
	}
	
	public static Map<String, String> show( View view, int viewIndex, Spieler spieler ) {
		
		if (view instanceof SpielView){
		((SpielView) view ).setSpieler( spieler );
		}
		view.setViewIndex( viewIndex );
		ArrayList<String> ausgabe = view.getScreen();
		for ( String s : ausgabe ) {
			System.out.println( s );
		}
		return view.getKeys();

	}

}
