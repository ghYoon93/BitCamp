package inheritance;

class Test {
	// public: ���
	// protected: ���
	// default
	// private: �ڱ� �ڽ�
	int a, b;
}

public class TestMain {
    public static void main(String[] args) {
    	Test aa = new Test();
    	Test bb = aa;
    	aa.a = 2;
    	aa.b = 5;
    	System.out.println(aa.a+"\t"+aa.b);
    	System.out.println(bb.a+"\t"+bb.b);
    	System.out.println();
    	
    	bb.a = 7;
    	bb.b = 9;
    	System.out.println(aa.a+"\t"+aa.b);
    	System.out.println(bb.a+"\t"+bb.b);
    	
    	bb = new Test();
    	bb.a = 10;
    	bb.b = 20;
    	System.out.println(aa.a+"\t"+aa.b); 
    	System.out.println(bb.a+"\t"+bb.b);
    }
}
