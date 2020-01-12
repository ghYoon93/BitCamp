package swing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

class JTableModel extends AbstractTableModel{
	Object[][] data = { {"Nari","����ġ",new Integer(1111),"����ģ��"},
						{"One","������",new Integer(1111),"������"},
						{"Two","������",new Integer(1111),"�Ϳ�����"},
						{"Three","�ƶ�ġ",new Integer(1111),"���Ƹ�ģ��"}};
	String[] name = {"���̵�","�̸�","��й�ȣ","����"};
	@Override
	public int getColumnCount() { //���̺� ���� ��
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
