package asciikonsole;

import java.awt.Color;

public class DefaultSettings {

	private Color defaultASCIIColor;
	private Color defaultBackgroundColor;
	
	
	
	
	public Color getDefaultASCIIColor() {
		return defaultASCIIColor;
	}




	public Color getDefaultBackgroundColor() {
		
		return defaultBackgroundColor;
	}




	public void setDefaultBackgroundColor(Color _newColor) {
		defaultBackgroundColor = _newColor;
		
	}
	
	public void setDefaultASCIIColor(Color _newColor){
		defaultASCIIColor = _newColor;
	}
	
}
