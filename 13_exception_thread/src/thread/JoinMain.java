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
		System.out.println("스레드 시작");
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("스레드 종료");
		// 메인 메소드가 끝나도 스레드는 종료되지 않는다. 메인 메소드가 종료되어도 백그라운드에서 스레드는 돌아간다.
	}
}
