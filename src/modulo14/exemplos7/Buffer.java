package modulo14.exemplos7;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {

	private static final int MAX = 10;

	private Queue<Integer> fila = new LinkedList<>();

	public synchronized void produzir(int n) {
		while (this.fila.size() == MAX) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		this.fila.offer(n);
		this.notifyAll();
		this.imprimir();
	}

	public int consumir() {		
		synchronized (this) {
			
			while (this.fila.isEmpty()) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}	
			
			this.notifyAll();
			this.imprimir();
			return this.fila.poll();
		}
	}

	private void imprimir() {
		System.out.print("=> ");

		for (Integer n : this.fila) {
			System.out.print(n + " ");
		}

		System.out.println();
	}
}
