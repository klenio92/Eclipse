package cursojava.thread;

import javax.swing.JOptionPane;

public class thread {

	public static void main(String[] args) throws InterruptedException {

		Thread threadRunOne = new Thread(thread1);
		threadRunOne.start();

		Thread threadRunTwo = new Thread(thread2);
		threadRunTwo.start();

		JOptionPane.showMessageDialog(null, "Sistema rodando");
	}

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {
			for (int pos = 0; pos < 10; pos++) {
				System.out.println("Executando rotina!");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			for (int pos = 0; pos < 10; pos++) {
				System.out.println("Executando rotina 2!!");

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
}