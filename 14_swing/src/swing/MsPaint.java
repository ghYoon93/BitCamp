package swing;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// JRadioButton�� Default�� �簢��
// ���� ���� �����ϸ� �ڵ����� �簢���� �����ȴ�.
// Canvas�� �⺻���� �������
// x1T, y1T, x2T, y2T ��ǥ �Է� �� �׸��� ��ư ������ ���ϴ� �������� Canvas�� �׷�����.

public class MsPaint extends JFrame {
	public final int FRAME_WIDTH = 1280, FRAME_HEIGHT = 960;
	public final int FRAME_X = 180, FRAME_Y = 20;
	private Container con;
    private JLabel x1L, x2L, y1L, y2L, z1L, z2L;
    private JTextField x1T, x2T, y1T, y2T, z1T, z2T;
    public MsPaint() {
    	super("�̴� �׸���");
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
