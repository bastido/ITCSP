package asciikonsole;

import java.awt.Color;

public class ASCIIScreen {

	private ASCII[][] screenArea;
	private ASCIIWindow window;
	
	public ASCIIScreen(DefaultSettings defaultSettings, int _columns, int _rows) {
		
		screenArea = new ASCII[_columns][_rows];
		
		for(int i=0; i < _columns;i++){
			
			for(int j = 0; j < _rows;j++){
				
				screenArea[i][j] = new ASCII(defaultSettings);
				
			}
		}
		
		window = new ASCIIWindow(screenArea);
		
		
	}

	public void setASCIISymbol(int _x, int _y, char _symbol) {
		
		screenArea[_x][_y].setSymbol(_symbol);
		
	}

	

	public void resetScreen() {
		
		for (int i = 0; i < screenArea.length; i++) {
			for (int j = 0; j < screenArea[0].length; j++) {
				screenArea[i][j].reset();
				
			}
			
		}
		
	}

	public void updateScreen() {
		for(int i = 0; i < screenArea.length; i++) {
			for (int j = 0; j < screenArea[i].length; j++) {
				screenArea[i][j].update();
				
			}
		}
		
	}

	public void setBackgroundColor(int _x, int _y, Color _newColor) {
		screenArea[_x][_y].setBackgroundColor(_newColor);
		
	}

	public int getScreenHight() {
		
		return screenArea[0].length;
	}

	public int getScreenWidth() {
		
		return screenArea.length;
		
	}

	public void setASCIIColor(int _x, int _y, Color _newColor) {
		screenArea[_x][_y].setColor(_newColor);
		
	}
}
