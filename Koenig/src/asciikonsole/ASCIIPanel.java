package asciikonsole;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ASCIIPanel extends JPanel {

	private JLabel contentLabel;

	public ASCIIPanel() {
		super();

		contentLabel = new JLabel("A");
		contentLabel.setForeground(Color.CYAN);
		contentLabel.setBackground(Color.YELLOW);
		setBounds(0, 0, 16, 25);
		add(contentLabel);
	}

	public void setBackgroundColor(Color _backgroundColor) {
		contentLabel.setBackground(_backgroundColor);
	}
	
	public void setColor(Color _newColor){
		contentLabel.setForeground(_newColor);
	}
	
	public void setSymbol(char _symbol){
		contentLabel.setText(_symbol + "");
	}
	
}
