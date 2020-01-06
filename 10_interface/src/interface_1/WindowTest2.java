package interface_1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// Frame�� BorderLayout(��������)
public class WindowTest2 extends Frame implements ActionListener  {
	private Button newB, exitB = null;
	private TextArea  area;
    public void init() {
    	newB = new Button("���� �����");
    	newB.addActionListener(this);
    	exitB = new Button("������");
    	exitB.addActionListener(this);
    	area = new TextArea();
    	Panel p = new Panel(); // Flow Layout(������� ��ġ - �߾�)
    	
    	setBounds(700, 200, 300, 400);
    	setVisible(true);
    	p.add(newB);
    	p.add(exitB);
    	this.add("Center", area);
    	this.add("North", p);
    	this.addWindowListener(new WindowExit());
    }
    public static void main(String[] args) {
    	new WindowTest2().init();
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == exitB) System.exit(0);
		else if(e.getSource() == newB) {
			area.setText(" ");
			area.setText("");
		}
	}
	
	
}
