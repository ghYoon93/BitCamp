package network;

public class ProgressBar implements Runnable{
	private StringBuilder bar;
	private static int ii = 0;
	
	public ProgressBar() {
		Thread t = new Thread(this);
		t.start();
		bar = new StringBuilder();
	}
	public static void main(String[] args) {
		new ProgressBar();
	}
	@Override
	public void run() {
		if(ii==100) ii = 0;
		for(int i = ii; i <= 100; i++) {
			if(bar.length() < i) {
				System.out.print("|");
			}

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
