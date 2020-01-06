package nested;

public class AbstractMain {
    public static void main(String[] args) {
    	// 익명 클래스
    	AbstractTest at = new AbstractTest() {
			@Override
			public void setName(String name) {
				
			}
    		
    	};
    	// 인터페이스를 new X 익명 클래스를 new O
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
