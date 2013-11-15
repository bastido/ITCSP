package asciikonsole;

import java.awt.Color;

public class ASCIIScreenControl {

	
	private DefaultSettings defaultSettings;
	private ASCIIScreen asciiScreen;

	
	
	public ASCIIScreenControl(){
		this(80, 25);
	}
	
	public ASCIIScreenControl(int _columns, int _rows){
		defaultSettings = new DefaultSettings();
		asciiScreen = new ASCIIScreen(defaultSettings, _columns, _rows);
	}
	
	public void writeASCIISymbol(int _x, int _y, char _symbol){
		asciiScreen.setASCIISymbol(_x,_y,_symbol);
	}
	
	public void writeASCIILine(int lineNumber, String lineContent){
		int width = asciiScreen.getScreenWidth();
		
		for (int i = 0; (i < width) && i < lineContent.length(); i++) {
			asciiScreen.setASCIISymbol(i, lineNumber, lineContent.charAt(i));			
		}
	}
	
	public void resetScreen(){
		asciiScreen.resetScreen();
	}
	
	public void updateScreen(){
		asciiScreen.updateScreen();
	}
	
	public void setBackgroundColor(int _x, int _y, Color _newColor){
		asciiScreen.setBackgroundColor(_x,_y,_newColor);
	}
	
	public void setBackgroundColor(Color _newColor){
		for (int i = 0; i < asciiScreen.getScreenWidth(); i++) {
			for (int j = 0; j < asciiScreen.getScreenHight(); j++) {
				setBackgroundColor(i, j, _newColor);	
			}
		}
	}
	
	public void setASCIIColor(int _x, int _y, Color _newColor){
		asciiScreen.setASCIIColor(_x,_y,_newColor);
	}
	
	public void setASCIIColor(Color _newColor){
		for (int i = 0; i < asciiScreen.getScreenWidth(); i++) {
			for (int j = 0; j < asciiScreen.getScreenHight(); j++) {
				setASCIIColor(_newColor);
				
			}
			
		}
	}

	public void setDefaultBackgroundColor(Color _newColor){
		defaultSettings.setDefaultBackgroundColor(_newColor);
	}
	
	public void setDefaultASCIIColor(Color _newColor){
		defaultSettings.setDefaultASCIIColor(_newColor);
	}

	public String getKey() {
		
		return "";
	}
	
	public String getInt() {
		return "";
	}
	
	public String getString(){
		return "";
	}
	
}
