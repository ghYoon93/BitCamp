package swing;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// JRadioButton의 Default는 사각형
// 만약 원을 선택하면 자동으로 사각형은 해제된다.
// Canvas의 기본색은 연보라색
// x1T, y1T, x2T, y2T 좌표 입력 후 그리기 버튼 누르면 원하는 도형으로 Canvas에 그려진다.

public class MsPaint extends JFrame {
	public final int FRAME_WIDTH = 1280, FRAME_HEIGHT = 960;
	public final int FRAME_X = 180, FRAME_Y = 20;
	private Container con;
    private JLabel x1L, x2L, y1L, y2L, z1L, z2L;
    private JTextField x1T, x2T, y1T, y2T, z1T, z2T;
    public MsPaint() {
    	super("미니 그림판");
    	con = getContentPane();
    	MsPanel northPane = new NorthPanel();
    	con.add("North", northPane.getJPanel());
    	MsPanel southPane = new SouthPanel();
    	con.add("Center", new MsCanvas());
    	con.add("South", southPane.getJPanel());
    	setBounds(FRAME_X,FRAME_Y,FRAME_WIDTH,FRAME_HEIGHT);
    	setVisible(true);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
		new MsPaint();
	}
}
