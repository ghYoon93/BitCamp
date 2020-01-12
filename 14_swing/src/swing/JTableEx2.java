package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;


public class JTableEx2 extends JFrame implements ActionListener{
	private ArrayList<PersonDTO> list;
	private Vector<String> vector;
	private DefaultTableModel model;
	private JTable table;
	private JButton addButton, removeButton;
	
	public JTableEx2() {
		list = new ArrayList<PersonDTO>();
		list.add(new PersonDTO("Hong","홍길동","111","010-123-1234"));
		list.add(new PersonDTO("Conan","코난","333","010-777-7777"));
		
		String[] title = {"아이디", "이름", "비밀번호", "핸드폰"};
		
		vector = new Vector<String>();
		for(int i = 0; i < title.length; i++) {
			vector.add(title[i]);
		}
		model = new DefaultTableModel(vector, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return column  != 0 ? true:false;
			}
		};
		for(PersonDTO dto : list) {
			vector = new Vector<String>();
			vector.add(dto.getId());
			vector.add(dto.getName());
			vector.add(dto.getPwd());
			vector.add(dto.getTel());
			model.addRow(vector);
		}
		table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table);
		
		addButton = new JButton("추가");
		addButton.addActionListener(this);
		removeButton = new JButton("삭제");
		removeButton.addActionListener(this);
		
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		southPanel.add(addButton);
		southPanel.add(removeButton);
		
		add("Center", scroll);
		add("South", southPanel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,200,300,300);
        setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Scanner scan = new Scanner(System.in);
		if(e.getSource() == addButton) {
			insert();
			
		}else if(e.getSource() == removeButton) {
			remove();
		}
		
	}
	private void remove() {
		String id = JOptionPane.showInputDialog(this, "아이디: ");
		if(id == null) return;
		boolean check = false;
		int i = 0;
		for(i = 0; i < model.getRowCount(); i++) {
			if(id.equals(model.getValueAt(i, 0))){
				check = true;
				break;
			}
		}
		if(!check) {
			JOptionPane.showMessageDialog(this,"아이디가 존재하지 않습니다..");
		}else {
			String pwd = JOptionPane.showInputDialog(this, "비밀번호: ");
			if(pwd.equalsIgnoreCase(table.getValueAt(i, 2).toString())) {
				model.removeRow(i);
				JOptionPane.showMessageDialog(this,"데이터를 삭제했습니다...");
			}else {
				JOptionPane.showMessageDialog(this,"비밀번호가 일치하지않습니다...");
			}
		}
	}
	private void insert() {
		String id = JOptionPane.showInputDialog(this, "아이디: ");
		if(id == null) return;
		for(int i = 0; i < model.getRowCount(); i++) {
			if(id.equals(table.getValueAt(i, 0).toString())){
				JOptionPane.showMessageDialog(this,"아이디가 중복됩니다. 다시 입력해주세요.");
				return;
			}
		}
		
		String name = JOptionPane.showInputDialog(this, "이름: ");
		if(name == null) return;
		String pwd = JOptionPane.showInputDialog(this, "비밀번호: ");
		if(pwd == null) return;
		String tel = JOptionPane.showInputDialog(this, "전화번호: ");
		if(tel == null) return;
		vector = new Vector<String>();
		vector.add(id);
		vector.add(name);
		vector.add(pwd);
		vector.add(tel);
		model.addRow(vector);
		JOptionPane.showMessageDialog(null, "데이터가 추가되었습니다.");

	}
	public static void main(String[] args) {
		new JTableEx2();
	}
}
