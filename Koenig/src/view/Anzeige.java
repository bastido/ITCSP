package view;
/**
 * 
 */

/**
 * @author Timo
 *
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.Spiel;
import model.Spieler;





public class Anzeige {

	private View				currentView;
	private Map<String, View>	views		= new HashMap<>();
	private ArrayList<Integer>	viewHistory	= new ArrayList<>();
	private Spiel spiel;


	/**Zeigt eine View an. Verfügt über ein Historienhandling.
	 * @param viewString Die View die benutzt werden soll.
	 * @param viewIndex Der Index, der für die View benutzt werden soll.
	 * @param spieler Der Spieler, für den die View benutzt werden soll.
	 * @return Eine Map mit den gültigen Eingaben.
	 */
	public Map<String, String> show( String viewString, int viewIndex, Spieler spieler ) {
		View view = views.get( viewString );

		//falls die "übergebene" View ungleich der letzten View ist oder wenn sie gleich ist und zusätzlich der viewIndex 1 übergeben wurde, 
		//muss die viewHistory gelöscht werden und currentView gesetzt werden
		if ( ( view == currentView && viewIndex == 1 ) || ( view != currentView ) ) {
			this.currentView = view;
			viewHistory.clear();
		}

		//Prüfung, ob per ESC die vorherige View aufgerufen werden soll. Dann muss der letzte Eintrag der History entfernt werden,
		//ansonsten wird der akutelle viewIndex hinzugefügt.
		//ggf. Fehlerscreeens nicht mit eintragen
		try {
			if ( viewHistory.get( viewHistory.size() - 2 ) == viewIndex ) {
				viewHistory.remove( viewHistory.size() - 1 );
			}else{
				viewHistory.add( viewIndex );
			}
		} catch ( IndexOutOfBoundsException e ) {
			viewHistory.add( viewIndex );
			
		}

		if (view instanceof SpielView){
		((SpielView) view ).setSpieler( spieler );
		}
		view.setViewIndex( viewIndex );
		ArrayList<String> ausgabe = view.getScreen();
		// Ausgabemethode fehlt noch
		for ( String s : ausgabe ) {
			System.out.println( s );
		}
		return view.getKeys();

	}
	
	/**Zeigt wieder die vorherige View an.
	 * @return Eine Map mit den gültigen Eingaben.
	 * @throws IndexOutOfBoundsException
	 */
	public Map<String, String> showPreviousView() throws IndexOutOfBoundsException{
		String viewString = currentView.getClass().getName();
		
		int viewIndex = viewHistory.get( viewHistory.size() - 2 );
		Spieler spieler = null;
		if (currentView instanceof SpielView){
			spieler = ((SpielView) currentView ).getSpieler();
			}
		
		return show( viewString, viewIndex, spieler );
	}

	public Map<String, View> getViews() {
		return views;
	}

	public void setViews( Map<String, View> _views ) {
		views = _views;
	}

	public Spiel getSpiel() {
		return spiel;
	}

	public void setSpiel( Spiel _spiel ) {
		spiel = _spiel;
	}

	public View currentView() {
		return currentView;
	}

	public int getLastViewIndex() {
		// den vorherigen Index zurückgeben
		//try catch für IndexOutOfBounds fehlt noch
		return viewHistory.get( viewHistory.size() - 2 );
	}

	
}
