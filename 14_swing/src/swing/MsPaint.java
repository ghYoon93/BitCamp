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

// JRadioButton의 Default는 사각형
// 만약 원을 선택하면 자동으로 사각형은 해제된다.
// Canvas의 기본색은 연보라색
// x1T, y1T, x2T, y2T 좌표 입력 후 그리기 버튼 누르면 원하는 도형으로 Canvas에 그려진다.

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
    	super("미니 그림판");
    	coordMenu = new CoordMenu();
    	fillCheckBox = new JCheckBox("채우기");
    	JPanel northPane = new JPanel();
    	northPane.setLayout(new FlowLayout());
    	northPane.add(coordMenu.getMenu());
    	northPane.add(fillCheckBox);
    	
    	shapeMenu = new ShapeMenu();
    	colorMenu = new ColorMenu();
    	drawButton = new JButton("그리기");
    	drawButton.addActionListener(this);
    	removeButton = new JButton("모두 지우기");
    	removeButton.addActionListener(this);
    	revertButton = new JButton("되돌리기");
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
			//draw(좌표들, 도형 종류, 색상, 채우기 유무, 캔버스);
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