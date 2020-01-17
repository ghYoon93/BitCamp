package chat;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Chat extends JFrame {
    public Chat () {
    	Container container = getContentPane();
    	JTextArea output = new JTextArea();
    	output.setEditable(false);
    	JScrollPane scroll = new JScrollPane(output);
    	scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    	container.add("Center", scroll);
    	
    	JPanel southPanel = new JPanel();
    	southPanel.setLayout(new BorderLayout());
    	JTextField input = new JTextField();
    	southPanel.add("Center", input);
    	JButton send = new JButton("Àü¼Û");
    	southPanel.add("East", send);
    	container.add("South", southPanel);
    	
    	setBounds(700,100,516,539);
    	setVisible(true);
    }
}
