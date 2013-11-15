package asciikonsole;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;


public class ASCIIWindow extends JFrame {

	private GridLayout layout;
	private ASCII[][] asciiField;
	
	public ASCIIWindow(ASCII[][] _screenArea) {
		super();
		asciiField = _screenArea;
		
		
		getContentPane().setBackground(Color.WHITE);
		
		initialise(asciiField.length, asciiField[0].length);
		
		
		for (int i = 0; i < asciiField[0].length; i++) {
			System.out.println(i);
			for (int j = 0; j < asciiField.length; j++) {
				getContentPane().add(asciiField[j][i].getASCIIPanel());
				
			}
			
		}
		
		setBounds(0, 0, (_screenArea.length * 16), (_screenArea[0].length * 25));
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	private void initialise(int x, int y){
		layout = new GridLayout(y, x);
		
		getContentPane().setLayout(layout);
	}

}
