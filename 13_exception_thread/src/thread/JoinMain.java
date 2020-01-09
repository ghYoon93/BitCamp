package thread;
class JoinTest implements Runnable {

	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
public class JoinMain {
	public static void main(String[] args) {
		Thread t = new Thread(new JoinTest());
		System.out.println("������ ����");
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("������ ����");
		// ���� �޼ҵ尡 ������ ������� ������� �ʴ´�. ���� �޼ҵ尡 ����Ǿ ��׶��忡�� ������� ���ư���.
	}
}
