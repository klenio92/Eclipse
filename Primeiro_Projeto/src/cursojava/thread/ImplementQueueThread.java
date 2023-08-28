package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ImplementQueueThread extends Thread {

	private static ConcurrentLinkedDeque<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedDeque<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}

	@Override
	public void run() {

		while (true) {

			synchronized (pilha_fila) {
				Iterator iteracao = pilha_fila.iterator();

				while (iteracao.hasNext()) {
					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();

					System.out.println("-----------------------------------");
					System.out.println(processar.getNome());
					System.out.println(processar.getEmail());

					iteracao.remove();

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}