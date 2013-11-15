package asciikonsole;

import java.awt.Color;

import sun.print.resources.serviceui;

public class ASCII {

	private ASCIIPanel panel;
	private Color color;
	private Color backgroundColor;
	private char asciiSymbol;
	private DefaultSettings defaultSettings;
	
	public ASCII(DefaultSettings _defaultSettings) {
		color = Color.CYAN;
		backgroundColor = Color.BLACK;
		asciiSymbol = ' ';
		defaultSettings = _defaultSettings;
		panel = new ASCIIPanel();
		panel.setBackgroundColor(backgroundColor);
		panel.setColor(color);
		panel.setSymbol(asciiSymbol);
	}

	public ASCIIPanel getASCIIPanel() {
		
		return panel;
	}

	public void setSymbol(char _symbol) {
		asciiSymbol = _symbol;
	}

	public void reset() {
		color = defaultSettings.getDefaultASCIIColor();
		backgroundColor = defaultSettings.getDefaultBackgroundColor();
		asciiSymbol = ' ';
		
	}

	public void update() {
		panel.setBackground(backgroundColor);
		panel.setColor(color);
		panel.setSymbol(asciiSymbol);
		
	}

	public void setBackgroundColor(Color _newColor) {
		backgroundColor = _newColor;
		
	}

	public void setColor(Color _newColor) {
		color = _newColor;
		
	}
	
	

}
