package nested;

public class AbstractMain {
    public static void main(String[] args) {
    	// �͸� Ŭ����
    	AbstractTest at = new AbstractTest() {
			@Override
			public void setName(String name) {
				
			}
    		
    	};
    	// �������̽��� new X �͸� Ŭ������ new O
    	InterA aa = new InterA() {
			@Override
			public void aa() {
			}
			public void bb() {
			}
    	};
    	
    	AbstractExam ae = new AbstractExam() {
    		
    	};
    	
    	
	}
}
