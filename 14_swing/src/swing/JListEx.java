package swing;

import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class JListEx extends JFrame {
    public JListEx() {
    	super("JList Test");
    	setLayout(new FlowLayout());
    	String[] listData = {"Hong","Gil","Dong","JAVA","JSP"};
    	JList<String> list1 = new JList<String>(listData);
    	list1.setSelectedIndex(1);
    	
    	DefaultListModel<String> model = new DefaultListModel<String>();
    	JList<String> list2 = new JList<String>(model);
    	model.addElement("사과"); model.addElement("배");
    	model.addElement("딸기"); model.addElement("바나나");
    	list2.setSelectedIndex(1);
    	
    	Vector<String> vListData = new Vector<String>();
    	JList list3 = new JList(vListData);
    	JScrollPane scroll = new JScrollPane(list3);
    	vListData.add("축구");	vListData.add("야구");
    	vListData.add("농구");	vListData.add("배구");
    	vListData.add("테니스");	vListData.add("수영");
    	vListData.add("육상");	vListData.add("태권도");
    	vListData.add("유도");
    	
    	class Student{
    		String id;
    		String name;
    		String department;
    		public Student(String id, String name, String department) {
    			this.id = id;
    			this.name = name;
    			this.department = department;
    		}
    		public String toString() {
    			return name;
    		}
    	}
    	
    	DefaultListModel<Student> model2 = new DefaultListModel<Student>();
    	JList<Student> list4 = new JList<Student>(model2);
    	list4.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    	model2.addElement(new Student("100","홍길동","전산과"));
    	model2.addElement(new Student("200","손오공","건축과"));
    	model2.addElement(new Student("300","사오정","토목과"));
    	model2.addElement(new Student("400","저팔계","경영과"));
    	
    	list4.setSelectedIndex(1);
    	add(list1); add(list2);
    	add(scroll); add(list4);
    	setBounds(300,200,300,200);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
		new JListEx();
	}
}
