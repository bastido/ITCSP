package model;

import java.util.ArrayList;

public class Spiel 
{
	
	private ArrayList<Spieler> spieler = new ArrayList<Spieler>();
	private Spieler aktuellerSpieler;
	private Markt markt;
	
	public Spiel()
	{
		
	}
		
	public void addSpieler(Spieler _spieler)
	{
		spieler.add(_spieler);
	}
	
	public void initialisiereSpiel()
	{
		
	}
	
	public boolean mahleKorn(int anzahl)
	{	
		return true;
	}
	
	public void erstelleSpieler()
	{
		
	}
	
	public void setAktuellerSpieler(Spieler spieler)
	{
		aktuellerSpieler = spieler;
	}
		
	public ArrayList<Spieler> getSpieler()
	{
		return spieler;
	}


	public void setSpieler(ArrayList<Spieler> _spieler)
	{
		spieler = _spieler;
	}


	public boolean setzeDuengerEin(int anzahl)
	{
		return true;
	}
	
	public boolean baueGebaeude(String gebaeudeart, int anzahl)
	{
		return true;
	}
	
	public boolean zerstoereGebaeude(String gebaeudeart, int anzahl)
	{
		return true;
	}


	public boolean legeNahrungsrationFest(float ration)
	{
		return true;
	}
	
	public boolean aendereSteuersatz(int satz)
	{
		return true;
	}
	
	public boolean fuehreSabotageDurch(Spieler gegner, String sabotageart, int anzahlSoldaten)
	{
		return true;
	}
	
	public boolean entlasseSoldaten(int anzahl)
	{	
		return true;
	}
	
	public boolean kaufeWare(Ware ware, int anzahl)
	{
		
		return true;
	}
	
	public boolean verkaufeWare(Ware ware, int anzahl)
	{
		
		return true;
	}
	
	public void beendeRunde()
	{
		
	}
	
	public void ermittleZufallsereignis()
	{
		
	}
	
	public void aenderePreis()
	{
		
	}
	

}
