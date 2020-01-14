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

public class MsPaint extends JFrame implements ActionListener {
	public final int FRAME_WIDTH = 1280, FRAME_HEIGHT = 960;
	public final int FRAME_X = 180, FRAME_Y = 20;
	private Container con;
	private JButton drawButton, removeButton, revertButton;
	private JCheckBox fillCheckBox;
	private CoordMenu coordMenu;
	private ShapeMenu shapeMenu; 
	private ColorMenu colorMenu;
	private DrCanvas drCanvas;
	
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
    	removeButton = new JButton("��� �����");
    	removeButton.addActionListener(this);
    	revertButton = new JButton("�ǵ�����");
    	revertButton.addActionListener(this);
    	JPanel southPane = new JPanel();
    	southPane.setLayout(new FlowLayout());
    	southPane.add(shapeMenu.getMenu());
    	southPane.add(colorMenu.getMenu());
    	southPane.add(drawButton);
    	southPane.add(removeButton);
    	southPane.add(revertButton);
    	
    	drCanvas = new DrCanvas(this);
    	con = getContentPane();
    	con.add("North", northPane);
    	con.add("Center", drCanvas);
    	con.add("South", southPane);
    	
    	
    	setBounds(FRAME_X,FRAME_Y,FRAME_WIDTH,FRAME_HEIGHT);
    	setVisible(true);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == drawButton) {
//			System.out.println("drawButton");
			draw();
			//draw(��ǥ��, ���� ����, ����, ä��� ����, ĵ����);
		}else if(e.getSource() == removeButton) {
			drCanvas.removeAll();
		}else if(e.getSource() == revertButton) {
			drCanvas.revert();
		}
	}
	public void draw() {
		int x1 = coordMenu.getCoord()[0];
		int x2 = coordMenu.getCoord()[1];
		int y1 = coordMenu.getCoord()[2];
		int y2 = coordMenu.getCoord()[3];
		String shape = shapeMenu.getShape();
		Color color = colorMenu.getColorItem();
		boolean fillCheck = fillCheckBox.isSelected();
		drCanvas.drawByButton(x1, x2, y1, y2, shape, color, fillCheck);
	}
	public JCheckBox getFillCheckBox() {
		return fillCheckBox;
	}
	public ShapeMenu getShapeMenu() {
		return shapeMenu;
	}
	public ColorMenu getColorMenu() {
		return colorMenu;
	}
	public static void main(String[] args) {
		new MsPaint();
	}
	
}