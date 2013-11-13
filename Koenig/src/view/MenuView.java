/**
 * 
 */
package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import model.Spiel;

/**
 * @author Timo Schroeder
 *
 */
public class MenuView extends View {

	public MenuView(Spiel spiel){
		this.spiel = spiel;
		generateScreens();
		generateKeys();
//		createStatusAnzeige();
	}
	/* (non-Javadoc)
	 * @see view.View#generateKeys()
	 */
	@Override
	public void generateKeys() {
		addKeys(0, new HashMap<String, String>(){{put( "s", "NEUES_SPIEL_STARTEN"); put( "l", "SPIEL_LADEN"); put( "c", "CREDITS"); put( "b", "PROGRAMM_BEENDEN");}});
//		addKeys(1, new HashMap<String, String>(){{put( "K", "KORN_KAUFEN"); put( "F", "FELD_KAUFEN");}});

	}

	/* (non-Javadoc)
	 * @see view.View#generateScreens()
	 */
	@Override
	public void generateScreens() {
		addScreen(0, createScreen(new ArrayList<>( Arrays.asList( "Neues Spiel (s)tarten", "Spiel (l)aden", "(C)redits", "Programm (b)eenden " ) ), "König - Das Spiel", "Was möchten Sie tun?", 5) );	
//		addScreen(1, createMenuePunktAnsicht(new ArrayList<>( Arrays.asList( "(K)orn      ", "(M)ehl      ", "(D)ünger    ", "(S)oldaten  ", "(L)ändereien" ) ), "Soll gekauft oder verkauf

	}
	
//	protected void createStatusAnzeige(  ) {
////		statusAnzeige.add( "╔══════════════════════════════════════════════════════════════════════════════╗" );
//		statusAnzeige.add( ersteZeile );
//		statusAnzeige.add( "║" + addUmgebendeLeerzeichen( "König, das Spiel" ) + "║" );
//		statusAnzeige.add( "╠══════════════════════════════════════════════════════════════════════════════╣" );
//		statusAnzeige.add( addLeerzeile() );
//		
//
//	}
	
	/**Erstellt einen Screen. Umfasst den gesammten Bereich von der ersten bis zur letzten Zeile (Anweisung/Frage). 
	 * @param menuPunkte Liste mit den Menüpunkten für den Screen
	 * @param titel Der Titel für den Screen
	 * @param anweisung Die Anweisung für die letzte Zeile
	 * @param beginn Ab welcher Stelle soll der Punkt beginnen 
	 * @return Der fertige Screen
	 */
	protected ArrayList<String> createScreen(ArrayList<String> menuPunkte, String titel, String anweisung, int beginn){
		ArrayList<String> ausgabe = new ArrayList<>();
		ausgabe.add( "╔══════════════════════════════════════════════════════════════════════════════╗" );
//		ausgabe.add( generateMenüpunktbeginnzeile( beginn, ende ) );
		ausgabe.add( "║" + addUmgebendeLeerzeichen( titel ) + "║" );
		ausgabe.add( "╠══════════════════════════════════════════════════════════════════════════════╣" );
		ausgabe.add( addLeerzeile() );
		
		for (String menuPunkt: menuPunkte){
			ausgabe.add(generateZeile(beginn - 1, menuPunkt, false));
		}
		
//		ausgabe.add(generateMenüpunktabschlusszeile(beginn, ende));
		ausgabe.addAll(generateLeerzeilen(ausgabe.size()));
		ausgabe.add( anweisung );
		
		return ausgabe;
	}

}
