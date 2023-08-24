package cursojava.thread;

public class thread {

	public static void main(String[] args) {

		new Thread() {
			public void run() {
				for (int pos = 0; pos < 10; pos++) {
					System.out.println("Executando rotina!");

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
		}.start();
		/*--------------------------------------------------------------*/
		new Thread() {
			public void run() {
				for (int pos = 0; pos < 10; pos++) {
					System.out.println("Executando rotina 2!!");

					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
		}.start();

	}

}
