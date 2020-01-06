package abstract_1;

public class AbstractMain extends AbstractTest{
//	private String name;
	@Override
	public void setName(String name) {
		this.name = name;
	}
	public void test() {
		System.out.println("test");
	}
    public static void main(String[] args) {
//    	AbstractTest at = new AbstractTest();
    	AbstractTest at = new AbstractMain();
    	at.setName("È«±æµ¿");
    	System.out.println("ÀÌ¸§: "+at.getName());
    }
}
