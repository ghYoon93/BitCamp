package constructure;

public class Test {
    private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public boolean equals(Object o) {
		if(o instanceof Test) {
			Test t = (Test) o;
			if(this.id == t.id) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.setId(1);
		Test t2 = new Test();
		t2.setId(1);
		if(t1 == t2)System.out.println("dd");
	}
}

