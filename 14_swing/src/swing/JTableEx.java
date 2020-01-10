package swing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

class JTableModel extends AbstractTableModel{
	Object[][] data = { {"Nari","마루치",new Integer(1111),"옆집친구"},
						{"One","오윤아",new Integer(1111),"예쁜이"},
						{"Two","오윤서",new Integer(1111),"귀염둥이"},
						{"Three","아라치",new Integer(1111),"동아리친구"}};
	String[] name = {"아이디","이름","비밀번호","구분"};
	@Override
	public int getColumnCount() { //테이블 열의 수
		return name.length;
	}
	
	public int getRowCount() {
		// TODO Auto-generated method stub
		return data.length;
	}

	public Object getValueAt(int r, int c) {
		// TODO Auto-generated method stub
		return data[r][c];
	}
	public boolean isCellEditable(int r, int c) {
		return (c!=0)? true:false;
	}
	public String getColumNmae(int c) {
		return name[c];
	}
	public void setValueAt(Object obj, int r, int c) {
		data[r][c] = obj;
	}
}
public class JTableEx extends JFrame {
    JTable table;
    JTableModel model;
    public JTableEx() {
    	model = new JTableModel();
        table = new JTable(model);
        add(new JScrollPane(table));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,200,300,300);
        setVisible(true);
    }
    
    public static void main(String[] args) {
		new JTableEx();
	}
}
