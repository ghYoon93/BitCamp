package swing;

import java.awt.Color;

import javax.swing.JPanel;

public class SouthPanel extends MsPanel{
    public JPanel getJPanel() {
    	panel = new JPanel();
    	panel.setBackground(Color.CYAN);
    	return panel;
    }
}
