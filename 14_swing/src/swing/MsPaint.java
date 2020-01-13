package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

// JRadioButton�� Default�� �簢��
// ���� ���� �����ϸ� �ڵ����� �簢���� �����ȴ�.
// Canvas�� �⺻���� �������
// x1T, y1T, x2T, y2T ��ǥ �Է� �� �׸��� ��ư ������ ���ϴ� �������� Canvas�� �׷�����.

public class MsPaint extends JFrame implements ActionListener{
	public final int FRAME_WIDTH = 1280, FRAME_HEIGHT = 960;
	public final int FRAME_X = 180, FRAME_Y = 20;
	private Container con;
	private JButton drawButton;
	private JCheckBox fillCheckBox;
	private CoordMenu coordMenu;
	private ShapeMenu shapeMenu; 
	private ColorMenu colorMenu;
	private MsCanvas msCanvas;
	
    public MsPaint() {
    	super("�̴� �׸���");
    	coordMenu = new CoordMenu();
    	fillCheckBox = new JCheckBox("ä���");
    	JPanel northPane = new JPanel();
    	northPane.setLayout(new FlowLayout());
    	northPane.add(coordMenu.getMenu());
    	northPane.add(fillCheckBox);
    	
    	shapeMenu = new ShapeMenu();
    	colorMenu = new ColorMenu();
    	drawButton = new JButton("�׸���");
    	drawButton.addActionListener(this);
    	JPanel southPane = new JPanel();
    	southPane.setLayout(new FlowLayout());
    	southPane.add(shapeMenu.getMenu());
    	southPane.add(colorMenu.getMenu());
    	southPane.add(drawButton);
    	
    	msCanvas = new MsCanvas();
    	con = getContentPane();
    	con.add("North", northPane);
    	con.add("Center", msCanvas);
    	con.add("South", southPane);
    	
    	setBounds(FRAME_X,FRAME_Y,FRAME_WIDTH,FRAME_HEIGHT);
    	setVisible(true);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == drawButton) {
			System.out.println("drawButton");
			draw();
			//draw(��ǥ��, ���� ����, ����, ä��� ����, ĵ����);
		}
	}
	public void draw() {
		int[] coordList = coordMenu.getCoord();
		String shape = shapeMenu.getShape();
		Color color = colorMenu.getColor();
		boolean fillCheck = fillCheckBox.isSelected();
		msCanvas.draw(coordList, shape, color, fillCheck);
	}
	public static void main(String[] args) {
		new MsPaint();
	}
}