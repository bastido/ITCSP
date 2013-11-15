package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Spieler {
	
	
	private String name;
	private String titel;
	private boolean weiblich;
	private int stufe;
	private int gold;
	private int einwohner;
	private Map<Ware, Integer> waren = new HashMap<>();
	private Map<String, Integer> gebauede = new HashMap<>();
	private ArrayList<Laenderei> laenderei = new ArrayList<>();
	private Laenderei[][] land;
	private int genutzteMuehlen;
	private float nahrungsration;
	private int steuersatz;
	private boolean sabotageDurchgefuehrt;
	private ArrayList<String> sabotageMeldungen = new ArrayList<>();
	private String sabotageRueckmeldung;
	private int zufriedenheit;
	private boolean titelErworben;
	private int saettigungsgrad;
	
	public Spieler(String name, String titel){
		this.name = name;
		this.titel = titel;
	}

	public boolean setName(String name){
		return true;
	}
	
	public boolean setGeschlecht(String geschlecht){
		return true;
	}
	
	public int getAnzahlWare(Ware ware){
		return 0;
	}
	
	public void setAnzahlWare(Ware ware, int anzahl){
		
	}
	
	public int getAnzahlGenutzteMuehlen() {
		return 0;
	}

	public void setAnzahlGenutzteMuehlen(int anzahl) {
		
	}
	
	public int getAnzahlMuehlen(){
		return 0;
	}
	 
	public int getAnzahlUngeduengteFelder(){
		return 0;
	}
	
	public int getAnzahlFelder(){
		return 0;
	}
	
	public void setNahrungsration(float ration){
		
	}
	
	public float getNahrungsration(){
		return nahrungsration;
	}
	
	public void setSteuersatz(int satz){
		
	}
	
	public int getSteuersatz(){
		return steuersatz;
	}
	
	public int getGold(){
		return gold;
	}
	
	public void setGold(int anzahl){
		
	}
	
	public int getAnzahlLaenderei(){
		return 0;
	}

	public ArrayList<Laenderei> getLaenderei() {
		return laenderei;
	}
	
	public void addSabotageMeldung(String meldung){
		
	}
	
	public void setSabotageRueckmeldung(String meldung){
		
	}
	
	public String getSabotageRueckmeldung(){
		return sabotageRueckmeldung;
	}
	
	public int getZufriedenheit(){
		return zufriedenheit;
	}
	
	public void setZufriedenheit(int zufriedenheit){
		this.zufriedenheit = zufriedenheit;
	}
	
	public void setSabotageDurchgefuehrt(boolean sabotageDurchgefuehrt){
		
	}
	
	public boolean getSabotageDurchgefuehrt(){
		return true;
	}
	
	public void addGebauedeAnzahl(String gebaudeArt, int anzahl){
		
	}
	
	public int getGebauedeAnzahl(String gebauedeArt){
		return 0;
	}
	
	public boolean hatTitelErworben(){
		return true;
	}
	
	public void setTitelErworben(boolean erworben){
		
	}
	
	public int getStufe(){
		return stufe;
	}
	
	public void setStufe( int stufe){
		this.stufe = stufe;
	}
	
	public int getAnzahlEinwohner(){
		return 0;
	}
	
	public void setAnzahlEinwohner(int anzahl){
		
	}
	
	public String getName(){
		return name;
	}
	
	public void resetFelder(){
		
	}
	
	public void setSaettigungsgrad(int sattigungsgrad){
		
	}
	
	public int berechneZufriedenheit(){
		return zufriedenheit;
		
	}
	
	
	
	
	
}
