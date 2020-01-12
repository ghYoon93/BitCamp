package swing;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NorthPanel extends MsPanel{
    public JPanel getJPanel(){
		panel = new JPanel();
		JLabel x1Label = new JLabel();
		JTextField x1F = new JTextField();
		JPanel x1Pane = new JPanel();
		x1Pane.add(x1Label);
		x1Pane.add(x1F);
		x1Pane.setLayout(new FlowLayout());
		panel.add(x1Pane);
		x1Pane.setBounds(0,0,25,25);
		panel.setLayout(new FlowLayout());
		panel.setBounds(0,0,50,50);
//		panel.setBackground(Color.BLACK);
    	return panel;
    }
}
